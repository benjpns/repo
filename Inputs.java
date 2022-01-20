import java.util.Scanner;

public class Inputs   {
    public static String[] shipNames = new String[4];
    public static String cells;
    public static Scanner input;

    public Inputs() {
        function();
    }

    public  void function() {
        input = new Scanner(System.in);
        shipNames = new String[]{"Aircraft carrier", "Battleship", "Submarine", "Cruiser", "Destroyer"};

        for (int i = 0; i < shipNames.length; i++) {
            cells = i == 0 ? "5" : i == 1 ? "4" : i == 2 || i == 3 ? "3" : "2";
            System.out.printf("%nEnter the coordinates of %s (%s cells): ", shipNames[i], cells);
            new tenXfield(input.nextLine(), Integer.parseInt(cells));
            tenXfield.addShip();
        }
    }

     static void function(int shipNum, String message) {
        cells = java.lang.String.valueOf(shipNum);
        System.out.printf("%n%s", message);
         new tenXfield(input.nextLine(), Integer.parseInt(cells));

    }
}
