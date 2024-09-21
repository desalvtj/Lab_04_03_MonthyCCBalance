public class Main
{
    public static void main(String[] args)
    {
        final double INTEREST_RATE = .17;
        double interest = 0;
        double creditCardBalance = 5000;

        interest = creditCardBalance * INTEREST_RATE;
        creditCardBalance = creditCardBalance + interest;

        System.out.println("The first months interest is " + interest + ", for a total balance of " + creditCardBalance);

        interest = creditCardBalance * INTEREST_RATE;
        creditCardBalance = creditCardBalance + interest;

        System.out.println("The second months interest is " + interest + ", for a total balance of " + creditCardBalance);

    }
}