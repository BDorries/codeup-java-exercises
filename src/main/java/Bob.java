import javax.swing.*;

public class Bob {
    public static void main(String[] args) {
        boolean leave = false;
        String prefix = "Bob says: ";
        String response = "";
        while(!leave){
            String input = JOptionPane.showInputDialog("What would you like to say to Bob?\nType \"leave\" to exit");
            if (input.charAt(input.length()-1) == '?'){
                response = prefix+"\"Sure, man. Whatever\"";
            }else
                if(input.charAt(input.length()-1) == '!'){
                    response = prefix+"\"Whoa, chill bro\"";
            }else
                if(input.equalsIgnoreCase("leave") ){
                    response = prefix+"\"k. See ya, bro.";
                    leave = true;
            } else{
                    response = prefix+"\"Whatever, bro.";
                }
            JOptionPane.showMessageDialog(null, response);
        }
    }
}
