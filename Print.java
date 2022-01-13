public class Print extends tenXfield {

    public Print() {

    }
    public void firstPrint(){
        for (int i = 0; i < fieldRow; i++){
            System.out.print("\n");
            for (int k = 0; k < fieldColumn; k++ ){
                System.out.print(field[i][k] + " ");
            }
        }
    }

    public void firstPrint(int[][] ship){
        for (int i = 0; i < Ship.aircraft.length; i++){
            for (int j = 0; j < 1; j++){
                field[Ship.aircraft[i][j]][Ship.aircraft[i][j+1]] = "O";
            }
        }
        for (int i = 0; i < fieldRow; i++){
            System.out.print("\n");
            for (int k = 0; k < fieldColumn; k++ ){
                System.out.print(field[i][k] + " ");
            }
        }
    }


}
