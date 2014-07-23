package net.virtalab.hq9.interpreter;

/**
 * Stub meanless stuff (we should start from something)
 *
 */
public class App {

    /**
     * App starts here
     *
     * @param args incoming arguments. Consider look into usage section (later we will add it)
     */
    public static void main(String[] args){
        if(args.length>=1){
            String code = args[0];
            Interpreter i = Interpreter.init();
            try {
                i.run(code);

                System.out.println("Result: ");
                System.out.println(i.getResult());
            }catch (IllegalArgumentException ife){
                System.err.println(ife.getMessage());
            }
        } else {
            System.err.println("Usage: hq9i <HQ9+ code>");
        }
    }

}
