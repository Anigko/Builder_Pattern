public class Person {

    protected final String name; // обязательное
    protected final String surname; // обязательное
    private int age;
    private String address;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Имя: ");
        sb.append(name);
        sb.append("\n");
        sb.append("Фамилия: ");
        sb.append(surname);
        sb.append("\n");
        sb.append("Возраст: ");
        sb.append(age);
        sb.append("\n");
        sb.append("Адрес: ");
        sb.append(address);
        sb.append("\n");
        sb.append("\n");

        return sb.toString();
    }
}
