public class FunctionalInterFaceExample {
    public static void main(String[] args) {
        calculate addition = new Addition();
        System.out.println("Result :" + addition.add(10, 20));
        addition.print();
        calculate.check();


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        calculate doAddition = new DoubleAddition();
        System.out.println("Result of double addition:" + doAddition.add(10, 20));


    }
}


@FunctionalInterface
interface calculate {

    public int add(int no1, int no2);

    default void print(){
        System.out.println("inside calculate Add");
    }

    static void check(){
        System.out.println("static check");
    }
}

@FunctionalInterface
interface calculateSub {

    public int sub(int no1, int no2);

    default void print(){
        System.out.println("inside calculateSub");
    }

    static void check(){
        System.out.println("static check");
    }
}


class Addition implements calculate {

    @Override
    public int add(int no1, int no2) {
        return no1 + no2;
    }
}


class DoubleAddition implements calculate {

    @Override
    public int add(int no1, int no2) {
        return (no1 * no1) + (no2 * no2);
    }
}

class ArithMaticOperation implements  calculate,calculateSub{

    @Override
    public int add(int no1, int no2) {
        return no1+no2;
    }

    @Override
    public int sub(int no1, int no2) {
        return no1-no2;
    }

    @Override
    public void print() {
        calculate.super.print();
        calculateSub.super.print();
    }
}