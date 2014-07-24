package net.virtalab.hq9.interpreter;

/**
 * Provides usage
 */
public class Usage {
    /**
     * Shows usage
     * @return
     */
    public static String show(){
        StringBuilder usage = new StringBuilder();

        usage.append("Usage: hq9i <code>").append(System.lineSeparator());
        usage.append("Example: hq9i HQ");

        return usage.toString();
    }
}
