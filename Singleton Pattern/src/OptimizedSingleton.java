public class OptimizedSingleton {
    private static volatile OptimizedSingleton instance;

    public String value;

    private OptimizedSingleton(String value) {
        this.value = value;
    }

    public static OptimizedSingleton getInstance(String value) {
        OptimizedSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(OptimizedSingleton.class) {
            if (instance == null) {
                instance = new OptimizedSingleton(value);
            }
            return instance;
        }
    }
}
