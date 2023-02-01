import java.util.Locale;
import java.util.Scanner;

//while 5
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        int k = 0;
        while (n>= 2){
            k++;
            n /= 2;
        }
        System.out.println("Степень");
        System.out.println(k);

    }
}
