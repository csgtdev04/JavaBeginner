package graphics;

import java.awt.*;

public class Example {
    public static void main(String[] args) {
        // always need this line of code when working with graphics
        DrawingPanel drawingPanel = new DrawingPanel(1000, 1000); // paper
        Graphics drawingPen = drawingPanel.getGraphics(); // pen

//        drawABunchOfRectanglesAndOvals(drawingPen);

        int numTimes = 3;
        drawSquaresSidebySide(drawingPen, numTimes);

    }

    public static void drawSquaresSidebySide(Graphics drawingPen, int numTimes) {
        // do the implementation for this method
        int xOffset = 50;
        int xStart = 50;
        int yStart = 100;
        int size = 70;

        for (int square = 0; square < numTimes; square++) {
            drawingPen.drawRect(xStart + (size * square), yStart, size, size);
        }
    }

    public static void drawABunchOfRectanglesAndOvals(Graphics drawingPen) {
        int offset = 10;
        for(int i = 0; i < 50; i++) {
            drawingPen.setColor(Color.ORANGE);
            drawingPen.drawOval(300, 150, 70 + offset * i, 80 + offset * i);

            drawingPen.setColor(Color.MAGENTA);
            drawingPen.drawRect(100, 100, 70 + offset * i, 80 + offset * i);
        }
        drawingPen.drawString("Hello", 100, 100);
    }

}
