import java.util.Arrays;

public class Ship {
    public static int[][] aircraft = new int[5][2];
    public static int[][] battleship = new int[4][2];
    public static int[][] submarine = new int[3][2];
    public static int[][] cruiser = new int[3][2];
    public static int[][] destroyer = new int[2][2];

    public Ship() {

    }

    public void coordinatesOfShips(int[] temp, int[] array) {
        Validate validates = new Validate();
        switch (temp.length) {
            case 5:
                int count = 0;
                if (validates.positionH(array)) {
                    for (int i = 0; i < temp.length; i++) {
                        for (int k = 0; k < 1; k++) {
                            aircraft[i][k] = array[0];aircraft[i][k + 1] = temp[count++];
                        }
                    }
                } else { // positionV
                    for (int i = 0; i < temp.length; i++) {
                        for (int k = 0; k < 1; k++) {
                            aircraft[i][k + 1] = array[1];aircraft[i][k] = temp[count++];
                        }
                    }
                    System.out.println(Arrays.deepToString(aircraft));
                }
                break;
            case 4:
                break;
               /* count = 0;
                if (validates.positionH(array)) {
                    for (int i = 0; i < temp.length; i++) {
                        for (int k = 0; k < 1; k++) {
                            battleship[i][k] = array[0];
                            battleship[i][k + 1] = temp[count++];
                        }
                    }
                    System.out.println(Arrays.deepToString(battleship));
                }*/

        }


    }


}
