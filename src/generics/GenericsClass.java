package generics;

/**
 * Created by mrahbari on 06/01/2015.
 */
public class GenericsClass<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}
