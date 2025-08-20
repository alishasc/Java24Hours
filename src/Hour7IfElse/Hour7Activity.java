package Hour7IfElse;

public class Hour7Activity {
    public static void main(String[] args) {
        int grade = 63;

        // if statements
//        if (grade >= 70) {
//            System.out.println("A - Amazing!");
//        } else if (grade >= 60) {
//            System.out.println("B - Beautiful");
//        } else if (grade >= 50) {
//            System.out.println("C - Concerning");
//        } else if (grade >= 40) {
//            System.out.println("D - Dreadful");
//        } else {
//            System.out.println("F - Failed :(");
//        }

        // switch statement
        char letterGrade;
        if (grade >= 70) {
            letterGrade = 'A';
        } else if (grade >= 60) {
            letterGrade = 'B';
        } else if (grade >= 50) {
            letterGrade = 'C';
        } else if (grade >= 40) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        switch (letterGrade) {
            case 'A':
                System.out.println("A - Amazing!");
                break;
            case 'B':
                System.out.println("B - Beautiful");
                break;
            case 'C':
                System.out.println("C - Concerning");
                break;
            case 'D':
                System.out.println("D - Dreadful");
                break;
            case 'F':
                System.out.println("F - Failed :(");
        }
    }
}
