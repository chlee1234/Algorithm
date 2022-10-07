import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a * b;
            sum += arr[i];
        }
        sc.close();

        if(total == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}