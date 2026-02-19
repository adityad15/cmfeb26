import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int j = s.length() - 1;

        for (int i = 0; i <= s.length() / 2; i++) {

            if (s.charAt(i) == s.charAt(j)) {  
                j--;  
                if (i >= j) {                   
                    System.out.println("it's a palindrome");
                    break;
                }
            } else {
                System.out.println("it's not a palindrome");
                break;
            }
        }

        sc.close();
    }
}
