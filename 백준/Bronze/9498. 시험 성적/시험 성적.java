import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		sc.close();
        
		System.out.println((A>89) ? "A" : ((A>79) ? "B" : ((A>69) ? "C" : ((A>59) ? "D" : "F" ) ) ));
	} 
}