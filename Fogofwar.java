import java.util.Locale;
import java.util.Scanner;

enum Status {
    MISSED, MISSILE, REPEAT;
}
public class Fogofwar extends Print {
    public int destroyedCount = 0;
    String[] shot;
    private final String message = "Error! You entered the wrong coordinates! Try again: ";

    public Fogofwar() {
        tenXfield.emptyField();emptyPrint();
        System.out.println("\nTake a shot!");
        shotInput();
        while (destroyedCount != 17) {
            addShot();
        }
    }

    public void addShot() {
        Status status;
        String coords = tenXfield.field[shotCords()[0]][shotCords()[1]];
        try {
            if (coords.equals("O")) {
                status = Status.MISSILE;
            } else {
                status = Status.MISSED;
            }
            if (coords.equals("X")) {
                status = Status.REPEAT;
            }
            switch (status) {
                case MISSILE:
                    tenXfield.field[shotCords()[0]][shotCords()[1]] = "X";
                    tenXfield.emptyField[shotCords()[0]][shotCords()[1]] = "X";
                    emptyPrint();
                    destroyedCount++;
                    if (destroyedCount >= 17) {
                        GameEnds();
                        break;
                    }
                    System.out.println("\nYou hit a ship! Try again: ");
                    shotInput();
                    break;
                case MISSED:
                    tenXfield.field[shotCords()[0]][shotCords()[1]] = "M";
                    tenXfield.emptyField[shotCords()[0]][shotCords()[1]] = "M";
                    emptyPrint();
                    System.out.println("\nYou missed! Try again: ");
                    shotInput();
                    break;
                case REPEAT:
                    emptyPrint();
                    System.out.println("\nYou hit a ship! Try again: ");
                    shotInput();
                    break;
                default:
                    addShot();
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(message);
            Error();
        }
    }

    //PointAB function that converts userinput ex:A1 into number coordinates.
    public int[] shotCords() { //shotCoordinates
        return tenXfield.pointAB(shot);
    }

    public void shotInput() {
        Scanner scan = new Scanner(System.in);
        shot = scan.next().toUpperCase(Locale.ROOT).replaceAll("10", "x").split("");
        try {
            if (shot[0].equals("x"))
                shot[0] = "10";
            if (shot[1].equals("x"))
                shot[1] = "10";
            if (shot.length > 2) {
                System.out.println(message);
                Error();
            }
        } catch (ArrayIndexOutOfBoundsException ignored){
            System.out.println(message);
            Error();
        }
    }

    public void Error() {
        shotInput();
        addShot();
    }

    public void GameEnds() {
        System.out.println("\nYou sank the last ship. You won. Congratulations!");
    }
}