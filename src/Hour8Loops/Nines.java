package Hour8Loops;

public class Nines {
    public static void main(String[] args) {
        // for loops
        for (int dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.print(multiple + " ");
        }

        System.out.println();

        // while loops
        int limit = 5;
        int count = 1;
        while (count < limit) {
            System.out.println("Pork is not a verb");
            count++;
        }

        // do-while loops
        do {
            System.out.println("I am not allergic to long division");
            count++;
        } while (count < limit);

        // continue - skips printing 5
        int index = 0;
        while (index <= 10) {
            index += 1;
            if (index == 5) {
                continue;
            }
            System.out.println("The index is " + index);
        }

        // naming a loop
        int points = 0;
        int target = 100;
        // name of the outer loop
        targetLoop:
        while (target <= 100) {
            for (int i = 0; i < target; i++) {
                if (points > 50) {
                    // break out of while loop
                    break targetLoop;
                }
                points += 1;
            }
        }

        // complex for loops
        int i, j;
        for (i = 0, j = 0; i * j < 1000; i++, j += 2) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }

        int displayCount = 1;
        int endValue = 5;
        // counter variable has already been created so don't need to add to the initializer here
        for ( ; displayCount < endValue; displayCount++) {
            System.out.println("hi");
        }
    }
}
