package Part6;

public class People implements Comparable<People>{
    public String name;
    public Double rank;

    public People(String name, Double rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(People o) {
        return rank.compareTo(o.rank);
    }
}
