public class Validate {
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
        int[] ab = new int[4];
        System.arraycopy(pointAB, 0, ab, 0, pointAB.length);
        int a = pointAB[1];
            if (positionH(pointAB)){ //horizontal check
                if(pointAB[1] < pointAB[3]) {
                    for (int i = 0; i < ship; i++) {
                        a = ab[1]++;
                    }
                    return a == pointAB[3];
                }
                if(pointAB[1] > pointAB[3]) {
                    for (int i = 0; i < ship; i++) {
                        a = ab[1]--;
                    }
                    return a == pointAB[3];
                }
            } else if (positionV(pointAB)) { // vertical check
                if (pointAB[0] < pointAB[2]){
                    for (int i = 0; i < ship; i++) {a =  ab[0]++;}
                    return a == pointAB[2];
                }
                if (pointAB[0] > pointAB[2]){
                    for (int i = 0; i < ship; i++) {a =  ab[0]--;}
                    return a == pointAB[2];
                }

            }
            return true;
    }
}
