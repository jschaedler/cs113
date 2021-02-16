public class Dog {
    private String dog;
    private int age;

    public Dog() {
        dog = "dog";
        age = 0;
    }

    public String getdog() {
        return dog;
    }

    public int getAge() {
        return age;
    }

    public void setDog(String newDog) {
        dog = newDog;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void toPersonYears() {
        age *= 7;
    }

    public String toString() {
        String description = "The dog's name is " + dog + ", and his age in people years is " + age + "years old.";
        return description;

    }
}
