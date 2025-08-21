package Hour10Objects;

// superclass - subclasses can use its vars and methods
public class Modem {
    int speed;

    public void displaySpeed() {
        System.out.println("Speed: " + speed);
    }

    public void disconnect(String method) {
        System.out.println("Disconnecting " + method);
    }
}

// Inheritance - subclass of Modem
class CableModem extends Modem {
    String method = "cable connection";

    public void connect() {
        System.out.println("Connecting to the Internet...");
        System.out.println("Using a " + method);
    }
}

class DslModem extends Modem {
    String method = "DSL phone connection";

    public void connect() {
        System.out.println("Connecting to the Internet...");
        System.out.println("Using a " + method);
    }
}

class Commodore64Modem extends Modem {
    String method = "Commodore 64 connection";

    public void connect() {
        System.out.println("Connecting to the Internet...");
        System.out.println("Using a " + method);
    }
}

class Main {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        Commodore64Modem modem = new Commodore64Modem();
        surfBoard.speed = 500_000;
        gateway.speed = 400_000;
        modem.speed = 300;

        System.out.println("Trying the cable modem:");
        surfBoard.displaySpeed();
        surfBoard.connect();

        System.out.println();

        System.out.println("Trying the DSL modem:");
        gateway.displaySpeed();
        gateway.connect();

        System.out.println();

        System.out.println("Trying the Commodore64 modem:");
        modem.displaySpeed();
        modem.connect();

        System.out.println();

        surfBoard.disconnect(surfBoard.method);  // Disconnecting cable connection
    }
}
