package i18n;

public class Greeting {
    private final String greet;
    private final Person person;

    public Greeting(String greet, Person person) {
        this.greet = greet;
        this.person = person;
    }

    @Override
    public String toString() {
        return String.join(" ", greet, person.toString());
    }

}
