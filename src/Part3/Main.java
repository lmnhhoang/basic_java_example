package Part3;

public class Main {
    public static void main(String[] args) {
        //3.1 Method
        Integer a = 2,b = 3;
        System.out.println("Tong "+a+" va "+b+" la: "+ Sum(a,b) );
        System.out.println("Tich "+a+" va "+b+" la: "+ Calculator.Multiple(a,b) );
    }
    static int Sum(Integer a, Integer b) {
        return a + b;
    }
}
