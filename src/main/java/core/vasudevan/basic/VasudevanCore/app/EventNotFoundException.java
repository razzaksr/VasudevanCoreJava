package core.vasudevan.basic.VasudevanCore.app;

public class EventNotFoundException extends Exception{
    public EventNotFoundException(){
        super("Event not in the record");
    }
}
