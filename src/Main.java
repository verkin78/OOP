import Transport.Car;

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
        Car car1 = new Car("Lada", "Granta", 2015, "Россия(и)", "Желтый(того)", 1.7, "механическая",
                "легковая", "с035ов277", 3);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германии(я)", "черный",
                3.0, "автомат", "седан", "в077ин326", 5);
        Car car3 = new Car("черный", "Z8", 2021, "Германия", "черный", 3.0,
                "автомат", "седан", "о077иу327", 5);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее(Южная Корея)",
                "красный", 2.4, "автомат", "легковая", "о445ва973", 4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная корея(Южной Корее)", "оранжевый",
                1.6, "автомат", "легковая", "у18мн746", 4);
        Car car6 = new Car(null, null, -1990, "", "",
                -1.2, null, null, null, 0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
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