import java.util.Comparator;
import java.util.List;

public class Java8Programs {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 8, 17, 15, 23, 6);
        long count = list.stream().count();
        System.out.println("Count of list no are:-" + count);

        //find ot max no from list
        int max = list.stream().max(Integer::compareTo).get();
        int max1 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max No is :" + max);
        System.out.println("Max No using is Comparator:" + max1);


        // find min no from list
        int min= list.stream().min(Integer::compareTo).get();
        System.out.println("Min No is "+min);
        int min1= list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min No using is Comparator:" + min1);

        //filter Example
        System.out.println("Filter Even no from the list :");
        list.stream().filter(no->no%2==0).forEach(System.out::println);

        //Map Example
        System.out.println("from list add 2 in each element: ");
        list.stream().map(no->no+2).forEach(System.out::println);
    }
}
