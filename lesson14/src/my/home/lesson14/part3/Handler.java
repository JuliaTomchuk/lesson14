package my.home.lesson14.part3;

@FunctionalInterface
public interface Handler<T> {
    T handle(T t);
}
