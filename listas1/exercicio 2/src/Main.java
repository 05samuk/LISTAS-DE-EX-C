import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("dgite um numero: ");
        number = in.nextInt();
        result = Math.pow(number,2);
        System.out.println("o quadrado do numero digitado é " + result);

    }
}