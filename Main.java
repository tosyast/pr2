import java.util.Scanner;
//for 26
public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите вещественное число:");
        float x = scaner.nextFloat();
        System.out.println(x);
        System.out.println("Введите целое число");
        int n = scaner.nextInt();
        System.out.println(n);
        float x1 = x, rez = x;
        int i, k = 1;
        for (i = 2; i <= n; i++){
            k += 2;
            x1 *= -1 * x * x;
            rez += x1 / k;
        }
        System.out.println("Результат:" + rez);
    }
}
