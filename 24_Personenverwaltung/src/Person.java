public class Person {


    private String firstName;
    private String lastName;
    private String birthdate;
    private String adress;
    private char sex;


    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) {
        if (firstName.length() <= 1 || firstName.length() > 50) {
            System.out.println("ERROR!!! --> " + firstName + " is not Possible to add! (Min 2, Max 50 Chars)");
            return false;
        }
        this.firstName = firstName;
        return true;
    }

    public String getLastName() {

        return lastName;
    }

    public boolean setLastName(String lastName) {

        if (lastName.length() <= 1 || lastName.length() > 50) {
            System.out.println("ERROR!!! --> " + lastName + " is not Possible to add! (Min 2, Max 50 Chars)");
            return false;
        }
        this.lastName = lastName;
        return true;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public boolean setBirthdate(String birthdate) {
        String numbers = birthdate;
        try {
            if (numbers.length() == 10) {
                String[] split = numbers.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    Integer.parseInt(split[i]);
                }
                this.birthdate = birthdate;
                return true;
            }
            System.out.println("Not possible. Please take: TT.MM.JJJJ! Example: 01.01.2001" );
            return false;
        } catch (NumberFormatException e) {
        }
        return false;
    }

    public char getSex() {
        return sex;
    }

    public boolean setSex(char sex) {
        if (sex != 0) {
            this.sex = sex;
            return true;
        }
        return false;
    }

    public String getAdress() {
        return adress;
    }

    public boolean setAdress(String adress) {
        if (adress != null|| adress != "") {
            this.adress = adress;
            return true;
        }
        return false;
    }

}