import java.util.Scanner;

public class Main extends tenXfield {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        assignShip();
        Print print = new Print();
        print.fPrint();
        new Inputs();
        //firstshot
        System.out.println("\nThe game starts!");
        new Firstshot();


    }
}
