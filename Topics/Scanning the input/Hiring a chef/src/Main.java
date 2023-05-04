import java.util.Scanner;

class Main {

    public static void main(String[] args) {


      
        Scanner scanner = new Scanner(System.in);
        String candidate = scanner.next();
        String numberOfExperience = scanner.next();
        String typeOfCooking = scanner.next();

        System.out.println("The form for " + candidate +" is completed." +
                " We will contact you if we need a chef who cooks " + typeOfCooking  +
                " dishes and has " + numberOfExperience +" years of experience." );

    }
}