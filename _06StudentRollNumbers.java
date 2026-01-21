import java.util.LinkedHashSet;
import java.util.Set;

public class StudentRollNumbers {

    public static void main(String[] args) {

        
        Set<Integer> rollNumbers = new LinkedHashSet<>();

        
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(101); 
        rollNumbers.add(104);

    
        System.out.println("Student Roll Numbers Insertion Order Preserved");
        for (int roll : rollNumbers) {
            System.out.println(roll);
        }
    }
}
