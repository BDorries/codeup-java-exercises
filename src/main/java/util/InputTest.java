package util;

public class InputTest {
    public static void main(String[] args) {

        String prompt = "This is the prompt";

        Input in = new Input();

        in.getInt();
        in.getInt(prompt);
        in.getInt(1,100);
        in.getInt(1,100,prompt);

        in.getDouble();
        in.getDouble(prompt);
        in.getDouble(1,100);
        in.getInt(1,100,prompt);

    }
}
