package Hour9Arrays;

public class Arrays {
    public static void main(String[] args) {
        // init empty arrays
        String[] naughtyChild;
        int[] reindeerWeight;

        // init empty arrays with known size - 250 elements
        int[] elfSeniority = new int[250];

        // init new array with initial values
        String[] reindeerNames = { "Dasher", " Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen" };
//        System.out.println("There are " + reindeerNames.length + " reindeer.");

        // 2D array - each element given default value of false while it's empty
        boolean[][] selectedPoint = new boolean[50][50];  // 2500 individual elements
        selectedPoint[4][13] = true;
        selectedPoint[7][6] = true;
        selectedPoint[11][22] = true;

//        for (int i = 0; i < selectedPoint.length; i++) {
//            System.out.println();
//            for (int j = 0; j < selectedPoint.length; j++) {
//                System.out.print(selectedPoint[i][j] + " ");
//            }
//        }

        // sorting an array
        int[] numbers = { 3, 7, 9, 12, 5, 0, 8, 19 };
        // swap 0 and 8
        int temporary = numbers[5];
        numbers[5] = numbers[6];
        numbers[6] = temporary;

        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}
