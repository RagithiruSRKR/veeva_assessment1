import java.util.LinkedHashMap;
import java.util.Map;

 class Maps {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new LinkedHashMap<>();

        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "Diana");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
