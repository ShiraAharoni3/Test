package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// keyListener אחראי על כל הקשר בין הממשק שלנו לבין המקדלת
// בנוסף כשאר אנחנו יורשים אנו חייבים לזמן את 3 הפונקציות האלו
public class KeyBourd implements KeyListener
{
    // את המחלקה הזו נזמן בסצנה הראשית ע"י הוספת דרך יצירת אובייקט שלה לדוגמא
    // בסצנה הראשית נרשום:
    //this.setFocusable(true);
    //this.requestFocus(); - מעביר את הפוקוס לסצנה שבה המצודה הזוט מופיעה
    // this.addKeyListener(new KeyBourd());
    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e) // לחיצה
    {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) // בתוך KeyEvent יש לנו את כל המקשים שקיימים במקלדת ואז נוכל לבחור איך הוא יתנהג בהתאם ללחיצה על כפתור מסויים
        {

        }
        // פה לעדכן את מה שאני רוצה שיקרה במידה ונלחץ משהו
        //this.Scene.repaint(); - אחרי כל שינוי להדפיס מחדש את הסצנה הראשית

    }

    @Override
    public void keyReleased(KeyEvent e) // הרמת האצבע מהמקלדת
    {

    }
}
