import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: Person")
public class PersonTest {

    private Person person = new Person("Анна", "Фатеева", 32, "Москва");
    private Person person1 = new Person("Анна", "Фатеева");

    @Test
    @DisplayName("Тестирование метода проверки указания возраста 1")
    void hasAge() {
        person.hasAge();
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Тестирование метода проверки указания возраста 2")
    void hasAge1() {
        person1.hasAge();
        Assertions.assertFalse(false);
    }

    @Test
    @DisplayName("Тестирование метода увеличения возраста")
    void happyBirthday() {
        person.happyBirthday();
        Assertions.assertEquals(33, person.age);
    }

    @Test
    @DisplayName("Тестирование метода проверки указания города 1")
    void hasAddress() {
        person.hasAddress();
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Тестирование метода проверки указания города 2")
    void hasAddress1() {
        person1.hasAddress();
        Assertions.assertFalse(false);
    }
}
