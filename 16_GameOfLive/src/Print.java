public class Print {
    public static void print(Boolean[][] matchField) {
        for (int i = 0; i < matchField.length; i++) {
            for (int j = 0; j < matchField[i].length; j++) {

                if (matchField[i][j]) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" . ");
                }

            }
            System.out.println();
        }
    }
}
