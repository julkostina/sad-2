import Elements.Button;
import Elements.Window;
import LIbraries.GTK;
import LIbraries.QT;

/**
 * class MainFile has main method
 */

public class MainFile {
    /**
     *  main method makes use of other classes and display their information to the console
     * @param args
     */
    public static void main(String[] args) {
        QT qtlib = new QT();
        GTK gtklib = new GTK();
        Button circleButton  =new Button("circle", "Hi, there!", qtlib);
        circleButton.About();
        System.out.println();
        Window brownWindow  =new Window("brown", gtklib);
        brownWindow.About();
    }
}
