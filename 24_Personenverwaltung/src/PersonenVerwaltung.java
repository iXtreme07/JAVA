import java.util.ArrayList;
import java.util.List;

public class PersonenVerwaltung {
    static List<Person> l = new ArrayList<Person>();

    public static void main(String[] args) {

        createPerson("Max", "Bockel");
        createPerson("Max", "Moriz");
        createPerson("Max", 'x', "11.11.1588");
        createPerson("Max", 'W', "15.01.1988");
        createPerson("Max", "JaDerDa", 'M', "01.01.2001");
        createPerson("Max", 'M', "10.10.1010");
        createPerson("Max", "Mustermann", "Musterstraße 1234");

        displayPersonList();
        deleteIndex(3);


        displayPersonList();
        deleteAll();
        displayPersonList();
    }

    static Person createPerson(String firstName, String lastName) {

        Person temp = new Person();
        temp.setFirstName(firstName);
        temp.setLastName(lastName);
        l.add(temp);
        return temp;
    }

    static Person createPerson(String firstName, String lastName, String adress) {

        Person temp = new Person();
        temp.setFirstName(firstName);
        temp.setLastName(lastName);
        temp.setAdress(adress);
        l.add(temp);
        return temp;
    }

    static Person createPerson(String firstName, char sex, String birthdate) {
        Person temp = new Person();
        temp.setFirstName(firstName);
        temp.setSex(sex);
        temp.setBirthdate(birthdate);
        l.add(temp);
        return temp;
    }

    static Person createPerson(String firstName, String lastName, char sex, String birthdate) {
        Person temp = new Person();
        temp.setFirstName(firstName);
        temp.setLastName(lastName);
        temp.setSex(sex);
        temp.setBirthdate(birthdate);
        l.add(temp);
        return temp;
    }

    static void deleteAll() {
        if (l.size() == 0) {
            return;
        }
        while (l.size() != 0) {
            l.remove(0);
        }
    }

    static Person deleteIndex(int index) {
        if (l.size() == 0) {
            System.out.println("Remove not possible in a empty List");
        } else if (l.size() >= index + 1) {
            Person temp = l.get(index);
            l.remove(index);
            return temp;
        } else if (l.size() == index + 1) {
            Person temp = l.get(index);
            l.remove(index);
            return temp;
        }
        else {
            System.out.println("nothing to remove");
        }
        return null;
    }

    static void displayPersonList() {

        if (l.size() == 0) {
            System.out.println("--List is Empty--");
            return;
        }
        for (int i = 0; i < l.size(); i++) {

            System.out.print((i + 1) + ": First Name: " + l.get(i).getFirstName());

            if (l.get(i).getLastName() != null) {
                System.out.print(", Last Name: " + l.get(i).getLastName());
            }
            if (l.get(i).getSex() != 0) {
                enum Sex {
                    man,
                    woman,
                    diverse
                }
                if (l.get(i).getSex() == 'M' || l.get(i).getSex() == 'm') {
                    System.out.print(", Sex: " + Sex.man);
                } else if (l.get(i).getSex() == 'W' || l.get(i).getSex() == 'w' || (l.get(i).getSex() == 'f' || l.get(i).getSex() == 'F')) {
                    System.out.print(", Sex: " + Sex.woman);
                } else {
                    System.out.print(", Sex: " + Sex.diverse);
                }
            }
            if (l.get(i).getBirthdate() != null) {
                System.out.print(", Birthdate: " + l.get(i).getBirthdate());
            }
            if (l.get(i).getAdress() != null)
                System.out.print(", Adress: " + l.get(i).getAdress());
            System.out.println();
        }
        System.out.println();
    }

}
