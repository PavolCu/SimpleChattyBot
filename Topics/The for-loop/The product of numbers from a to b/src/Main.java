import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int multiply = 1;

        for (int i = a; i < b; i++) {
            multiply *= i;
        }
        System.out.println(multiply);
    }
}