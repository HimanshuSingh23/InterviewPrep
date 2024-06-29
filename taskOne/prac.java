package taskOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class prac {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Himanshu");
        names.add("Birbal");
        names.add("Himanshu");
        names.add("Bittu");

        Stream<String> stream = names.stream();

        Map<String, Integer> freqMap = new HashMap<>();

        stream.forEach(element -> {
            if (freqMap.containsKey(element) == true) {
                int freq = freqMap.get(element);
                freqMap.put(element, freq + 1);
            } else {
                freqMap.put(element, 1);
            }
        });
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println("String: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

    }

}
