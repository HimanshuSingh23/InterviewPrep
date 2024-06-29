package taskOne;

import java.util.ArrayList;
import java.util.List;

public class prac3 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.err.println(sum);
    }

}
