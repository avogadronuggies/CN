import java.util.Scanner;

public class PhysicalLayerCodingViolation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        
        System.out.println("Physical Layer Coding Violation: " + input + "01");

        sc.close();
    }
}
