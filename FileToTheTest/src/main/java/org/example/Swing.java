package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Swing extends JFrame // ספריה גרפית - ספריה אוסף שלח מחלקות שמישהו אחר רשם
{
    //JFrame - מחלקה שיודעת להציג חלון
    // JLabel - text
    // JButton - כפתור
    // x -> ככל שהאיקס גדל כך מתקדמים ימינה
    // y ->  ככל שערך ה y גדל כך אנחנו יורדים למטה
    // ראשית הצירים נמצאת בצד שמאל למעלה (0, 0)
    // הגדרת ערכים קבועים שהם יופיעו בתחילת החלון ולפי הערכים שלהם אני אמקם את האובייקטים שעל החלון
    public static final int START_X = 0 ;
    public static final int BOARD_SIZE = 3 ;
    public static final int START_Y = 0 ;
    public static final int WINDOW_WIDTH = 600 ;
    public static final int WINDOW_HEIGHT = 800 ;
    public Swing ()
    {

        //JLabel title = new JLabel("0" ) ; // ייצרנו אובייקט של text - הבני שלה יכול לא לקבל כלום / לקבל את הטקסט
        //this.add(title) ; // - ככה מקשרים בין האובייקט לחלון
        this.setLayout(null); // מגדירה את שיטת הפריסה של העמוד. ברגע שsetLayout הוא null זה אומר שאני קובעת איפה כל רכיב יהיה
        /*GridLayout gridLayout = new GridLayout(BOARD_SIZE,  BOARD_SIZE) ; // מגדירה בעצמה את שיטת הפריסה ולכן נצטרך למחוק את setlayout הבנאי שלו מקבל מספר שורות ומספר עמודות
        this.setLayout(gridLayout);
        for ( int i = 0 ; i < BOARD_SIZE * BOARD_SIZE ; i++)
        {
            int number = i+ 1 ;
            Square square = new Square(blackOrWhite(number) , number) ;
            square.addActionListener((e) ->
            {
                if(square.getBackground() == Color.BLACK)
                {
                    square.setBackground(Color.PINK);
                }
                else
                    square.setBackground(Color.GRAY);


            });
            this.add(square);
        }*/


        //title.setBounds(START_X , START_Y , START_WIDTH , START_HEIGHT); // המיקום שאני בוחרת שבו יופיע האובייקט שלי במקרה הזה הכותרת
       /* JButton myButton = new JButton("my button") ; // ייצרנו אובייקט של button  - הבני שלה יכול לא לקבל כלום / לקבל את הטקסט
        this.add(myButton);
        myButton.setBounds(title.getX(), title.getY() + title.getHeight() , title.getWidth() , title.getHeight());
        // title.getY() + title.getHeight() - חישוב מאיפה מתחיל הטקסט + מה הגובה של הטקסט כדי לדעת איפה יופיע האיבר הבא
        AtomicInteger counter = new AtomicInteger();
        myButton.addActionListener( (event /* הפרמטר שהפונקציה קיבלה*//*) ->
       /* {
            String current = title.getText() ;
            int counter1 = Integer.valueOf(current) ;
            counter1 ++ ;
            title.setText(counter1 + "");
            //title.setVisible(!title.isVisible()); // הכותרת תופיע אם לפני היא לא קיימת ותעלם אם היא קיימת
            JButton newButton = new JButton("new button") ; // ייצרנו אובייקט של button  - הבני שלה יכול לא לקבל כלום / לקבל את הטקסט
            this.add(newButton);
            newButton.setBounds(myButton.getX(), myButton.getY() + myButton.getHeight() , myButton.getWidth() , myButton.getHeight());

            System.out.println( "Button clicked "); // הפעולה שקוראת כשאר הכפתור נלחץ
        })*/; // פונקציה שמבצעת פעולה בהתאם ללחיצה של כפתור היא פונקציה אנונימית ולכן ניתן לזמן אותה

       // this.setSize(400 , 400); // הגדרת גודל החלון
        this.setVisible(true); // כדי לראות את החלון אני חייבת לששנות את ערך ברירת המחדל של התצוגה ל- true
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ברגע שנסגור את החלון האפליקציה תסגר
        this.setLocationRelativeTo(null); // מגדיר את מיקום החלון במרכז העמוד
        this.setResizable(false); // למנוע מהמשתמש להגדיל ולהקטין את החלון
        this.setTitle("My App"); // להגידר כותרת לחלון שלנו
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Scene buttonsScene = new Scene(0,0 , WINDOW_WIDTH/ 4 , WINDOW_HEIGHT , Color.CYAN) ; // צריך לבנות מחלקה ל buttonsScene כי ייתכן וכל אחת מהן תתיחחס לlayout בצורה שונה
        this.add(buttonsScene) ;
        Scene mainScene = new Scene(buttonsScene.getWidth(),0 , WINDOW_WIDTH - buttonsScene.getWidth() , WINDOW_HEIGHT , Color.red) ;
        this.add(mainScene) ;


    }
    public static Color blackOrWhite(int number)
    {
        Color color =Color.BLACK ;
        if (number % 2 == 0)
        {
            color = Color.WHITE ;
        }
        return color ;
    }


}
