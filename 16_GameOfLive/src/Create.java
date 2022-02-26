public class Create {
    public static Boolean[][] create(int sizeX, int sizeY){


        //create new Array with size X and size Y
        Boolean[][] matchField = new Boolean[sizeY][sizeX];
        //filling with random Boolean
        for (int i = 0; i < matchField.length; i++) {
            for (int j = 0; j < matchField[i].length; j++) {
                matchField[i][j] = Math.random() < 0.5; //standard is 0.5
            }
        } return matchField;
    }
}
