import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Some examples of String manipulation in Java
 */
public class StringManipulator {
    int x, y = 0;

    // concatenation with + operator gets hard to read
    String s1 = x + " plus " + y + " equals " + (x + y);

    // StringBuilder is very verbose
    String s2 = new StringBuilder()
            .append(x)
            .append(" plus ")
            .append(y)
            .append(" equals ")
            .append(x + y)
            .toString();

    // String::format separates the String from the parameter (and is hard to read)
    String s3 = String.format("%2$d plus %1$d equals %3$d", x, y, x + y);


    public void iJustWannaOpenAFile() throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }


    public void whyAreYouSoPrimitive()  {
        int iAmAPrimitive = 0;
        Integer nowIAmAClass = 100;
    }

/*
    <? extends Type>
    <? super Type>
    <?>
 */
}
