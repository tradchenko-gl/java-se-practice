package section16.challenges.lambda;

import java.util.function.Function;

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

        //challenge 4
    }
}
