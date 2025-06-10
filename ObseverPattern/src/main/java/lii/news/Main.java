package lii.news;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            NewsAgency agency = new NewsAgency();
            NewsReader alice = new NewsReader("Alice");
            NewsReader bob = new NewsReader("Bob");

            agency.registerObserver(alice);
            agency.registerObserver(bob);

            agency.setNews("Breaking: Observer Pattern Explained!");
        }

}