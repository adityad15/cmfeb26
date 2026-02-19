import java.util.Scanner;

class PositiveNumber {
    static void askForPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
        } while(num <= 0);
        System.out.println(num);
    }

    public static void main(String[] args) {
        askForPositiveNumber();
    }
}
