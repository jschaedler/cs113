public class Exam1part3q11 {
    private int numGrade;
    private char letterGrade;

    public Exam1part3q11(int grade) {
        numGrade = grade;
        if (numGrade >= 65)
            letterGrade = 'S';
        else
            letterGrade = 'U';
    }

    public int getGrade() {
        return numGrade;
    }

    public char getLetter() {
        return letterGrade;
    }

    public void setNumGrade(int grade) {
        numGrade = grade;
    }

    public void setLetterGrade(char grade) {
        letterGrade = grade;
    }

    public String toString() {
        String info = "Score: " + numGrade + ", Letter Grade: " + letterGrade;
        return info;
    }

    public boolean isSatisfactory() {
        if (letterGrade == 'S')
            return true;
        else
            return false;
    }

    public boolean equals(Exam1part3q11 grade) {
        if (letterGrade == grade.getLetter()) {
            return true;
        } else
            return false;
    }

}
