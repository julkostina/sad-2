package LIbraries;

import javax.swing.*;
import java.awt.*;

/**
 * class GTK  implements  Libraries and has Draw method for drawing the element like GTK library does
 */
public class GTK  implements  Libraries {
    /**
     * method Draw for drawing figure in the way it is implemented in GTK library
     * @param figure for drawing concrete figure
     */
    @Override
    public void Draw(String figure) {
        System.out.println("This "+figure+" was drawn using QT library");
    }
}
