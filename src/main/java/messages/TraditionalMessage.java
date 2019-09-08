package messages;

public class TraditionalMessage implements Message {
    @Override
    public void send(String msg){
        System.out.println("I send "+msg+" using pidgin");
    }
}
