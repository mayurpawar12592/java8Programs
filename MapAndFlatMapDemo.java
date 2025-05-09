import java.util.*;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        List<String> stringList = map.entrySet().stream()
                .map(rec -> rec.getKey().toUpperCase()).
                collect(Collectors.toList());
        System.out.println(stringList);

        List<List<Integer>> numberList = new ArrayList<>();
        numberList.add(List.of(1, 2));
        numberList.add(List.of(3, 4));
        numberList.add(Arrays.asList(5, 6));
        List<Integer> flatMapList = numberList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}
