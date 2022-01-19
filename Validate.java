import java.util.Objects;

public class Validate {
    int[] tempSize;

    public Validate(){

    }
    // what position horizontal or vertical
    public boolean positionH(int[] pointAB){
        return pointAB[0] == pointAB[2];
    }
    public boolean positionV(int[] pointAB){
        return pointAB[1] == pointAB[3];
    }

    public boolean size(int[] pointAB, int ship) {
        tempSize = new int[ship];
        int[] ab = new int[4];
        System.arraycopy(pointAB, 0, ab, 0, pointAB.length);
        int a = pointAB[1];
            if (positionH(pointAB)){ //horizontal check
                if(pointAB[1] < pointAB[3]) {
                    for (int i = 0; i < ship; i++) {
                        a = ab[1]++;
                        tempSize[i] = a;
                    }
                    return a == pointAB[3];
                }
                if(pointAB[1] > pointAB[3]) {
                    for (int i = 0; i < ship; i++) {
                        a = ab[1]--;
                        tempSize[i] = a;
                    }
                    return a == pointAB[3];
                }
            } else if (positionV(pointAB)) { // vertical check
                if (pointAB[0] < pointAB[2]){
                    for (int i = 0; i < ship; i++) {
                        a =  ab[0]++;
                        tempSize[i] = a;
                    }
                    return a == pointAB[2];
                }
                if (pointAB[0] > pointAB[2]){
                    for (int i = 0; i < ship; i++) {
                        a =  ab[0]--;
                        tempSize[i] = a;
                    }
                    return a == pointAB[2];
                }

            }
            return true;
    }
    public boolean tooClose(int[][] tempShip) {
         boolean close = false;
        if (positionH(tenXfield.pointAB(tenXfield.array))){
            for (int[] ints : tempShip) {
                if (close) { break; }
                for (int k = 0; k < 1; k++) {
                    try {
                        boolean onTrack = Objects.equals(tenXfield.field[ints[k]][ints[k + 1]], "~");
                        boolean down = Objects.equals(tenXfield.field[ints[k]+1][ints[k + 1]+1], "~");
                        boolean up = Objects.equals(tenXfield.field[ints[k]-1][ints[k + 1]-1], "~");
                        boolean right = Objects.equals(tenXfield.field[ints[k]][ints[k + 1]+1], "~");
                        boolean left = Objects.equals(tenXfield.field[ints[k]][ints[k + 1]-1], "~");
                        if (onTrack && down && up && right && left) {
                            System.out.println("~");
                        } else {
                             close = true;
                        }
                    } catch (ArrayIndexOutOfBoundsException ignored){

                    }
                }
            }
        }

        if (positionV(tenXfield.pointAB(tenXfield.array))){
            for (int[] ints : tempShip) {
                if (close) { break; }
                for (int k = 0; k < 1; k++) {
                    try {
                        try {
                            boolean onTrack = Objects.equals(tenXfield.field[ints[k]][ints[k + 1]], "~");
                            boolean down = Objects.equals(tenXfield.field[ints[k] + 1][ints[k + 1]], "~");
                            boolean up = Objects.equals(tenXfield.field[ints[k] - 1][ints[k + 1]], "~");
                            boolean left = Objects.equals(tenXfield.field[ints[k]][ints[k + 1]-1], "~");
                            boolean right = Objects.equals(tenXfield.field[ints[k]][ints[k + 1]+1], "~");
                            if (onTrack && down && up && left && right) {
                                System.out.println("~");
                            } else {
                                close = true;
                            }
                        } catch (IllegalArgumentException ignored){

                        }

                    } catch (ArrayIndexOutOfBoundsException ignored){

                    }
                }
            }
        }
        return close;
    }
}
