package Part6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collection");
        //List - arrayList
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("How");
        arrayList.add("Are");
        arrayList.add("You");

        for (String srt : arrayList){
            System.out.println(srt);
        }

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        //Set - HashSet
        Set<Integer> set = new HashSet<Integer>();
        set.add(100);
        set.add(200);
        set.add(200);
        System.out.println(set.toString());

        set.addAll(list);
        list.addAll(set);
        System.out.println("Set addAll: "+set.toString());
        System.out.println("List addAll: "+list.toString());

        //LinkedHashset
        LinkedHashSet<Integer> LHS
                = new LinkedHashSet<Integer>();
        LHS.add(1);
        LHS.add(2);
        LHS.add(3);
        LHS.add(4);
        System.out.println("LinkedHashSet: "
                + LHS);
        System.out.println("HashCode value: "
                + LHS.hashCode());

        //Comparable
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("Tuấn", 5.0));
        peopleList.add(new People("Cường", 7.0));
        peopleList.add(new People("Phương", 6.0));
        Collections.sort(list);

        List<Students> students1 = new ArrayList<>();
        students1.add(new Students(1,"Lucky",22,"Male"));
        students1.add(new Students(2,"Lucky2",24,"Male"));
        students1.add(new Students(3,"Lucky3",20,"Male"));

        Comparator<Students> com = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        };
        Collections.sort(students1,com);
        //HashMap
        Map<String,Double> map = new HashMap<String,Double>();
        map.put("Nokia",300.0);
        map.put("Samsung",500.0);
        map.put("Lenovo",200.0);
        map.put("Apple",600.0);
        System.out.println("HashMap: "+map.toString());

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Double price = map.get(key);
            System.out.println(price);
        }
        for (Map.Entry<String,Double> entry : map.entrySet()){
            String name = entry.getKey();
            double price = entry.getValue();
            System.out.println("name: "+name+"- price: "+price);
        }

        //LinkedHasmap
        LinkedHashMap<String, String> lhm
                = new LinkedHashMap<String, String>();

        lhm.put("one", "review example");
        lhm.put("two", "code for fun");
        lhm.put("four", "practice more");

        System.out.println(lhm);

        System.out.println("value of key 'one': " + lhm.get("one"));

        System.out.println("Size : " + lhm.size());

        System.out.println("check empty? " + lhm.isEmpty());

        System.out.println("contains key 'two'? " + lhm.containsKey("two"));

        System.out.println(
                "Contains value 'review"
                        + lhm.containsValue("practice"));

        System.out.println("delete element 'one': "
                + lhm.remove("one"));
        System.out.println("linkedHashMap : "
                + lhm);
        //treeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("one", 1);
        treeMap.put("two", 3);
        treeMap.put("three", 2);

        int valueOne = treeMap.get("one");
        System.out.println("Value of \"one\": " + valueOne);

        treeMap.remove("two");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
