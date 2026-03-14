public class Human {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double height = 5.6;
        String occupation = "Engineer";
        boolean isHungry = true;

        System.out.println("--- Initial Values ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Job: " + occupation);
        System.out.println("Is hungry: " + isHungry);

        name = "Bob";
        age = 30;
        height = 6.0;
        occupation = "Designer";
        isHungry = false;

        System.out.println("\n--- Updated Values ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Job: " + occupation);
        System.out.println("Is hungry: " + isHungry);
    }
}