import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greatings = scanner.nextLine();

        String language = scanner.nextLine();

        String time = scanner.next();

        String proffesion = scanner.next();
        String newLine = System.getProperty("line separator");
        System.out.println(greatings + "\n"
                + language +"\n"+ time + "\n" + proffesion);


    }
}