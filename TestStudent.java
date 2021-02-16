public class TestStudent {

    public static void main(String[] args) {
        Student stu1 = new Student("John", 90, 85);
        Student stu2 = new Student("Jill", 88, 98);

        System.out.println(stu1.average());
        System.out.println(stu2.average());

        System.out.println((stu1.getmid2() + stu2.getmid2()) / 2);

        System.out.println(stu1 + "\n" + stu2);

    }
}
