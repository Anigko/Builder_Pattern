public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(this);
            if (name.isEmpty()) {
                throw new IllegalStateException("Поле Имя должно быть заполнено");
            }
            if (surname.isEmpty()) {
                throw new IllegalStateException("Поле Фамилия должно быть заполнено");
            }
            if (age < 0) {
                throw new IllegalArgumentException("Возраст должен быть больше нуля");
            }
        return person;
    }
}
