class Patient {
    private String name;
    private int age;
    private String gender;
    private double weight, height, bmi;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; 
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi; 
    }
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
}

public class HealthMetric2 {
    
    public static void calculate(Patient object) {
        System.out.println("\n" + object.getName() + " BMI ");
        object.setHeight(object.getHeight() / 100);
        object.setBmi(object.getWeight() / (object.getHeight() * object.getHeight()));
        System.out.println("BMI = " + object.getBmi());
        calculate(object.getAge(), object.getBmi());
        calculate(object.getAge(), object.getBmi(), object.getGender());
    }

    public static void calculate(int age, double bmi) {
        if (bmi > 25)
            System.out.println("Body age = " + (age + 5));
        else if (bmi < 18.5)
            System.out.println("Body age = " + (age + 2));
        else
            System.out.println("Body age = " + age);
    }

    public static void calculate(int age, double bmi, String gender) {
        System.out.print("Body fat rate: ");
        if (gender.equalsIgnoreCase("male"))
            System.out.println(((1.2 * bmi) + (0.23 * age) - 16.2) + "%");
        else 
            System.out.println(((1.2 * bmi) + (0.23 * age) - 5.4) + "%");
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.setName("Aa");
        patient1.setAge(21);
        patient1.setGender("male");
        patient1.setWeight(77.0);
        patient1.setHeight(181.5);
        calculate(patient1);

        Patient patient2 = new Patient();
        patient2.setName("Bb");
        patient2.setAge(34);
        patient2.setGender("male");
        patient2.setWeight(89.6);
        patient2.setHeight(155.0); 
        calculate(patient2);
    }
}