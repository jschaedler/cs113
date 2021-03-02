public class Die {

    private int faceValue;
    private final int MAX = 6;

    public Die() {
        roll();
    }

    public void roll() {
        faceValue = (int) (Math.random() * MAX) + 1;

    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int newFace) {
        faceValue = newFace;
    }

    public String toString() {
        String info = "" + faceValue;
        return info;
    }

    public boolean equals(Die die2) {
        if (die2.getFaceValue() == faceValue)
            return true;
        else
            return false;
    }

    public int compareTo(Die die2) {
        if (faceValue < die2.getFaceValue())
            return -1;
        else if (faceValue == die2.getFaceValue())
            return 0;
        else
            return 1;

    }
}
