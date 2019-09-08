package model;

public class HelloName {
    private String name;

    public HelloName (){
    }

    public HelloName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name + " !!!");
    }

    public void setName(String name) {
        this.name = name;
    }
}
