public final class Singleton {
    //volatile means this attribute can not be cached thread-locally and can only be read from main memory, so it is thread safe.
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance(String value) {
        //lazy init means before init check whether it exists
        if (instance == null) {
            //synchronized means this method can only be accessed by one thread at a time, so it is thread safe.
            synchronized (Singleton.class) {
                //Double check locking
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}