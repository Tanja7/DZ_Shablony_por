public class PersonBuilder {
    private String name;

    private String surname;

    private int age;

    private String city;

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

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null || name.isEmpty()) throw new IllegalStateException("Не введено имя!");
        else if (surname == null || surname.isEmpty()) throw new IllegalStateException("Не введена фамилия!");
        else if (age < 0 || age > 130) throw new IllegalArgumentException("Указан неправильный возраст!");
        else
            return new Person(name, surname, age, city);
    }

}