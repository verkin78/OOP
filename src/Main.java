public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Максим", "Минск", 1988,
        Person person2 = new Person("Аня", "Москва", 1993,
        Person person3 = new Person("Катя", "Калининград", 1992,
        Person person4 = new Person("Артём", "Москва", 1995,
        Person person5 = new Person(null, null, -1234, null);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
    }
}