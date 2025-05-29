import lsp.Bird;
import lsp.Sparrow;


public class Main {
    public static void main(String[] args) {

        Bird sparrow = new Sparrow();
        sparrow.fly();
//        Bird ostrich = new Ostrich();
//        ostrich.fly(); // Uncommenting this breaks LSP
    }
}