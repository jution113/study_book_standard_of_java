package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("박춘배", 74);
        map.put("박춘배", 72);
        map.put("김두식", 68);
        map.put("오갑수", 67);
        map.put("허춘삼", 68);

        Set set = map.entrySet(); // 박춘배:72, 김두식:68, 오갑수:67, 허춘삼:68
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e);
        }

        set = map.keySet();
        System.out.println("두덕리 품앗이 명단");

        Collection values = map.values();
        it = values.iterator();

        int ageSum = 0;

        while(it.hasNext()) {
            ageSum += (int)it.next();
        }

        System.out.println("나이 합: " + ageSum);
        System.out.println("나이 평균: " + (float)ageSum / values.size());
        System.out.println("최고 나이: " + Collections.max(values));
        System.out.println("최저 나이: " + Collections.min(values));
    }
}
