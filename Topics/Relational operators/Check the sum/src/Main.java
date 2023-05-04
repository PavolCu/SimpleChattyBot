import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int refVal = 20;
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int result1 = a + b;
        final int result2 = a + c;
        final int result3 = b + c;
        final boolean conclusionF = result1 == refVal || result2 == refVal || result3 == refVal;
        System.out.println(conclusionF);



    }
}