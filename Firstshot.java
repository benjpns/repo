import java.util.Locale;
import java.util.Scanner;

public class Firstshot extends Print {
    //private final int[][] shots = new int[100][2];
    String[] shot;
    private String message = "Error! You entered the wrong coordinates! Try again: ";

    public Firstshot() {
        finalPrint();
        System.out.println("\nTake a shot!");
        shotInput();
        addShot();
    }

    public void addShot() {
        try {
            if (tenXfield.field[shotCords()[0]][shotCords()[1]].equals("O")) {
                tenXfield.field[shotCords()[0]][shotCords()[1]] = "X";
                finalPrint();
                System.out.println("\nYou hit a ship!");
            } else {
                tenXfield.field[shotCords()[0]][shotCords()[1]] = "M";
                finalPrint();
                System.out.println("\nYou missed!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(message);
            Error();
        }
    }

    //Getting firstshot userinput from PointAB function that converts userinput ex:A1 into number coordinates.
    public int[] shotCords() { //shotCoordinates `1
        return tenXfield.pointAB(shot);
    }

    public void shotInput() {
        Scanner scan = new Scanner(System.in);
        shot = scan.next().toUpperCase(Locale.ROOT).replaceAll("10", "x").split("");
        if (shot[0].equals("x"))
            shot[0] = "10";
        if (shot[1].equals("x"))
            shot[1] = "10";
        if (shot.length > 2) {
            System.out.println(message);
            Error();
        }
    }

    public void Error() {
        shotInput();
        addShot();
    }
}
