package dip;

public class Computer {
    private Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void input() {
        keyboard.type();
    }
}