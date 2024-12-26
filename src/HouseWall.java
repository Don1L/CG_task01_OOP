import java.awt.*;

public class HouseWall extends DrawableObject {
    private final Color color;

    public HouseWall(int x, int y, int width, int height, Color color) {
        super(x, y, width, height);
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}