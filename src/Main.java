import project.patterns.SingletonEager;
import project.patterns.SingletonLazy;
import project.patterns.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

        // Lazy
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        //Eager
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);

        //Lazy Holder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}