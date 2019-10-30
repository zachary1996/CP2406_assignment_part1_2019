import java.awt.*;

public class Sedan extends Car{
    Sedan(Road road){
        super(road);
        width = 60;
        height = 25;
    }
    public void paintMe(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(xPos, yPos, width, height);
    }
}