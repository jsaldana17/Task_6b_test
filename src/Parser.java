import java.util.ArrayList;

/**
 * Created by Jesus on 2/23/16.
 */
public class Parser
{

    private Interpreter interpreter;

    public Parser(String command)
    {
        interpreter = new Interpreter();
        split(command);
    }


    public void split(String s)
    {
        String [] sAra = s.split(" ");
        ArrayList<String> list = new ArrayList<>();

        //put in array list
        for (int i = 0; i < sAra.length; i++) {
            list.add(sAra[i]);
        }
        sAra = null;

        interpreter.interpret(list);


    }


}
