package Part7;

public class PairGenerics<T,S> {
    private T first;
    private S second;
    public PairGenerics(T fi, S se){
        first = fi;
        second = se;
    }
    public T getFirst() { return first; }
    public S getSecond() { return second; }
}
