public class Person {

    private String name;

    Person(String str){
        name = str;
    }
    public String getName(){
        return name;
    }

    public void setName(String str){
        name = str;
    }
    public void sayHello(){
        System.out.println("Hello, " +name);
    }
}
