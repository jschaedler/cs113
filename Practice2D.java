public class Practice2D {
    private String name;
    private GPA gpa;

    public Practice2D(String name, GPA gpa) {
        this.name = name;
        this.gpa = gpa;

    }

    public GPA getGPA() {
        return gpa;
    }

    public void setName(String newName) {
        name = newName;

    }

    public boolean honorRoll(GPA target) {
        return gpa.compareTo(target) >= 0;
    }

    public String toString() {
        return new String("" + name + "  " + gpa);
    }

}
