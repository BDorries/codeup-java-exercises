import util.Input;

import static org.apache.commons.lang3.StringUtils.*;

public class MavenExercises {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Type stuff");
        String input = in.getString();
        String isANumber = "is not";
        if(isNumeric(input)){
            isANumber = "is";
        }
        System.out.println("You entered: " +input);
        System.out.println("That " +isANumber +" a number.");
        System.out.println("If we flip the case it becomes: "+swapCase(input));
        System.out.println("Reversed, it would be: "+reverse(input));
    }
}
