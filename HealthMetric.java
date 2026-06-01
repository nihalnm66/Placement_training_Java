
class Patient{
    String name;
    int age;
    String gender;
    double weight, height, bmi;
}
public class HealthMetric{
    public static void calculate(Patient object){
        System.out.println("\n"+object.name + " BMI ");
        object.height/=100;
        object.bmi=object.weight/(object.height*object.height);
        System.out.println("BMI = "+object.bmi);
        calculate(object.age,object.bmi);
        calculate(object.age,object.bmi,object.gender);
    }
    public static void calculate(int age, double bmi){
        if(bmi>25)
            System.out.println("Body age = " + (age+5));
        else if(bmi<18.5)
            System.out.println("Body age = " + (age+2));
        else
            System.out.println("Body age = " +age);
    }
    public static void calculate(int age, double bmi,String gender){
        System.out.println("Body fat rate:");
        if(gender.equals("male"))
            System.out.print((1.2*bmi)+(0.23*age)-16.2);
        else 
            System.out.print((1.2*bmi)+(0.23*age)-5.4);
    }
    public static void main(String[] args){
        Patient patient1=new Patient();
        patient1.name="Aa";
        patient1.age=21;
        patient1.gender="male";
        patient1.weight=77.0;
        patient1.height=181.5;
        calculate(patient1);
        Patient patient2=new Patient();
        patient2.name="Bb";
        patient2.age=34;
        patient2.gender="male";
        patient2.weight=89.6;
        patient2.height=155;
        calculate(patient2);
    }
}