import java.util.Scanner;

public class CircleClass_ {
    public static void main(String[] args) {
		CircleClass c = new CircleClass();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a radius:");
		c.rd = scan.nextDouble();
		System.out.println("Radius:        " + c.rd);
		System.out.println("Area:          " + c.geta());
		System.out.println("Diameter:      " + c.getd());
		System.out.println("Circumference: " + c.getc());
		scan.close();

	}

}