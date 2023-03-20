package Part2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //2.1 Variable type variableName = value;
        String text_out = "Hello world!";
        String num_text = "33";
        int number = 1;
        float float_num = 10.5f;
        System.out.println(text_out);
        System.out.println(number);
        System.out.println(Integer.parseInt(num_text));
        //2.2 Data types byte, int, long, float, double, boolean, char,String,Array,Class...
        // => Class object Bytr,Short,Integer,Long,Float,....
        float number2 = 2.5f;
        boolean right = true;
        //or
        Integer class_obj = 5;
        int data_value = class_obj.intValue();
        System.out.println(number2);
        System.out.println(right);
        System.out.println(data_value+"&"+Integer.valueOf(data_value));
        //2.3 Working with array
        String[] arr = {"apple","orange","peach"};
        int num[] = {1,2,3,4,5};
        Double[] double_arr = new Double[4];
        Float[] long_arr = new Float[]{1.2f,2.2f,5.3f};
        System.out.println("String array length "+arr.length+"- Phan tu dau tien: "+ arr[0]);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Phan tu thu "+i+": "+num[i]);
        }
        //toString
        System.out.println(Arrays.toString(arr));
        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //binarySearch
        System.out.println(Arrays.binarySearch(arr,"apple"));
        //fill
        Arrays.fill(arr,"Change value");
        System.out.println(Arrays.toString(arr));

        //object array
        Person[] person_arr;
        person_arr = new Person[5];

        person_arr[0] = new Person(1, "aman");
        person_arr[1] = new Person(2, "vaibhav");
        person_arr[2] = new Person(3, "shikar");
        person_arr[3] = new Person(4, "dharmesh");
        person_arr[4] = new Person(5, "mohit");

        for (int i = 0; i < person_arr.length; i++) {
            System.out.println("Vi tri " + i + " : "
                    + person_arr[i].roll_no + " "
                    + person_arr[i].name);
        }
        //visibility
        Students.static_method();
        Students stu = new Students(1,"Nam");
        stu.default_method();
        stu.protected_method();
        //erro call stu.private_method();

        //2.4 if-else ; switch case
        for (int i = 0; i < person_arr.length; i++) {
            if (person_arr[i].roll_no == 1){
                System.out.println("Ten phan tu thu 1: "+person_arr[i].name);
            }
        }
        for (int i = 0; i < person_arr.length; i++) {
            switch (i%2){
                case (0):
                    System.out.println("Ten phan tu vi tri chan: "+person_arr[i].name);
                    break;
                case (1):
                    System.out.println("Ten phan tu vi tri le: "+person_arr[i].name);
                    break;
            }
        }
    }
}
