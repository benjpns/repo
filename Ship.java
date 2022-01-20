import java.util.Arrays;

public class Ship extends tenXfield {
    public static int[][] aircraft = new int[5][2];
    public static int[][] battleship = new int[4][2];
    public static int[][] submarine = new int[3][2];
    public static int[][] cruiser = new int[3][2];
    public static int[][] destroyer = new int[2][2];
    Validate validates = new Validate();
    public static int[][] tempShip;

    public Ship() {

    }

    public void supportFunction(int[] temp, int[] array){
        tempShip = new int[temp.length][2];
        validates = new Validate();
        int count = 0;
        if (validates.positionH(array)) {
            for (int i = 0; i < temp.length; i++) {
                for (int k = 0; k < 1; k++) {
                    tempShip[i][k] = array[0];
                    tempShip[i][k + 1] = temp[count++];
                }
            }
        } else { // positionV
            for (int i = 0; i < temp.length; i++) {
                for (int k = 0; k < 1; k++) {
                    tempShip[i][k + 1] = array[1];
                    tempShip[i][k] = temp[count++];
                }
            }
        }
    }


    public void coordinatesOfShips(int[] temp, int[] array) {
        switch (temp.length) {
            case 5:
                int count = 0;
                if (validates.positionH(array)) {
                    for (int i = 0; i < temp.length; i++) {
                        for (int k = 0; k < 1; k++) {
                            aircraft[i][k] = array[0];
                            aircraft[i][k + 1] = temp[count++];
                        }
                    }
                } else { // positionV
                    for (int i = 0; i < temp.length; i++) {
                        for (int k = 0; k < 1; k++) {
                            aircraft[i][k + 1] = array[1];
                            aircraft[i][k] = temp[count++];
                        }
                    }
                }
                break;
            case 4:
                supportFunction(temp, array);
                System.arraycopy(tempShip, 0, battleship, 0, tempShip.length);
                break;

        }


    }


}
