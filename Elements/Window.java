package Elements;

import LIbraries.Libraries;

/**
 * class Window extends Elements and provides basic behaviour of window element
 */
public class Window extends Elements{
    String color;

    /**
     * Window constructor initializes objects of Window class
     * @param color for adding color to the window
     * @param lib for implementing button using library
     */
    public Window(String color, Libraries lib){
        this.color = color;
        this.lib=lib;
    }

    /**
     * abstract method About describes basic characteristics of the window
     */
    @Override
    public void About(){
        System.out.println("Element: "+color+" window ");
        lib.Draw("window");
    }
}
