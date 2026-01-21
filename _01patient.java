class Patient {

    String name;
    double height;
    double weight;

    Patient(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double computeBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {

        Patient p1 = new Patient("veeva", 1.55, 60);

        double bmi = p1.computeBMI();
        System.out.println("Patient Name: " + p1.name);
        System.out.println("BMI: " + bmi);
    }
}
