package academy.obicco;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            return score + (levelCompleted * bonus);
        } else return -1;
    }
}