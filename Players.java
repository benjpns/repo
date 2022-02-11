import java.io.File;
import java.io.IOException;

public  class Players {

    private final String name;
    public  Players(String name){
        this.name = name;
        CreatePlayerFile();

    }

    public void CreatePlayerFile() {
        try {
            File myObj = new File(name +".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }




}
