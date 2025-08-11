package Hour5;

public class Variable {
    public static void main(String[] args) {
        // in order of size
        byte escapeKey = 27;
        short roomNumber = 222;
        char key = 'C';
        int tops;
        long salary = 264_400_000_000L;  // would think it was an int if didn't have L
        float gradePointAverage = 80.2f;
        double pi = 3.14d;

        String productName = "Larvets";
        boolean gameOver = false;

        // constants - naming convention to capitalise every letter
        final int TOUCHDOWN = 6;
        final int FIELDGOAL = 3;

        // maths
        int division = 20 / 3;  // 6 - ignores remainder of 2
        int remainder = 20 % 3;  // 2 is the remainder

        // increment and decrement
        int x = 3;
        int answer1 = x++ * 10;  // 30
        int answer2 = ++x * 10;  // 40
    }
}
