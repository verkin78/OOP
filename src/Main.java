public class Main {
    public static void main(String[] args) {

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