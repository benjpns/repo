import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public  class Players extends tenXfield {

    private final String name;
    private final StringBuilder txtMatter = new StringBuilder();
    private boolean submarine = false;
    public  Players(String name){
        this.name = name;
        assignShip();
        Print print = new Print();
        print.fPrint();
        new Inputs();
        new FileExist();
        CreatePlayerFile();
    }

    public void CreatePlayerFile() {
        try {
             File myObj = new File(name +".txt");
             String filePath = myObj.getAbsolutePath();

            System.out.println(filePath);
            if (myObj.createNewFile()) {
                System.out.println("\nFile created: " + myObj.getName());
                try {
                    shipArrayToTextFile(Ship.aircraft.length);
                    txtMatter.append("\n");
                    shipArrayToTextFile(Ship.battleship.length);
                    txtMatter.append("\n");
                    shipArrayToTextFile(Ship.submarine.length);
                    txtMatter.append("\n");
                    shipArrayToTextFile(Ship.cruiser.length);
                    txtMatter.append("\n");
                    shipArrayToTextFile(Ship.destroyer.length);
                } catch (IOException e){
                    e.printStackTrace();
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void shipArrayToTextFile(int length) throws IOException {
        FileWriter fileWriter = new FileWriter("Player1.txt");
        for (int i = 0;  i < length; i++ ){
            if (i>0) txtMatter.append(";");
            for (int k = 0; k <= 1; k++){
                String coma = k == 0? ",": "";
                switch (length){
                    case 5:
                        txtMatter.append(Ship.aircraft[i][k]).append(coma);
                        break;
                    case 4:
                        txtMatter.append(Ship.battleship[i][k]).append(coma);
                        break;
                    case 3:
                        //todo fix this
                        txtMatter.append(Ship.submarine[i][k]).append(coma);
                        txtMatter.append(Ship.cruiser[i][k]).append(coma);
                    case 1:
                        txtMatter.append(Ship.destroyer[i][k]).append(coma);
                        break;
                }
            }
        }
        fileWriter.write(String.valueOf(txtMatter));
        fileWriter.close();
    }
}

class FileExist {
    public FileExist()  {
        try {
            File player1 = new File("Player1.txt");
            File player2 = new File("Player2.txt");
            player1.delete();
            player2.delete();
        } catch (NullPointerException ignored){
        }

    }
}
