class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Буруу имэйл хаяг!");
            this.email = "invalid@example.com";
        }
    }

    public void greet() {
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old.");
        System.out.println("My email is " + email);
    }

}
