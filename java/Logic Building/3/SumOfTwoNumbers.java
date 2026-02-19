import java.util.Scanner;

class SumOfTwoNumbers {
    static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = sumOfTwoNumbers(x, y);
        System.out.println(result);
    }
}
