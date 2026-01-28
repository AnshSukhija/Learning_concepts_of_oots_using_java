package Day14;

import java.util.*;

public class Lowerbound {
    public static void addNumbers(List<? super Integer> l) {
        l.add(10);
        l.add(20);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(intList);
        addNumbers(numList);
        addNumbers(objList);

        System.out.println("intList: " + intList);
        System.out.println("numList: " + numList);
        System.out.println("objList: " + objList);
    }
}
