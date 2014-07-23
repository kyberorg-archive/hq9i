package net.virtalab.hq9.interpreter;

import java.util.IllegalFormatException;

/**
 * Does interpretation
 */
public class Interpreter {

    private String result;

    public static Interpreter init(){
        return new Interpreter();
    }

    /**
     * Does all jobs and saves interpretation results to result var
     *
     * @param code HQ9+ code to interpret
     * @throws java.util.IllegalFormatException when there is Syntax error
     */
    public void run(String code) throws IllegalFormatException{

    }

    /**
     *
     * @return gives
     */
    public String getResult() {
        return this.result;
    }
}
