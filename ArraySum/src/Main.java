import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Input elements in the array: ");
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of elements is = " + sum);
    }
}