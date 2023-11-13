package List;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class List {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Pop Ioan");
        students.add("Popescu George");
        students.add("Ciumac Madalina");

        students.remove(2);

        java.util.List<String> Students = students.stream().filter(s -> (s.startsWith("P"))).collect(Collectors.toList());
        System.out.println("Numele studentilor care incep cu P: " + Students);

    }
}
