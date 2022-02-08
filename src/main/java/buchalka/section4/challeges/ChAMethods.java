package buchalka.section4.challeges;

public class ChAMethods {
    public static void main(String[] args) {
        int playerPosition;

        int player1Score = 1500;
        String player1Name = "John Doe";

        int player2Score = 900;
        String player2Name = "John Smith";

        int player3Score = 400;
        String player3Name = "Joan Doe";

        int player4Score = 50;
        String player4Name = "Peter Doe";

        playerPosition = calculateHighScorePosition(player1Score);
        displayPlayerPosition(player1Name, playerPosition);

        playerPosition = calculateHighScorePosition(player2Score);
        displayPlayerPosition(player2Name, playerPosition);

        playerPosition = calculateHighScorePosition(player3Score);
        displayPlayerPosition(player3Name, playerPosition);

        playerPosition = calculateHighScorePosition(player4Score);
        displayPlayerPosition(player4Name, playerPosition);

    }

    public static void displayPlayerPosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore > 1000)
            return 1;
        if (playerScore > 500 && playerScore < 1000)
            return 2;
        if (playerScore > 100 && playerScore < 500)
            return 3;
        return 4;
    }
}
