import java.awt.*;

abstract class DrawableObject implements DrawObject {
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public DrawableObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}