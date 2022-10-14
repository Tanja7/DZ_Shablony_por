public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setCity("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        mom.happyBirthday();
        System.out.println("У " + mom + " есть сын, " + son);

        Person dad = new PersonBuilder()
                .setName("Антон")
                .setSurname("Иванов")
                .setAge(350)
                .setCity("Москва")
                .build();
        Person son1 = dad.newChildBuilder()
                .setName("Игорь")
                .build();
        System.out.println("У " + dad + " есть сын, " + son1);
    }
}
