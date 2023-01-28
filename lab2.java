import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        double n = in.nextDouble();
        System.out.println("Введите x в диапазоне (-1;1] ");

        double x;
        for(x = in.nextDouble(); x > 1.0D || x <= -1.0D; x = in.nextDouble()) {
            System.out.println("Введите x в диапазоне (-1;1] ");
        }

        double result = 0.0D;

        for(int i = 0; (double)i <= n; ++i) {
            result += Math.pow(-1.0D,i) * Math.pow(x,i) / (double)(i + 1);
        }

        System.out.println(result);
    }
}
