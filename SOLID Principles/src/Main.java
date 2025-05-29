import dip.Computer;
import dip.Keyboard;
import dip.WiredKeyboard;
import dip.WirelessKeyboard;

public class Main {
    public static void main(String[] args) {

        Keyboard keyboard = new WiredKeyboard();
        Keyboard newKeyboard = new WirelessKeyboard();

        printKeyboard(newKeyboard);
        printKeyboard(keyboard);
    }

    public static void printKeyboard(Keyboard keyboard) {
        Computer computer = new Computer(keyboard);
        computer.input();
    }
}