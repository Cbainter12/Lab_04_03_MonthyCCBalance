public class Main {
    public static void main(String[] args)
    {
        int cardBalance = 5000;
        double oneMonth = 0;
        double twoMonth = 0;

        oneMonth = cardBalance * 1.17;
        System.out.println("Your balance after one month is: " + oneMonth);

        twoMonth = oneMonth * 1.17;
        System.out.println("Your balance after two months is: " + twoMonth);
    }
}