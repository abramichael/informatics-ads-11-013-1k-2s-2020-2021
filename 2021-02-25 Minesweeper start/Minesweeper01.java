import java.util.Random;

public class Minesweeper01 {

    public static void main(String[] args) {
        // we store just bombs

        final int rows = 10;
        final int cols = 10;

        // if true - cell has bomb
        boolean [][] hiddenGameField = new boolean[rows][cols];

        generateBombs(hiddenGameField);

        // what we show to player
        char[][] shownGameField = new char[rows][cols];

        initializeGameField(shownGameField);

        printField(shownGameField);

        // generate bombs (random)
        /*
        boolean gameOver = false;
        while (!gameOver) {

            // read action from player
            if (player makes choice){
                check if bomb
                if (bomb)
                    gameOver = true

            } else{
                // player sets the flag
                save the flag
            }
            show_new_field
        }

         */

    }

    private static void printField(char[][] shownGameField) {
        char x = 'A';
        int count = 0;
        System.out.print("   ");
        while (count < shownGameField[0].length) {
            System.out.print(x);
            count += 1;
            x += 1;
        }
        System.out.println();
        count = 1;
        for (char [] row : shownGameField) {
            String count_str = count <= 9 ? count + " |" : count + "|";
            System.out.print(count_str);
            for (char c : row) {
                System.out.print(c);
            }
            count += 1;
            System.out.println();
        }
    }

    private static void initializeGameField(char[][] shownGameField) {
        for (char [] row : shownGameField) {
            for (int i = 0; i < row.length; i++) {
                row[i] = '-';
            }
        }
    }

    private static void generateBombs(boolean[][] hiddenGameField) {
        Random r = new Random();
        for (boolean [] row : hiddenGameField) {
            int i = r.nextInt(row.length);
            row[i] = true;
        }
    }
}
