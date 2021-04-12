public class VirusStrain {
    /**
     * A virus strain is represented by its name and the strengthStrength is
     * expected to be a number between 1-10, 10 being the highest strength.The
     * stronger the virus the more symptoms it can cause.A vaccine containing a
     * strain with high strength can potentially protect more.
     */
    private String name;
    private int strength;

    public VirusStrain(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int s) {
        strength = s;
    }

    public String toString() {
        return name + " strength: " + strength;
    }
}
