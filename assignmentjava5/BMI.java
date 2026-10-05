package assignmentjava5;


public class BMI {
    // fields
    private String name;
    private int age;
    private double weight;
    private double height;

    // constructor
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // constructor with default age
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    // calculate BMI
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    // get BMI status
    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // toString
    public String toString() {
        return "BMI:" +
                "\n\tName: " + name +
                "\n\tAge: " + age +
                "\n\tWeight: " + weight +
                "\n\tHeight: " + height +
                "\n\tBMI: " + getBMI() +
                "\n\tStatus: " + getStatus() +
                "\n";
    }
}


class TestBMI {
    public static void main(String[] args) {

        // Test constructor
        BMI person1 = new BMI("saeda", 20, 150, 65);

        // Test toString()
        System.out.println(person1);

        // Test getters
        System.out.println("name is: " + person1.getName());
        System.out.println("age is: " + person1.getAge());
        System.out.println("weight is: " + person1.getWeight());
        System.out.println("height is: " + person1.getHeight());

        // Test getBMI()
        System.out.println("BMI is: " + person1.getBMI());

        // Test getStatus()
        System.out.println("Status is: " + person1.getStatus());

        // Test second constructor
        BMI person2 = new BMI("farax", 180, 70);

        System.out.println("\nSecond person:");
        System.out.println(person2);
    }
}
