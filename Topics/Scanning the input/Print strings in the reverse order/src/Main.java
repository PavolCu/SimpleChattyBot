import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfLanguage = scanner.nextLine();
        String activity = scanner.nextLine();
        String subject = scanner.nextLine();
        System.out.println(subject + "\n"+ activity + "\n" + typeOfLanguage);
    }
}