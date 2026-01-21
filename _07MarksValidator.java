class MarksValidator {

    public static void validateMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Invalid marks: " + marks);
        }
        System.out.println("Marks are valid: " + marks);
    }

    public static void main(String[] args) {
        try {
            validateMarks(111);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
