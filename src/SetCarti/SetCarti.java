package SetCarti;

import java.util.HashSet;
import java.util.stream.Collectors;

public class SetCarti {
    public static void main(String[] args) {
        HashSet<String> carti = new HashSet<String>();

        carti.add("Poezii de Mihai Eminescu");
        carti.add("Baltagul");
        carti.add("Un sir infinit de testoase");
        carti.add("Baltagul");

        System.out.println(carti);
        System.out.println(carti.contains("Baltagul"));

        java.util.Set<String> carte = carti.stream().filter(c -> (c.startsWith("B"))).collect(Collectors.toSet());
        System.out.println("Numele incepe cu B: " + carte);
    }
}
