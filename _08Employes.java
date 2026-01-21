import java.util.Set;
import java.util.TreeSet;

class Employes {

    public static void main(String[] args) {

        Set<String> employeeNames = new TreeSet<>();

        
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("David");
        employeeNames.add("Alice"); 

    
        System.out.println("Employee Names in Sorted Order:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
