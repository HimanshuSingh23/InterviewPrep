package taskOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prac2 {

    public static void main(String[] args) {

        List<List<String>> studentList = new ArrayList<>();

        studentList.add(Arrays.asList("Himanshu", "95"));
        studentList.add(Arrays.asList("Bittu", "75"));
        studentList.add(Arrays.asList("Birbal", "96"));
        studentList.add(Arrays.asList("Tanusree", "53"));
        studentList.add(Arrays.asList("Arthur", "91"));
        studentList.add(Arrays.asList("Aman", "92"));

        List<List<String>> sortedStudentList = studentList.stream()
                .sorted((s1, s2) -> Integer.compare(Integer.parseInt(s2.get(1)), Integer.parseInt(s1.get(1))))
                .collect(Collectors.toList());

        // Print the sorted student names and their marks
        sortedStudentList.forEach(student -> {
            System.out.println("Student: " + student.get(0) + ", Marks: " + student.get(1));
        });

    }

}
