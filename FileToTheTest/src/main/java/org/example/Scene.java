package org.example;

import javax.swing.*;
import java.awt.*;
// כאשר אנחנו משתמשים בספריה של swing נגיר את המחלקה הראשית ב חלון שיורש מ- JFrame
// ניצור לה בנאי ונעביר ונגדיר בבנאי את הסצנה
// כל סצנה אחראית לצייר את עצמה! סצנה לא יכולה לצייר סצנות אחרות
// אם הסצנה שלי מכילה מספר אובייקטים שאותם היא רוצתה להדפיס לכל אחד מהם ניצור מחלקה ובתוכה נשים את המתודה:
// public void paint (Graphics graphics )
// {
//     graphics.fillRect( this.x , this.y , this.width , this.height) ; - וזה יצייר את האבוייקט שלנו
//}
// ואז במחלקה painComponent של הסצנה נזמן את האובייקט של המחקלה שאותו נרצה לצייר עם המתודה שלו של paint ונעביר לו את graphics כפרמטר
//  public void paintComponent (Graphics graphics) // אם אני רוצה לצייר את הכפתור איך שאני רוצהאני דורסת את המימוש שלו על ידי הפונקציה הזו
//    {
//        super.paintComponent(graphics);
//        graphics.setColor(Color.BLACK) ;
//        this.hero(שם המחלקה של הארובייקט אותו נרצה לצייר).paint(graphics) ;
//
//    }

public class Scene extends JPanel // jpanel מאפשרת לי להשאר בפריים הוקדם עד שהפריים הבא יופיע כדי להמנע מריצודים
{
    private int width ;
    private int height ;
    private int x ;
    private int y ;
    public Scene ( int x ,int y ,int width , int height , Color color)
    {
        this.x = x ;
        this.y = y ;
        this.width = width ;
        this.height = height ;
        this.setDoubleBuffered(true); // מציינת לי שיש לי שכבה כפולה של פריימים ועד שהפריים הבא לא מצוייר אני לא מוחקת את הפריים הנוכחי
        this.setBounds(x , y ,width , height);
        this.setBackground(color);


    }
}
