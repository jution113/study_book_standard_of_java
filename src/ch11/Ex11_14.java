package ch11;

import java.util.TreeSet;

public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abd"); set.add("alien"); set.add("bat");
        set.add("car"); set.add("Car"); set.add("disc");
        set.add("dance"); set.add("dZZZZZ"); set.add("dzzzz");
        set.add("elepjant"); set.add("elevator"); set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to); // range search : from b to d
        System.out.println("result1 : " + set.subSet(from, to)); // result1
        System.out.println("result2 : " + set.subSet(from, to + "zzz")); // result2
    }
}
