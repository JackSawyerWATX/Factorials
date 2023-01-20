import java.util.Scanner;
import java.math.BigInteger;

public class LargeFactorials {
    public static void main(String[] args) {
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        Scanner input = new Scanner(System.in);

        System.out.println("Input a number: ");
        n = input.nextInt();

        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }

        System.out.print(n + "! = " + fact);
    }
}
