package Part7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generics");
        ArrayList<Integer> int_generic = new ArrayList<Integer>();
        int_generic.add(10);
        //int_generic.add("Hi");//error
        //int_generic.add(true);//error
        int_generic.add(15);

        int zero_index = int_generic.get(0);
        System.out.println(zero_index);

        GenericsType<String> type1 = new GenericsType<String>();
        type1.setT("How");
        System.out.println(type1);

        GenericsType type2 = new GenericsType();
        type2.setT("Are");
        type2.setT(1);

        System.out.println(type2);

        PairGenerics<String, String> p2 = new PairGenerics("Hello","World");
        System.out.println(p2.getFirst()+", "+p2.getSecond());
        // 7 Generic with wildcards
        //ArrayList voi String
        ArrayList<String> listString = new ArrayList<String>();

        listString.add("Tom");
        listString.add("Jerry");

        // ArrayList voi Integer
        ArrayList<Integer> listInteger = new ArrayList<Integer>();

        listInteger.add(100);

        ArrayList<? extends Object> extend_list;
        extend_list = listInteger;
        System.out.println(extend_list);
        extend_list = listString;
        System.out.println(extend_list);

    }
}
