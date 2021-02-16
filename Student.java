public class Student {

    private String name;
    private int mid1;
    private int mid2;

    public Student(String name, int mid1, int mid2) {
        this.name = name;
        this.mid1 = mid1;
        this.mid2 = mid2;
    }

    public String getname() {
        return name;
    }

    public int getmid1() {
        return mid1;
    }

    public int getmid2() {
        return mid2;
    }

    public String setname(String newName) {
        name = newName;
        return name;
    }

    public int setMid1(int newMid1) {
        mid1 = newMid1;
        return mid1;
    }

    public int setMid2(int newMid2) {
        mid2 = newMid2;
        return mid2;
    }

    public double average() {
        return (mid1 + mid2) / 2;
    }

    public String toString() {
        String info = new String("Student: " + name + "\nMidterm 1 Grade: " + mid1 + "\nMidterm 2 Grade: " + mid2);
        return info;
    }

}
