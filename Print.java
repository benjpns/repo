public class Print extends tenXfield {

    public Print() {
        for (int i = 0; i < fieldRow; i++){
            System.out.print("\n");
            for (int k = 0; k < fieldColumn; k++ ){
                System.out.print(field[i][k] + " ");
            }
        }
    }
}
