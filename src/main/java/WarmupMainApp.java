public class WarmupMainApp {
    public static void main(String[] args) {
        Countries country1 = new Countries("Japan", "Tokyo", true);

        System.out.println(country1.getCountryName());
        System.out.println(country1.getCity());
    }
}