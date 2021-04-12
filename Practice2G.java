public class Practice2G {
    private VirusStrain strainA, strainB;

    public Practice2G(VirusStrain sA, VirusStrain sB) {
        strainA = sA;
        strainB = sB;
    }

    public void setStrainA(String nme, int str) {
        strainA = new VirusStrain(nme, str);
    }

    public void setStrainB(String nme, int str) {
        strainB = new VirusStrain(nme, str);
    }

    public VirusStrain getVirusA() {
        return strainA;
    }

    public VirusStrain getVirusB() {
        return strainB;
    }

    public int compareTo(Practice2G vaccine2) {
        if (strainA.getStrength() + strainB.getStrength() > vaccine2.getVirusA().getStrength()
                + vaccine2.getVirusB().getStrength())
            return 1;

        else if (strainA.getStrength() + strainB.getStrength() == vaccine2.getVirusA().getStrength()
                + vaccine2.getVirusB().getStrength())
            return 0;

        else
            return -1;

    }

    public String toString() {
        return new String("" + strainA + "\n" + strainB);
    }
}
