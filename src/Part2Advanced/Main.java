package Part2Advanced;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Lamda expression
        List<Person> listPersonSortByName = Person.getListPerson();

        listPersonSortByName.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("sort by name:");
        for (Person person: listPersonSortByName) {
            System.out.println(person);
        }

        List<Person> listPersonSortByNameAndAge = Person.getListPerson();
        listPersonSortByNameAndAge.sort((o1, o2) -> {
            if (o1.getName().equals(o2.getName())) {
                return o2.getAge() - o1.getAge();
            }
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println();
        System.out.println("sort by name and age:");
        for (Person person: listPersonSortByNameAndAge) {
            System.out.println(person);
        }

        //Functional Interface
        List<String> list = Arrays.asList("How", "are", "you");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        list.forEach(t -> System.out.println(t));

        //Stream
        //Empty Stream
        Stream<String> steamEmpty = Stream.empty();
        //Collection Stream
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        //Array Stream
        Stream<String> arrayStream = Stream.of("a","b","c");
        String[] arr = new String[]{"a","b","c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        //Stream builder
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        //generate
        Stream<String> streamGenerated =
                Stream.generate(() -> "java").limit(5);
        //iterate
        Stream<String> streamIterated = Stream.iterate("Java", n -> n + 1).limit(5);
        List<String> listIterated = streamIterated.collect(Collectors.toList());
        System.out.println(listIterated);
        //Primitive Stream
        IntStream intStream = IntStream.range(1,5);
        //String Stream
        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");
        //File Stream
        Path path = Paths.get("file.txt");
        try {
            Stream<String> streamOfStrings = Files.lines(path);
            Stream<String> streamWithCharset =
                    Files.lines(path, Charset.forName("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Stream to collection/array
        Stream<Integer> int_Stream = Stream.of(1,2,3,4);
        List<Integer> intList = int_Stream.collect(Collectors.toList());
        System.out.println(intList);
        int_Stream = Stream.of(1,2,3,4);
        Map<Integer,Integer> intMap = int_Stream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println(intMap);

        Stream<Integer> int_Stream2 = Stream.of(1,2,3,4);
        Integer[] intArray = int_Stream2.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));
        //Stream filter
        Predicate<Integer> p = num -> num % 2 == 0;
        List<Integer> _list = Arrays.asList(3,4,6);
        _list.stream().filter(p).forEach(e -> System.out.print(e+" "));
        //Stream allMatch,oneMatch,noneMatch
        Predicate<Integer> p2 = num -> num % 2 == 0;
        List<Integer> list2 = Arrays.asList(3,5,6);
        System.out.println("allMatch:" + list2.stream().allMatch(p2));
        System.out.println("anyMatch:" + list2.stream().anyMatch(p2));
        System.out.println("noneMatch:" + list2.stream().noneMatch(p2));
        //findAny and findFirst
        List<String> list3 = Arrays.asList("G","B","F","E");
        String any = list3.stream().findAny().get();
        System.out.println("FindAny: "+ any);
        String first = list3.stream().findFirst().get();
        System.out.println("FindFirst: "+ first);
        //Stream distinct
        List<Integer> list4 = Arrays.asList(3,4,6,6,4);
        System.out.print("Distinct elements: ");
        list4.stream().distinct().forEach(pe -> System.out.print(pe + ", "));
        //Stream map
        Stream<String> names = Stream.of("Nam", "Quan", "Cong");
        System.out.println(names.map(s -> {
            return s.toUpperCase();
        }).collect(Collectors.toList()));
        //Stream max,min
        List<String> list_char = Arrays.asList("G","B","F","E");
        String max = list_char.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println("Max:"+ max);
        String min = list_char.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println("Min:"+ min);
        //Reuse với stream
        Stream<String> names2 = Stream.of("Long","Hoang","Cong");
        names2.forEach(e -> System.out.println(e + " "));

        names2 = Stream.of("Long","Hoang","Cong");
        names2.forEach(e -> System.out.println(e + ","));

        //or
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Long","Hoang","Cong");
        streamSupplier.get().forEach(e -> System.out.println(e + " "));
        streamSupplier.get().forEach(e -> System.out.println(e + ","));
    }
}
