package net.virtalab.hq9.interpreter;

/**
 * Stub meanless stuff (we should start from something)
 *
 */
public class App {
    public static String LINE = "Hello, here will be HQ9+ interpeter soon. Stay turned and check our repo at GitHub";

    /**
     * App starts here
     *
     * @param args incoming arguments. Consider look into usage section (later we will add it)
     */
    public static void main(String[] args){
        System.out.println(getLine());
    }

    /**
     * Dummy getter for Stub Unit Test
     *
     * @return line to print
     */
    public static String getLine(){
        return LINE;
    }
}
