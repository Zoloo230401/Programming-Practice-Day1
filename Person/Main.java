public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Zolzaya", 22, "tsetsgeezolzaya41@gmail.com");
        Person person2 = new Person("Anhzaya", 22, "anhkhzaya16@gmail.com");

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");

        person1.setAge(14);
        person2.setName("Tsetsgee");
        person2.setAge(12);
        System.out.println("Set new age and name:");
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");

        person1.greet();
        person2.greet();
    }
}
