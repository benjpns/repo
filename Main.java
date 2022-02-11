

public class Main extends tenXfield {
    public static void main(String[] args) {
        assignShip();
        Print print = new Print();
        print.fPrint();
        new Inputs();
        Players play = new Players("Player1");
        System.out.println("\nThe game starts!");
        new Fogofwar();


    }
}
