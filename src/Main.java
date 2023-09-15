public class Main {
    public static void main(String[] args) {

        int price = 15225; // стоимость билета
        int miles = 20; // количество рублей для одной бонусной мили

        System.out.println("За каждые 20 рублей, потраченных на билет начислется:");
        System.out.println((price/miles) + " миля/(мили)");

    }
}