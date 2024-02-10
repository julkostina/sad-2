package Elements;

import LIbraries.Libraries;

/**
 * class Button extends Elements, provides basic behaviour of the button element
 */
public class Button extends Elements {
    String text;
    String form;

    /**
     * Button constructor initializes objects of Button class
     * @param form for giving form to the button
     * @param text for giving text to the button
     * @param lib for implementing button using library
     */

    public Button(String form, String text, Libraries lib){
        this.form=form;
        this.text = text;
        this.lib= lib;

    }

    /**
     * abstract method About describes basic characteristics of the button
     */
    @Override
    public void About(){
        System.out.println("Element: "+form+"button with text '"+text+"'");
        lib.Draw("button");
    }
}
