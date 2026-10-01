package D10_Person_Builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + ", Age:" + age + ", Address:" + address;
    }

    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String address;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
