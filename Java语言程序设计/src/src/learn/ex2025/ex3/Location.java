package learn.ex2025.ex3;

public class Location {
    private int  row;
    private int column;
    private double maxValue;

    public Location() {
        this.row = 0;
        this.column = 0;
        this.maxValue = 0;
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double [][] a){
        int row = a.length, column = a[0].length;
        int tempRow = 0, tempColumn = 0;
        double maxValue = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(a[i][j] > maxValue){
                    maxValue = a[i][j];
                    tempRow = i;
                    tempColumn = j;
                }
            }
        }
        return new Location(tempRow, tempColumn, maxValue);
    }
}
