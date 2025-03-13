import java.util.List;

public class Java8Programs {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 8, 17, 15, 23, 6);
        long count = list.stream().count();
        System.out.println("Count of list no are:-" + count);

        //find ot max no from list
        int max = list.stream().max(Integer::compareTo).get();
        System.out.println("Max No is :" + max);

        // find min no from list
        int min= list.stream().min(Integer::compareTo).get();
        System.out.println("Min No is "+min);
    }
}
