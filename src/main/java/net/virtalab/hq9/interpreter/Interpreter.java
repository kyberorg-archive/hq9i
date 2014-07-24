package net.virtalab.hq9.interpreter;

/**
 * Does interpretation
 */
public class Interpreter {

    private StringBuilder result = new StringBuilder();

    public static Interpreter init(){
        return new Interpreter();
    }

    /**
     * Does all jobs and saves interpretation results to result var
     *
     * @param code HQ9+ code to interpret
     * @throws java.util.IllegalArgumentException when there is Syntax error
     */
    public void run(String code) throws IllegalArgumentException{
        StringBuilder quine = new StringBuilder();
        //counter (inaccessible, but up to language spec)
        int cnt = 0;

        char[] letters = code.toCharArray();
        for (int i = 0; i < letters.length  ; i++) {
            char letter = letters[i];
            quine.append(letter);
            switch (letter){
                case 'H':
                case 'h':
                    result.append("Hello world");
                    break;
                case 'Q':
                case 'q':
                    result.append(quine.toString());
                    break;
                case '9':
                    result.append("Poem");
                    break;
                case '+':
                    cnt++;
                    break;
                default:
                    throw new IllegalArgumentException("Syntax error");
            }
            quine.append(System.lineSeparator());
            result.append(System.lineSeparator());
        }
        //last new line don't needed
        result.setLength(result.length() - 1);

    }

    /**
     *
     * @return gives
     */
    public String getResult() {
        return this.result.toString();
    }
}
