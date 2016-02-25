
import w16cs350.Startup;
import w16cs350.controller.Controller;
import w16cs350.controller.cli.CommandLineInterface;
import w16cs350.controller.cli.parser.CommandParser;

import java.io.StringReader;

public class mainTester {


    public static void main(String [] args)
    {

        Startup startup = new Startup();
        startup.go();

        String command = "DO SELECT DRAWBRIDGE 5 POSITION 1";
        Parser parser = new Parser(command);
        System.out.println();

        /*
        String command = "@EXIT";

        StringReader reader = new StringReader(command);
        Controller controller = new Controller();
        CommandLineInterface lineInterface = new CommandLineInterface(controller);
        CommandParser parser = new CommandParser(reader);
*/
    }



}
