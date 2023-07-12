package org.example;

import javax.swing.*;
import java.awt.*;

public class Square extends JButton // בניית משבצות למשחק שחמט
{
    private Color background ;
    private int content  ;
    public static final int MARGIN = 10 ;

    public Square(Color background, int content) {
        this.background = background;
        this.content = content;
    }
    public void paintComponent (Graphics g) // אם אני רוצה לצייר את הכפתור איך שאני רוצהאני דורסת את המימוש שלו על ידי הפונקציה הזו
    {
        super.paintComponent(g); // תעשה את כל הפעולות שאתה רגיל לעשות
        this.setBackground(this.background); // + תוסיף את הפעולה שאני הגדרתי לך לעשות
        g.fillRect(100 , 100 , 100 , 100); // מצייר מלבן
        if (content != 0 )
        {
            g.setColor(Color.YELLOW);
            g.fillOval(this.getX() + MARGIN  , this.getY() - MARGIN , this.getWidth() + MARGIN * 2 , this.getHeight() - MARGIN * 2); // צייר לי מעגל
        }

    }

    @Override
    public Color getBackground() {
        return background;
    }

    @Override
    public void setBackground(Color background) {
        this.background = background;
    }
}
