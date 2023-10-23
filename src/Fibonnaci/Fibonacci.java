import java.util.Scanner;

public class Fibonacci {

public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
System.out.print("Introduceți numărul N: ");

int N = scanner.nextInt();

int a = 0, b = 1;

System.out.print("Șirul Fibonacci până la " + N + ": ");
while (a <= N) {

System.out.print(a + " ");

int sum = a + b;

a = b;

b = sum;
}
scanner.close();

    }
}
