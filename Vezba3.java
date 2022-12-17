import java.util.Scanner;

public class Vezba3 {
    public static void main(String[] args) {
        System.out.println("Unesi svoje ime:");

        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        System.out.println("Dobrodosao " + ime  );
    }
}
