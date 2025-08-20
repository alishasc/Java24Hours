package Hour8Loops;

public class Benchmark {
    public static void main(String[] args) {
        // counts how many times the Java program can calculate a square root in one minute

        // current time in milliseconds
        long startTime = System.currentTimeMillis();
        // end time is one minute later
        long endTime = startTime + 60_000;
        long index = 0;  // counter

        while (true) {
            // calculate square root of index each loop
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();

            // if current time has exceeded one minute then quit loop
            if (now > endTime) {
                break;
            }

            index++;
        }

        System.out.println(index + " loops in one minute");
    }
}
