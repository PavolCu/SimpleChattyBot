import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ready = 0;
        int fixed = 0;
        int rejects = 0;

        for (int i = 0; i < n; i++) {
            int result = scanner.nextInt();
            if (result == 0) {
                ready++;
            } else if (result == 1) {
                fixed++;
            } else if (result == -1) {
                rejects++;
            }
        }
        System.out.println(ready + " " + fixed + " " + rejects);
    }
}