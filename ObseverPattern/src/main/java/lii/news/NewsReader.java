package lii.news;

public class NewsReader implements Observer {
    private String name;

    public NewsReader(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}