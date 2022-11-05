package core.vasudevan.basic.VasudevanCore.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private String eveName;
    private String eveHost;
    private String eveWinner;
    private String[] evePart=new String[3];
    private Date eveDate;
    public Event(String eveName, String eveHost, Date eveDate){
        this.eveDate=eveDate;
        this.eveName=eveName;
        this.eveHost=eveHost;
    }
}
