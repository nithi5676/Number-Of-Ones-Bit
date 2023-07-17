package numbersOfOnesBit;

import java.util.Scanner;

public class NumberOfOnesBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.print(onesBit(number));
    }

    private static int onesBit(int number) {
        int count = 0;
        while (number > 0) {
            int temp = number % 2;
            count += temp;
            number /= 2;
        }
        return count;
    }

}
