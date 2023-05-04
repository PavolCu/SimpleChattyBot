import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIncl = scanner.nextInt();
        int endExcl = scanner.nextInt();
        int sum = 0;

        for (int i = startIncl; i <= endExcl; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}