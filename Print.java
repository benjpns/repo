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
        for (int i = 0; i < fieldRow; i++){
            System.out.print("\n");
            for (int k = 0; k < fieldColumn; k++ ){
                System.out.print(field[i][k] + " ");
            }
        }
    }
}
