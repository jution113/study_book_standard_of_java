package ch11;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for(int i=0; i<objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set); // [1, 1, 2, 3, 4]

        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next()); // 1, 1, 2, 3, 4
        }
    }
}
