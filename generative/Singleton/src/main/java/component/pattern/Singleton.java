package component.pattern;

/**
 * Created by vladzarovnyi on 11/29/17.
 */
public final class Singleton {

    private static Singleton singleton;

    private String value;

    private Singleton (String value) {
        this.value = value;
    }

    public static  Singleton getInstance(String value) {
        if(singleton == null){
            singleton = new Singleton(value);
        }

        return singleton;
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
