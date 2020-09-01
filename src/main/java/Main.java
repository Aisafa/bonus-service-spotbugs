public class Main {

    public static long main(String[] args) {

        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = true;
        return service.calculate(amount, registered);
    }
}

