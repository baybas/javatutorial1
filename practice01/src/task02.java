import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = myInput.nextDouble();

        System.out.print("Enter B: ");
        double b = myInput.nextDouble();

        System.out.print("Enter C: ");
        double c = myInput.nextDouble();

        double z = (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b,-2) ;

        System.out.print("z = ((a-3)*b/2)+c = " + z);

    }
}
