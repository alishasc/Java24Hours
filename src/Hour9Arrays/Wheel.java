package Hour9Arrays;

public class Wheel {
    public static void main(String[] args) {
        // NOTE: Java attaches a numerical value to each character in the alphabet! 65 - 90

        String[] phrase = {
                "A STITCH IN TIME SAVED NINE",
                "DON'T EAT YELLOW SNOW"
        };

        int[] letterCount = new int[26];  // num of letters in alphabet - stored num of times each letter appears

        // loop phrase array
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];  // save current phrase
            char[] letters = current.toCharArray();  // convert current phrase into chars

            // loop chars
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];  // save current single letter

                // ignores characters that aren't part of the alphabet - punctuation and spaces
                if ((lett >= 'A') & (lett <= 'Z')) {
                    // numeric alphabet values -> A = 65. Z = 90
                    /* as letterCount arr ends at index 25, A (65) is subtracted from the lett numerical value
                        so the correct arr element is increased */
                    letterCount[lett - 'A']++;
                }
            }
        }

        // loop the alphabet
        for (char count = 'A'; count <= 'Z'; count++) {
            // print alphabet letter and how many times it occurs
            System.out.print(count + ": " +
                    letterCount[count - 'A'] +
                    " ");

            if (count == 'M') {
                System.out.println();
            }
        }
        System.out.println();
    }
}
