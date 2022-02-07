package section16.challenges.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        //Challenge 1
        Runnable r = () -> {
            String myString = "Let's split this up into array";
            String parts[] = myString.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        //Challenge 2
       Function<String, String> lambdaFunction = (String source) -> {
          StringBuilder returnVal = new StringBuilder();
          for (int i = 0; i < source.length(); i++) {
              if(i%2 == 1) {
                  returnVal.append(source.charAt(i));
              }
          }
           return returnVal.toString();
        };

       //Challenge 3
        lambdaFunction.apply("1234567890");

        //Challenge 5
        String s1 = "1234567890";
        String result = everySecondCharacter(lambdaFunction, s1);
        System.out.println("Method result is - " + result);

        //Challenge 6
        Supplier<String> iLoveJava = () -> "I Love Java";

        //Challenge 7
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        //Challenge 9
        System.out.println("____________ CH 9 ____________");
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> topNames = new ArrayList<>();
        topNames2015.forEach(name -> topNames.add(name.substring(0,1).toUpperCase() + name.substring(1)));
        topNames.sort((name1, name2) -> name1.compareTo(name2));
        topNames.forEach(name -> System.out.println(name));

        //Challenge 10
        System.out.println("_________ CH 10 ____________");
        List<String> ch10Names = new ArrayList<>();
        ch10Names.forEach(name -> topNames.add(name.substring(0,1).toUpperCase() + name.substring(1)));
        topNames.sort(String :: compareTo);
        topNames.forEach(System.out :: println);

        //Challenge11
        System.out.println("_____________ CH 11 __________");
        topNames2015.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted()
                .forEach(System.out :: println);

        //Challenge12
        System.out.println("_____________ CH 12 __________");
        long namesStartWithA = topNames2015.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Number of names that start with A: " + namesStartWithA);

        //challenge 13-14
        System.out.println("_____________ CH 13 __________");
        boolean isKate = topNames2015.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .anyMatch(name -> name.equals("Kate"));

    }

    //challenge 4
    public static String everySecondCharacter(Function<String, String> func, String s) {
        return func.apply(s);
    }
}
