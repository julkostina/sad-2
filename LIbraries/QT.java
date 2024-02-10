package LIbraries;

import java.awt.*;

/**
 * class QT  implements  Libraries and has Draw method for drawing the element like QT library does
 */
public class QT implements Libraries{
    /**
     * method Draw for drawing figure in the way it is implemented in QT library
     * @param figure for drawing concrete figure
     */
    @Override
    public void Draw(String figure){
        System.out.println("This "+figure+" was drawn using QT library");
    }
}
