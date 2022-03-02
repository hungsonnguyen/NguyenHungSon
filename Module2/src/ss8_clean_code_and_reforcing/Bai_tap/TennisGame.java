package ss8_clean_code_and_reforcing.Bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int ScorePlayer1, int ScorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (ScorePlayer1 == ScorePlayer2) {
            score = getScoreForPalyer(ScorePlayer1);
        } else if (ScorePlayer1 >= 4 || ScorePlayer2 >= 4) {
            int minusResult = ScorePlayer1 - ScorePlayer2;
            boolean advantagePlayer1 = minusResult == 1;
            boolean advantagePlayer2 = minusResult == -1;
            boolean winForPlayer1 = minusResult >= 2;
            if (advantagePlayer1) score = "Advantage player1";
            else if (advantagePlayer2) score = "Advantage player2";
            else if (winForPlayer1) score = "Win for player1";
            else score = "Win for player2";


        } else {
            score = getScore(ScorePlayer1, ScorePlayer2, score);
        }
        return score;
    }

    private static String getScore(int ScorePlayer1, int ScorePlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = ScorePlayer1;
            else {
                score += "-";
                tempScore = ScorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getScoreForPalyer(int ScorePlayer1) {
        String score;
        switch (ScorePlayer1) {
            case 0:
                score = "Love - Love";
                break;
            case 1:
                score = "Fifteen - Love";
                break;
            case 2:
                score = "Thirty - Thirty";
                break;
            case 3:
                score = "Forty - Forty";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
