import java.util.Scanner;

class MenuProgram {

    static void gradeEvaluation(int marks) {
        if(marks >= 90) System.out.println("A");
        else if(marks >= 75) System.out.println("B");
        else if(marks >= 50) System.out.println("C");
        else System.out.println("Fail");
    }

    static void leapYear(int year) {
        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }

    static void dayOfWeek(int day) {
        switch(day) {
            case 1: 
		System.out.println("Monday"); 
		break;
            case 2: 
		System.out.println("Tuesday"); 
		break;
            case 3: 
		System.out.println("Wednesday"); 
		break;
            case 4: 
		System.out.println("Thursday"); 
		break;
            case 5: 
		System.out.println("Friday"); 
		break;
            case 6: 
		System.out.println("Saturday"); 
		break;
            case 7: 
		System.out.println("Sunday"); 
		break;
            default: 
		System.out.println("Invalid");
        }
    }

    static void defaultValues() {
        int i=0;
        double d=0.0;
        boolean b=false;
        char c='\u0000';
        System.out.println(i+" "+d+" "+b+" "+c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    gradeEvaluation(sc.nextInt());
                    break;
                case 2:
                    leapYear(sc.nextInt());
                    break;
                case 3:
                    dayOfWeek(sc.nextInt());
                    break;
                case 4:
                    defaultValues();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);
    }
}
