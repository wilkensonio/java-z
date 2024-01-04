package interfaces;

public class Rectangle implements Drawable, Countable{
    @Override
    public void draw() {}
    @Override
    public void printInfo() {
        System.out.println("drawing info");
    }
}
