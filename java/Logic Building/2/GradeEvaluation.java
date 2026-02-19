class GradeEvaluation {
    public static void main(String[] args) {
        int maths = 80;
        int science = 85;
        int history = 90;

        int avg = (maths + science + history) / 3;

        String grade;

        if (avg >= 90)
            grade = "A";
        else if (avg >= 70)
            grade = "B";
        else if (avg >= 50)
            grade = "C";
        else if (avg >= 30)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}