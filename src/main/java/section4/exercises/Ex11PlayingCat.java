package section4.exercises;

public class Ex11PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature) {
        boolean isPlaying = false;

        if ((summer && temperature >= 25 && temperature <=45) || (!summer && temperature >= 25 && temperature <= 35)) {
            isPlaying = true;
        }

        return isPlaying;
    }
}
