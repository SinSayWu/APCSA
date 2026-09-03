public class Runner {
    public static void main(String[] args) {
        Smartphone test = new Smartphone("Trump Mobile", "T1", 1024);

        for (int i = 0; i <= 10; i++) {
            new Smartphone("", "");
        }

        System.out.println(test.specs());
        System.out.println("Number Sold: " + Smartphone.numberSold());
    }
}
