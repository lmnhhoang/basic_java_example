package Part2Advanced;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
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
//        Path path = Paths.get("file.txt");
//        try {
//            Stream<String> streamOfStrings = Files.lines(path);
//            Stream<String> streamWithCharset =
//                    Files.lines(path, Charset.forName("UTF-8"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
