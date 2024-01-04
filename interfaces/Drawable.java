package interfaces;

public interface Drawable {
    void draw();
    default void erase(){
        System.out.println("Erasing drawing");
    }
    default void printInfo(){
        System.out.println("Drawing info");
    }
}
