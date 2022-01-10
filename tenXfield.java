import java.util.Arrays;

public class tenXfield {
    public static final int fieldColumn = 11;
    public static final int fieldRow = 11;
    char rowField = 65;
    public static final String[][] field = new String[fieldColumn][fieldRow];

    public tenXfield() {
        for (int i = 0; i < fieldRow; i++) {
            for (int k = 0; k < fieldColumn; k++) {
                if (i == 0 && k == 0) field[i][k] = " ";
                if (i == 0 && k > 0) {
                    field[i][k] = k+"";
                }
                if (i > 0) field[i][k] = "~";
                if (i > 0 && k == 0) {
                    field[i][k] = String.valueOf(rowField++);
                }
            }
        }
    }
    public tenXfield(String coordinates, int ship) {
        String[] array = coordinates.toUpperCase().replaceAll("10", "x").replaceAll(" ", "").split("");
        if (array[1].equals("x")){array[1] = "10";}
        if (array[3].equals("x")){array[3] = "10";}

        Validate validate = new Validate();
        if (!validate.size(pointAB(array), ship)) {
            int sizeName = Inputs.shipNames.length - ship;
            String message = String.format("Error! Wrong length of the %s! Try again: ", Inputs.shipNames[sizeName]);
            Inputs.function(ship, message);
        }
        if (!validate.positionH(pointAB(array)) && !validate.positionV(pointAB(array))){
            Inputs.function(ship,"Error! Wrong location! Try again: ");
        }
    }

    public int[] pointAB(String[] userInput){
        String alpha ="OABCDEFGHIJ";
        int[] numericValue = new int[userInput.length];
        for (int i = 0; i < userInput.length; i++){
            numericValue[i] = i % 2 ==0 ? alpha.indexOf(userInput[i]): Integer.parseInt(userInput[i]);
        }
        return numericValue;
    }

}
