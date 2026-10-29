package PRAK501_2510817120015_NabilahNurAzizah;

public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    protected abstract double area();

    public String toString() {
        return shapeName;
    }
}