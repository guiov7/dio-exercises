import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidParamException {
        Scanner sc = new Scanner(System.in);
        Contador c;
        System.out.print("Enter the first parameter: ");
		int paramOne = sc.nextInt();
		System.out.print("Enter the second parameter: ");
		int paramTwo = sc.nextInt();
		c = new Contador(paramOne, paramTwo);
        
        if(paramOne < paramTwo) {
            c.counter();
        }else {
            throw new InvalidParamException();
        }
       
        sc.close();
	}
}
