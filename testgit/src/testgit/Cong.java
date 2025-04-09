package testgit;

import java.util.Scanner;

public class Cong {
    public static int tinh(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        int cal = tinh(a, b);
        System.out.println("Kết quả a + b = " + cal);

        scanner.close();
    }
}
