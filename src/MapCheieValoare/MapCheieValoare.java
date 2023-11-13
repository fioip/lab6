package MapCheieValoare;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class MapCheieValoare {

    public static void main(String[] args) {
        Map<String, Integer> note = new HashMap<>();
        note.put("Gabi", 5);
        note.put("Ana", 10);
        note.put("Maria", 8);
        note.put("Cristian", 10);
        System.out.println(note);

        System.out.println("Nota lui Gabi este: " + note.get("Gabi"));

        Map<String, Integer> result = note.entrySet().stream().filter(n -> n.getValue().equals(10)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Note de 10: "+result);
    }

}
