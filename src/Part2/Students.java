package Part2;

public class Students extends Person{
    private Integer id;
    private String full_name;
    private Integer age;
    private String gender;

    public Students(int roll_no, String name) {
        super(roll_no, name);
    }

    public Students(int roll_no, String name, Integer id, String full_name, Integer age, String gender) {
        super(roll_no, name);
        this.id = id;
        this.full_name = full_name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int Multiple(Integer a, Integer b) {
        return a * b;
    }
    protected void protected_method(){
        System.out.println("protected method");
    }
    private void private_method(){
        System.out.println("private method");
    }
    void default_method(){
        private_method();
        System.out.println("default method");
    }
    static void static_method(){
        System.out.println("static method");
    }
}
