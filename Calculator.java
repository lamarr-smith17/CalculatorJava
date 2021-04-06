import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAdd, numSub, numMulti;
		double numDivide;
		int orderAlphabetically;
		String operationAdd = "Add";
		String operationSub = "Subtract";
		String operationMulti = "Multiply";
		String operationDivide = "Divide";
		String operationAlpha = "Alphabetize";
	
		Scanner nScan = new Scanner(System.in);
		System.out.println("List of operations: add subtract multiply divide alphabetize");
		System.out.println("Enter an operation:");
		String operationDecision = nScan.nextLine();
		if (operationDecision != operationAdd)
			System.out.println("Invalid input entered. Terminating...");
		if (operationDecision.equalsIgnoreCase(operationAdd) == true) { // equalsIgnoreCase makes it case insensitive 
			System.out.print("Enter two integers: ");
			int a = nScan.nextInt();
			int b = nScan.nextInt();
			if (a || b != int)
				System.out.println("Invalid input entered. Terminating...");
			numAdd = a + b;
			System.out.println("Answer: " + numAdd);	
		} else if (operationDecision.equalsIgnoreCase(operationSub) == true) {
			System.out.print("Enter two integers: ");
			int a = nScan.nextInt();
			int b = nScan.nextInt();
			numSub = a - b;
			System.out.println("Answer: " + numSub);
		} else if (operationDecision.equalsIgnoreCase(operationMulti) == true) {
			System.out.print("Enter two integers: ");
			int a = nScan.nextInt();
			int b = nScan.nextInt();
			numMulti = a * b;
			System.out.printf("Answer: %.2f", numMulti);
		} else if (operationDecision.equalsIgnoreCase(operationDivide) == true) {
			System.out.print("Enter two integers: ");
			double a = nScan.nextInt();
			double b = nScan.nextInt();
				if (b == 0) {
					System.out.println("Invalid input entered. Terminating...");
				} else
					numDivide = a / b;
					System.out.printf("Answer: %.2f", numDivide);
		}
		
	}

}
