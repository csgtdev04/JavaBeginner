package graphics;

import java.awt.*;

public class Example {
    public static void main(String[] args) {
        // always need this line of code when working with graphics
        DrawingPanel drawingPanel = new DrawingPanel(1000, 1000); // paper
        Graphics drawingPen = drawingPanel.getGraphics(); // pen

//        drawABunchOfRectanglesAndOvals(drawingPen);

        int numSquares = 13;
//        drawSquaresSidebySide(drawingPen, numSquares);
//        drawSquaresSidebySide2(drawingPen, numSquares);
//        makeSnowman(drawingPen);
        graphicsHomework(drawingPen);

    }

    public static void graphicsHomework(Graphics drawingPen) {
        // set values for how many rows you want, circle size, xStart, and yStart
        final int NUM_ROWS = 5;
        int circleSize = 50;
        int xStart = 100;
        int yStart = 100;

        // have 5 rows [0 -> 4; 0, 1, 2, 3, 4]
        for (int row = 0; row < NUM_ROWS; row++) {
            int numCircles = row + 1; // on the "0th" row, you want 1 circle - pattern!
            // have a for loop to draw numCircles
            for (int circle = 0; circle < numCircles; circle++) {
                drawingPen.drawOval(xStart, yStart, circleSize, circleSize);
                // since we are moving to the right, add circleSize to xStart
                xStart += circleSize;
            }
            // when we are done with the current row, go back to the beginning, so set xStart
            // back to 100 and move down so add circleSize to yStart
            xStart = 100;
            yStart += circleSize;
        }
    }

    public static void drawSquaresSidebySide(Graphics drawingPen, int numSquares) {
        // do the implementation for this method
        int xStart = 50;
        int yStart = 100; // same all the times, we are not going up and down
        // (50, 100)
        int size = 70;

        for (int square = 0; square < numSquares; square++) {
            drawingPen.drawRect(xStart + (size * square), yStart, size, size);
        }
    }

    public static void drawSquaresSidebySide2(Graphics drawingPen, int numSquares) {
        // do the implementation for this method
        int xStart = 50;
        int yStart = 200; // same all the times, we are not going up and down
        int size = 70;

        drawingPen.drawRect(xStart, yStart, size, size);
        xStart += 70;
        drawingPen.drawRect(xStart, yStart, size, size);
        xStart += 70;
        drawingPen.drawRect(xStart, yStart, size, size);
    }

    public static void makeSnowman(Graphics drawingPen) {
        final int SNOWMAN_SIZE = 5;
        int xStart = 300;
        int yStart = 100;
        int size = 50;

        for (int ball = 0; ball < SNOWMAN_SIZE; ball++) {
            drawingPen.drawOval(xStart, yStart, size, size);
            xStart -= 15;
            yStart += size;
            size += 30;
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
