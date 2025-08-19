package Hour8;

public class Hour8Activity {
    public static void main(String[] args) {
        int counter = 0;
        int multipleCount = 0;

        while (multipleCount <= 400) {
            if (counter % 13 == 0) {
                System.out.print(counter + " ");
                multipleCount++;
            }

            counter++;
        }
    }
}
