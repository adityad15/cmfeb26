import java.util.Scanner;

class EleIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The number " + search + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
