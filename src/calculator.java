import java.util.Scanner;

public class calculator {
	static int output;
	static int output1;
	public static void multiply() {
		output=5*6;
	}
	public static void division() {
		output1=5/6;
	}

    public static void main(String[] args) {

    	multiply();
    	division();
    	System.out.println(output);
    	System.out.println(output1);
    }
}