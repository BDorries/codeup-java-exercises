public class Person {

    private String name;

    Person(String str){
        name = str;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, " +name);
    }
}
