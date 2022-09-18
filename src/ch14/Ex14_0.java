package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {
    public static void main(String[] args) {
        // 컬랙션을 스트림으로 .stream()
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream1 = list.stream();
        intStream1.forEach(System.out::println);

        // 재사용이 불가하여 스트림 재생성
        intStream1 = list.stream();
        intStream1.forEach(System.out::println);

        // 배열을 스트림으로
        String[] strArr = {"a", "b", "c", "d"};
//        Stream<String> strStream = Stream.of(strArr);
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        int[] intArr1 = {1, 2, 3, 4, 5};
        IntStream intStream2 = IntStream.of(intArr1);
//        IntStream intStream2 = Arrays.stream(intArr1);
//        intStream2.forEach(System.out::println);
        System.out.println("count=" + intStream2.count());
//        System.out.println("sum=" + intStream2.sum());
//        System.out.println("average=" + intStream2.average());

        Integer[] intArr2 = {1, 2, 3, 4, 5};
        Stream<Integer> intStream3 = Arrays.stream(intArr2);
    }
}