import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaCodingPractice {
    public static void main(String[] args) {

        //Given list of integers seprate even and odd no from list
        List<Integer> list = List.of(5, 12, 14, 8, 13, 9, 4);
        Map<Boolean, List<Integer>> evenOddMap = list.stream().collect(Collectors.partitioningBy(no -> no % 2 == 0));
        System.out.println(evenOddMap);
        System.out.println("Even No's are :"+evenOddMap.getOrDefault(true,List.of()));
        System.out.println("Odd No's are :"+evenOddMap.getOrDefault(false,List.of()));

        // How do you get three maximum numbers and three minimum numbers from the given list of integers?
        System.out.println("Three maximum numbers list ");
        list.stream().sorted().limit(3).forEach(System.out::print);

        System.out.println("Three minimum numbers list ");
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::print);
        System.out.println("========================================================================");
        //remove duplicate elements using java 8 streams
        List<Integer> lst=List.of(10,15,10,13,19,13);
        System.out.println("List with duplicate element : "+lst);
        List<Integer> distinctList=lst.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct list "+distinctList);



        // program to calculate the sum of integers in a list ?
        int sum=lst.stream().reduce(0,Integer::sum);
        System.out.println("sum of element :"+sum);

        int sum1=lst.stream().reduce(0,(no1,no2)->no1+no2);
        System.out.println("sum of element using reduce :"+sum1);

         //How do you find frequency of each character in a string using Java 8 streams?
        String str="my name is mayur";
        System.out.println("STring is "+str);
        Map<Character,Long> characterCountMap=str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("charcter count is :" +characterCountMap);

        //How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //identify weather given input is number or alphabet
        char input='5';
        System.out.println("is isLetterOrDigit :"+Character.isLetterOrDigit(input));
        System.out.println("is isAlphabetic :"+Character.isAlphabetic(input));
        System.out.println("is digit :"+Character.isDigit(input));


        // Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString =  listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println("Joined string "+joinedString);

        // How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println("merged Array "+Arrays.toString(c));


    }
}