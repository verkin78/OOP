public class Main {
    public static void main(String[] args) {
        System.out.println("Про людей");
        Human human1 = new Human("Максим", "Минск", 1988,
                "бренд-менеджер(ом).");
        Human human2 = new Human("Аня", "Москва", 1993,
                "методист(ом) образовательных программ.");
        Human human3 = new Human("Катя", "Калининград", 1992,
                "продакт-менеджер(ом).");
        Human human4 = new Human("Артём", "Москва", 1995,
                "директор(ом) по развитию бизнеса.");
        Human human5 = new Human("Владимир", "Казань", 2001,
                " Сейчас я нигде не работаюю.");
        Human human6= new Human(null, null, -1234, null);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println();

        System.out.println("Про машины");

        System.out.println();

        System.out.println("Про цветы");
       Flower flower1 = new Flower("Роза обыкновенная", "Голландия", "35.59", "");
        Flower flower2 = new Flower("Хризантема", "", "15", "5");
        Flower flower3 = new Flower("Пион", "Англия", "69.9", "1");
        Flower flower4 = new Flower("Гипсофила", "Турция", "19.5", "10");
        Flower flower5 = new Flower(null, null, null, null);

        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);
        System.out.println(flower5);
    }
}