class Person {
    void showRole() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    void showRole() {
        System.out.println("I am a student");
    }
}

class TestRole {
    public static void main(String[] args) {
        Student p = new Student();
        
        p.showRole();
    }
}
