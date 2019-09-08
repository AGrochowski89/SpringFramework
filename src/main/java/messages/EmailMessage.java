package messages;

public class EmailMessage implements Message{

    @Override
    public void send(String msg){
        System.out.println("I send "+msg+" using mail");
    }
}
