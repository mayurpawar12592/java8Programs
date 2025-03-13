import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaCodingPractice {
    public static void main(String[] args) {

        //Given list of integers seprate even and odd no from list
        List<Integer> list = List.of(5, 12, 14, 8, 13, 9, 4);
        Map<Boolean, List<Integer>> evenOddMap = list.stream().collect(Collectors.partitioningBy(no -> no % 2 == 0));
        System.out.println(evenOddMap);
        System.out.println("Even No's are :"+evenOddMap.getOrDefault(true,List.of()));
        System.out.println("Odd No's are :"+evenOddMap.getOrDefault(false,List.of()));

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


    }
}