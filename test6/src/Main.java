import java.util.Random;

public class Main {
    public static void main(String[] args) {

            int size = 8;
            Random random = new Random();
            int colors[][] = new int[size][size];
            for (int i = 0; i < 8; i++) {
                for( int j = 0; j < 8; j++) {
                    colors[i][j] = random.nextInt(256);
                    System.out.format("%4d", colors[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            int[][] rotatedColors = new int[size][size];
            for (int i = 0; i < colors.length; i++) {
                for (int j =0; j < colors.length; j++) {
                    rotatedColors[i][j] = colors[colors.length - j - 1][i];
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }

        }

    }
