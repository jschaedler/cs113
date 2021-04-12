public class Practice2F {
    public double[] bestInMonths(double[][] famCellBills) {
        int col = famCellBills.length;
        double[] minMonthly = new double[col];
        double minPrice = Double.MAX_VALUE;

        for (int i = 0; i < col; i++) {
            for (int row = 0; row < famCellBills[col].length; row++) {
                if (famCellBills[row][i] < minPrice)
                    minPrice = famCellBills[row][i];
            }
            minMonthly[i] = minPrice;
        }

        return minMonthly;
    }
}
