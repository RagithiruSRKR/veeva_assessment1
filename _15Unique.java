import java.util.HashSet;
import java.util.Set;

class Unique {
    public static void main(String[] args) {
        Set<String> usernames = new HashSet<>();

        usernames.add("alice");
        usernames.add("bob");
        usernames.add("charlie");
        usernames.add("alice");

        System.out.println("Usernames:");
        for(String username : usernames) {
            System.out.println(username);
        }

        if(usernames.contains("bob")) {
            System.out.println("Username 'bob' exists.");
        }
    }
}



