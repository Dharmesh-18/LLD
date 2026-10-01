package D10_Person_Builder;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person.PersonBuilder("Dharmesh", "Tiwari")
                .age(27)
                .address("India")
                .build();

        System.out.println(p1);
    }
}
