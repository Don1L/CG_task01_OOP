import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class DrawingPanel extends JFrame implements ActionListener {
    private final int BACKGROUND_WIDTH = 800;
    private final int BACKGROUND_HEIGHT = 800;
    private final int TIMER_DELAY = 10000;
    private final Timer timer = new Timer(TIMER_DELAY, this);
    private int ticksFromStart = 0;

    private final ArrayList<DrawObject> drawableObjects = new ArrayList<>();

    public DrawingPanel() {
        setTitle("Drawing panel");
        setSize(BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Добавляем объекты для отрисовки
        drawableObjects.add(new Grass(0,0,800,500,Color.BLUE));
        drawableObjects.add(new HouseWall(300, 350, 200, 150, Color.ORANGE));
        drawableObjects.add(new Chimney(450, 250, 30, 80, Color.GRAY));

        int[] xPoints = {250, 400, 550};
        int[] yPoints = {350, 250, 350};
        drawableObjects.add(new Roof(xPoints, yPoints, Color.RED));

        drawableObjects.add(new Window(350, 390, 50, 50, Color.BLUE));
        drawableObjects.add(new Window(440, 400, 50, 100, Color.LIGHT_GRAY));

        drawableObjects.add(new Grass(0, 500, 800, 300, Color.GREEN));

        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Очищаем экран перед рисованием
        Graphics2D g2d = (Graphics2D) g;

        for (DrawObject obj : drawableObjects) {
            obj.draw(g2d);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}