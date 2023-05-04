import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final boolean value = a > 0  && a < 10;
        System.out.println(value);
    }
}