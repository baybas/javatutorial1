import java.util.Scanner;

public class task01 {

    public static void main (String[] args)
{

    Scanner myInput = new Scanner( System.in );

    System.out.print( "Enter A: " );
    double  a = myInput.nextDouble();

    System.out.print( "Enter B: " );
    double b = myInput.nextDouble();

    System.out.print( "Enter C: " );
    double c = myInput.nextDouble();

    double z = ((a - (double) 3)*b/2)+c;

    System.out.print( "z = ((a-3)*b/2)+c = " + z);

}

}
