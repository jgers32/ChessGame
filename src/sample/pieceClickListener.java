package sample;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// this class is what picks up when the user clicks their mouse on a rectangle and the event handler handles the rest from there

public class pieceClickListener extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        //super.mouseClicked(e);
        System.out.println(e.getX() + "," + e.getY());
    }
}