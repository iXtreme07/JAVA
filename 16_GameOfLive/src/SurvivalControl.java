public class SurvivalControl {
    public static Boolean[][] survivalControl(Boolean[][] matchField) {
        Boolean[][] matchfieldNew = new Boolean[matchField.length][matchField[0].length];

        for (int i = 0; i < matchField.length; i++) {
            for (int j = 0; j < matchField[i].length; j++) {


                int counter = checkAround(matchField, j, i);


                switch (counter) {
                    case 0, 1:
                        matchfieldNew[i][j] = false;
                        break;
                    case 2:
                        if (matchField[i][j]) {
                            matchfieldNew[i][j] = true;
                        } else {
                            matchfieldNew[i][j] = false;
                        }
                        break;
                    case 3:
                        matchfieldNew[i][j] = true;
                        break;
                    case 4, 5, 6, 7, 8:
                        matchfieldNew[i][j] = false;
                        break;
                }
            }
        }
        return matchfieldNew;
    }


    public static int checkAround(Boolean[][] matchField, int coordinateX, int coordinateY) {
        int counter = 0;

        /*
        Aufteilung:
        |1|2|3| This is X
        |4|X|5|
        |6|7|8|

        This is Y
         */
        {
            try {
                if (matchField[coordinateY - 1][coordinateX - 1]) {    //1
                    counter++;
                }
            } catch (Exception ignored) {
            }
            try {
                if (matchField[coordinateY - 1][coordinateX]) {    //2
                    counter++;
                }
            } catch (Exception ignored) {
            }
            try {
                if (matchField[coordinateY - 1][coordinateX + 1]) {    //3
                    counter++;
                }
            } catch (Exception ignored) {
            }
            try {
                if (matchField[coordinateY][coordinateX - 1]) {    //4
                    counter++;
                }
            } catch (Exception ignored) {
            }
            try {
                if (matchField[coordinateY][coordinateX + 1]) {    //5
                    counter++;
                }
            } catch (Exception ignored) {
            }
            try {
                if (matchField[coordinateY + 1][coordinateX - 1]) {    //6
                    counter++;
                }
            } catch (Exception ignored) {
            }
            try {
                if (matchField[coordinateY + 1][coordinateX]) {    //7
                    counter++;
                }
            } catch (Exception ignored) {
            }
            try {
                if (matchField[coordinateY + 1][coordinateX + 1]) {    //8
                    counter++;
                }
            } catch (Exception ignored) {
            }
            return counter;
        }
    }
}


