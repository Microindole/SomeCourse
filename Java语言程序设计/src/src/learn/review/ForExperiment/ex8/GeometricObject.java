package learn.review.ForExperiment.ex8;

public class GeometricObject {
    private double size;

    GeometricObject(){}

    GeometricObject(double size){
        this.size = size;
    }

    public double getSize(){
        return this.size;
    }

    @Override
    public String toString(){
        return "Size is " + this.size;
    }
}
