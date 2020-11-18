package Learning.company;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person();
	    person.setFirstName("Jalal");
        System.out.print("Firstname is = " + person.getFirstName());
        person.setLastName("Seidi");
        System.out.print(" Lastname is = " + person.getLastName());
        person.setAge(25);
        System.out.print( " and I am " + person.getAge() + " years old");
    }
}
