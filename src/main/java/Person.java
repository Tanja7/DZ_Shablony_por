import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public boolean hasAge() {
        if (getAge().isPresent()) {
            return true;
        } else {
            return false;
        }
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAddress() {
        if (getCity() == null || getCity().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " из города " + getCity() + " " + age + " лет";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    //  метод для получения полузаполненного билдера для ребёнка в класс Person
    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(this.surname);
        childBuilder.setAge(0);
        childBuilder.setCity(this.city);
        return childBuilder;
    }
}



