package com.svlugovoy.youtube300plus.q24q25;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 18.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        String arg = "100";

        try {
            int value1 = Integer.parseInt(arg); // возвращает int
            int value2 = Integer.valueOf(arg); // возвращает Integer
            int value3 = new Integer(arg); // создает Integer
        } catch (NumberFormatException ex){
            System.out.println("Wrong format " + ex);
        }

        int value = 200;

        String arg1 = Integer.toString(value);
        String arg2 = String.valueOf(value);
        String arg3 = "" + value;
    }

    Integer iobj = 100; // Integer iobj = new Integer(100);
    int iprim = iobj; // int iprim = iobj.intValue();

//    Float fl = 7;
    Float fl1 = (float)7; // Float fl1 = new Float(7);

}
