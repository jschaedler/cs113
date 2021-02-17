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
        String info = "Die with face value: " + faceValue;
        return info;
    }
}
