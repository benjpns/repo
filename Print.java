public class Print extends tenXfield {

    public Print() {
    }

    public void fPrint() {
        for (int i = 0; i < fieldRow; i++) {
            System.out.print("\n");
            for (int k = 0; k < fieldColumn; k++) {
                System.out.print(field[i][k] + " ");
            }
        }
    }

    public void fPrint(int length) {
        switch (length) {
            case 5:
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < 1; j++) {
                        field[Ship.aircraft[i][j]][Ship.aircraft[i][j + 1]] = "O";
                    }
                }
                break;
            case 4:
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < 1; j++) {
                        field[Ship.battleship[i][j]][Ship.battleship[i][j + 1]] = "O";
                    }
                }
                break;
            case 3:
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < 1; j++) {
                        field[Ship.submarine[i][j]][Ship.submarine[i][j + 1]] = "O";
                    }
                }
                break;
            case 2:
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < 1; j++) {
                        field[Ship.cruiser[i][j]][Ship.cruiser[i][j + 1]] = "O";
                    }
                }
                break;
            case 1:
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < 1; j++) {
                        field[Ship.destroyer[i][j]][Ship.destroyer[i][j + 1]] = "O";
                    }
                }
                break;
        }
        finalPrint();
    }
    public void finalPrint(){
        for (int i = 0; i < fieldRow; i++) {
            System.out.print("\n");
            for (int k = 0; k < fieldColumn; k++) {
                System.out.print(field[i][k] + " ");
            }
        }
    }


}
