

public class NaiveSingletonSingleThread {
    private static NaiveSingletonSingleThread instance;
    public String value;

    private NaiveSingletonSingleThread(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static NaiveSingletonSingleThread getInstance(String value) {
        if (instance == null) {
            instance = new NaiveSingletonSingleThread(value);
        }
        return instance;
    }
}
