public class BandBooster {

    private String name;
    private int boxesSold;

    public BandBooster(String name) {
        this.name = name;
        boxesSold = 0;

    }

    public String getName() {
        return name;

    }

    public void updateSales(int boxes) {
        boxesSold += boxes;
    }

    public String toString() {
        String info = name + " " + boxesSold + " boxes";
        return info;
    }

}
