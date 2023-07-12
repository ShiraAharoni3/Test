package org.example;
// קוד באינטנרט רשום בצורה של html
// כדי לראות מה הקודג שרשום נלחת כפתור ימני ואז inspect
// element html : <a> - open tag , </a> - closing tag - שניהם ביחד נקראים אלמנט html
//בתוך האלמנט יש לנו תכונות ולכל תכונה יש ערך לדוגמא :
// class == "test" - תכונה בשם קלאס עם הערך טסט
// Id = "myId" - תכונה נפוצה
// יכול להיות מצב של אלמנט בתוך אלמנט כמו בדוגמא הבאה
// <a class = "test"  id = "myId" >
//    <div> </div> - אלמנט בשם דיב שנמצא בתווך אלמנט a
//</a>

import org.jsoup.Jsoup;

import javax.swing.text.Document;
import javax.swing.text.Element;
import java.io.IOException;
// לקחת את הפרוייקט מוזיקה
// לצורך חילוץ המידע נוריד את הספריה:
// <dependencies>
// <!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->
//<dependency>
//    <groupId>org.jsoup</groupId>
//    <artifactId>jsoup</artifactId>
//    <version>1.16.1</version>
//</dependency>
//</dependencies>
// כאשר נבחר את המחלקה Document נוודא שבחרנו את האופציה javax.swing.text

public class WebScraping // חילוץ מידע גלוי מהאינטרנט //נועד יותר למעצבים ופחות למהנדסי תוכנה
{

        String url = " " ; // נשים קודם כל את כתובת האתר שאותו נרצה
        Document document = null;
     /*   try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        document = (Document) Jsoup.connect(url).get();
            Element element = document.getElementByClass (class name) */
            ///System.out.println(document.title); - נותן לי את הכותרת שלי


    //String url = " " ; // נשים קודם כל את כתובת האתר שאותו נרצה

    // ניתן לחלץ מידע דרך הילד של האלמנט לדוגמא:
    // <div>
    //    <div> gfd </div> ילד 1
    //    <div> fd </div> ילד 2
    //    <div> hg </div> 3
    //</div>
    // child (2) - > hg
    // getElementById ()
    //String path = element.attr(השם של התכונה) -  יחזיר את הנתיב
    // Document article = Jsoup.connect(url + path ).get() ; - ינווט דרך האתר אל הכתובת הספציפית שביקשתי


}
