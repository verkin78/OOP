public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Максим", "Минск", 1988,
                "бренд-менеджер(ом).");
        Human human2 = new Human("Аня", "Москва", 1993,
                "методист(ом) образовательных программ.");
        Human human3 = new Human("Катя", "Калининград", 1992,
                "продакт-менеджер(ом).");
        Human human4 = new Human("Артём", "Москва", 1995,
                "директор(ом) по развитию бизнеса.");
        Human human5 = new Human( "Владимир", "Казань", 2001,
                "Сейчас я нигде не работаю.");
        Human human6 = new Human(null, null, -1234, null);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);


        Car car1 = new Car("Lada", "Granta", 2015, "Россия(и)",
                "Желтый(того)", 1.7);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германии(я)",
                "черный", 3.0);
        Car car3 = new Car("черный", "Z8", 2021, "Германия", "черный",
                3.0);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее(Южная Корея)",
                "красный", 2.4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная корея(Южной Корее)",
                "оранжевый", 1.6);
        Car car6 = new Car(null, null, -1990, "", "",
                -1.2);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
    }
}