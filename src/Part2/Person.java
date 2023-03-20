package Part2;

public class Person {
    public int roll_no;
    public String name;
    Person(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }

    public static String isPerson(){
        return "Nguoi";
    }

    public String getStatus(){
        return this.name+ " la "+isPerson();
    }
}
