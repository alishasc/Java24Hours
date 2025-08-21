package Hour10Objects;

import java.awt.*;

public class Casting {
    public static void main(String[] args) {
        float source = 7.00f;
        int destination = (int) source;
        System.out.println(destination);

        int xNum = 103;
        byte val = (byte) xNum;

        // convert object to variable
        String count = "25";
        int myCount = Integer.parseInt(count);
        System.out.println(myCount);
    }

    // example of casting objects - to use object in place of one of its subclasses
    public void paintComponent(Graphics comp) {
        // cast Graphics object into a Graphics2D object
        Graphics2D comp2D = (Graphics2D) comp;
    }
}
