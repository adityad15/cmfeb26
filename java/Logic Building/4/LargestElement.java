import java.util.Scanner;

class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];  // assume first element is largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest element is: " + max);

        sc.close();
    }
}
