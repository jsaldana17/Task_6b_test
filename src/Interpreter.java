import w16cs350.controller.command.behavioral.A_CommandBehavioral;
import w16cs350.controller.command.behavioral.CommandBehavioralBrake;
import w16cs350.controller.command.behavioral.CommandBehavioralSelectBridge;

import java.util.ArrayList;

/**
 * Created by Jesus on 2/23/16.
 */
public class Interpreter
{

    public Interpreter(){}

    public void interpret(ArrayList<String> list)
    {

        //Categories
        /*
            0. *SPECIAL*
            1. DO
                BRAKE
                SELECT
                SET

            2. CREATE
                POWER
                STOCK
                    CAR
                    ENGINE
                TRACK
                    BRIDGE
                        DRAW
                    CROSSING/CURVE etc...
                    SWITCH
                        TURNOUT
                        WYE
            3. OPEN
            4. CLOSE
            5. COMMIT
            6. COUPLE
            7. LOCATE
            8. UNCOUPLE
            9. *SPECIAL*
         */

        String token;
        token = list.remove(0);
        //check validity of input here

        switch(token)
        {
            case "DO":  A_CommandBehavioral commandBehavioral = behavioral(list);
                        break;

        }

    }


    public A_CommandBehavioral behavioral(ArrayList<String> list)
    {
        String token = "";

        switch (list.remove(0))
        {
            case "BRAKE": return new CommandBehavioralBrake(list.remove(0));

            case "SELECT": return behavioralSelect(list);

            case "SET": break;
        }

        System.out.println();
        return null; //remove, for compiler

    }

    public A_CommandBehavioral behavioralSelect(ArrayList<String> list)
    {

        String token = list.remove(0);
        boolean isUpElseDown = false;

        switch (token)
        {
            case "DRAWBRIDGE":
                String id = list.remove(0);
                if(list.contains("1")){isUpElseDown = true;}
                list.clear();
                return new CommandBehavioralSelectBridge(id, isUpElseDown);
        }

        return null;
    }


}
