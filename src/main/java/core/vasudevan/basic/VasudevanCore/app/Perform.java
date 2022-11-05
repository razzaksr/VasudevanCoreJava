package core.vasudevan.basic.VasudevanCore.app;

import java.util.Date;

public interface Perform {
    public String schedule(Event obj);
    public String enroll(String name, String person);
    public String announce(String name,String person);
    public String cancel(String name);
    public void update(Event obj);
    public void listEvents();
    public void listBy(Date date);
    public void listBy(String host);
}
