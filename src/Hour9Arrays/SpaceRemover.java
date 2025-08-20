package Hour9Arrays;

public class SpaceRemover {
    public static void main(String[] args) {
        // replace spaces with full-stop

        String mostFamous = "Rudoplh the Red-Nosed Reindeer";
        char[] mfl = mostFamous.toCharArray();

        for (int dex = 0; dex < mfl.length; dex++) {
            char current = mfl[dex];

            if (current != ' ') {
                System.out.print(current);
            } else {
                // if there's an empty space, print a full stop instead
                System.out.print('.');
            }
        }

        System.out.println();
    }
}
