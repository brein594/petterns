package porojdaushie.singleton;

public class SimpleSingleton {
    private final static SimpleSingleton INSTANSE = new SimpleSingleton();
    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        return INSTANSE;
    }

}
