import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int input4 = scanner.nextInt();
        System.out.println(--input1 +  " " + --input2 + " " + --input3 + " " + --input4);
    }
}