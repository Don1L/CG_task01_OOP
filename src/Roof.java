import java.awt.*;

public class Roof extends DrawableObject {
    private final Color color;
    private final int[] xPoints;
    private final int[] yPoints;

    public Roof(int[] xPoints, int[] yPoints, Color color) {
        super(0, 0, 0, 0); // x, y, width, height не используются
        this.xPoints = xPoints;
        this.yPoints = yPoints;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
}