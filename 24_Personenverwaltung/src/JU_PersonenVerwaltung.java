import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JU_PersonenVerwaltung {


    @Test
    void testCreatePerson_FirstName_LastName() {
        //List<Person> l = new ArrayList<Person>();
        Person test = PersonenVerwaltung.createPerson("firstNameRight", "lastNameRight");
        Assertions.assertEquals("firstNameRight lastNameRight", test.getFirstName() + " " + test.getLastName());
    }

    @Test
    void testCreatePerson_FirstName_LastName_Adress() {
        Person test = PersonenVerwaltung.createPerson("firstNameRight", "lastNameRight", "adressRight");
        Assertions.assertEquals("firstNameRight lastNameRight adressRight", test.getFirstName() + " " + test.getLastName() + " " + test.getAdress());
    }

    @Test
    void testCreatePerson_FirstName_Sex_Birthdate() {
        Person test = PersonenVerwaltung.createPerson("firstNameRight", 'M', "01.01.2001");
        Assertions.assertEquals("firstNameRight M 01.01.2001", test.getFirstName() + " " + test.getSex() + " " + test.getBirthdate());
    }

    @Test
    void testCreatePerson_FirstName_LastName_Sex_Birthdate() {
        Person test = PersonenVerwaltung.createPerson("firstNameRight", "lastNameRight", 'M', "01.01.2001");
        Assertions.assertEquals("firstNameRight lastNameRight M 01.01.2001", test.getFirstName() + " " + test.getLastName() + " " + test.getSex() + " " + test.getBirthdate());


    }

    @Test
    void setBirthdayRight() {
        Person test = PersonenVerwaltung.createPerson("firstNameRight", "lastNameRight", 'M', "01.01.2001");
        test.setBirthdate("20.10.2000");
        Assertions.assertEquals("20.10.2000", test.getBirthdate());
    }

    @Test
    void setBirthdayFalse() {
        Person test = PersonenVerwaltung.createPerson("firstNameRight", "lastNameRight", 'M', "01.01.2001");
        test.setBirthdate("2O.1O.2OOO"); //Hierbei handelt es sich um Buchstaben
        Assertions.assertEquals("01.01.2001", test.getBirthdate());
    }

}