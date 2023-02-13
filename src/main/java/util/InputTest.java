package util;

public class InputTest {
    public static void main(String[] args) {

        String prompt = "This is the prompt";

        Input in = new Input();
        System.out.println(in.yesNo("y"));
        System.out.println(in.yesNo("Y"));
        System.out.println(in.yesNo("Yes"));
        System.out.println(in.yesNo("YES"));
        System.out.println(in.yesNo("yes"));
        System.out.println(in.yesNo("foo"));

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
