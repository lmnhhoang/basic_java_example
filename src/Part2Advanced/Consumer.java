package Part2Advanced;
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
