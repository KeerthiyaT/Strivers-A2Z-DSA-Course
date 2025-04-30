java
CopyEdit
import java.util.HashMap;

public class NameFrequency {
    public static void main(String[] args) {
        String[] names = {"kiki", "jeni", "kiki", "krithi", "jeni", "kiki"};

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String name : names) {
            freqMap.put(name, freqMap.getOrDefault(name, 0) + 1);
        }

        System.out.println("Name Frequencies:");
        for (String name : freqMap.keySet()) {
            System.out.println(name + " -> " + freqMap.get(name));
        }
    }
}

