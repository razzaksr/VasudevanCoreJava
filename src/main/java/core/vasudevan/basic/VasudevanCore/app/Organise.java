package core.vasudevan.basic.VasudevanCore.app;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Organise implements Perform{
    private Event[] evs=new Event[7];
    private static Scanner scanner=new Scanner(System.in);
    public Organise(){
        evs[0]=new Event("PiconetPPT22","CSE",new Date("12/31/2021"));
        evs[1]=new Event("BotsShop22","Mech",new Date("01/07/2022"));
        evs[2]=new Event("Sparks22","ECE",new Date("10/29/2022"));
        evs[3]=new Event("Graze2022","EEE",new Date("9/20/2022"));
        evs[4]=new Event("InfomatixPPT21","IT",new Date("4/19/2021"));
        evs[5]=new Event("ToolTaught20","Mech",new Date("01/07/2020"));
        evs[6]=new Event("Transformers20","ECE",new Date("10/29/2022"));
    }
    @Override
    public String schedule(Event obj) {
        try{
            for(int index=0;index<evs.length;index++){
                if(evs[index]==null){
                    evs[index]=obj;
                    return obj.getEveName()+" has scheduled by "+obj.getEveHost();
                }
            }
            throw new EventNotFoundException();
        }
        catch (EventNotFoundException eve){
            System.out.println(eve+"\nEnter event name to replace ");
            String name=scanner.next();
            cancel(name);
            return schedule(obj);
        }
    }

    @Override
    public String enroll(String name, String person) {
        try{
            for(int index=0;index<evs.length;index++){
                //
                if(evs[index]!=null&&evs[index].getEveName().equalsIgnoreCase(name)){
                    if(evs[index].getEveWinner()==null){
                        String[] tmp=evs[index].getEvePart();
                        for(int pos=0;pos<tmp.length;pos++){
                            if(tmp[pos]==null){
                                tmp[pos]=person;
                                evs[index].setEvePart(tmp);// update new participant in existing
                                return person+" has enrolled in "+name;
                            }
                        }
                        return person+" hasn't enrolled due to registration is over";
                    }
                    else{
                        //return person+" can't enroll in "+name+" since event has held already";
                        throw new EventNotFoundException();
                    }
                }
            }
            throw new EventNotFoundException();
        }
        catch (EventNotFoundException eve){
            System.out.println(eve+"\nEnter name of any following ");
            for(Event e:evs){
                if(e.getEveWinner()==null){
                    System.out.println(e.getEveName());
                }
            }
            name=scanner.next();
            return enroll(name,person);
        }
        //return name+" doesn't found ";
    }

    @Override
    public String announce(String name, String person) {
        for(int index=0;index<evs.length;index++){
            //
            if(evs[index]!=null&&evs[index].getEveWinner()==null){
                String[] tmp=evs[index].getEvePart();
                    try{
                        for(int pos=0;pos<tmp.length;pos++){
                            if(tmp[pos]!=null&&person.equalsIgnoreCase(tmp[pos])){
                                evs[index].setEveWinner(person);
                                return person+" has announced as winner in "+name;
                            }
                        }
                        //return person+" hasn't enrolled in "+name;
                        throw new EventNotFoundException();
                    }
                    catch (EventNotFoundException eve){
                        System.out.println(eve+"\n enter the participant of followinf");
                        for(String g:evs[index].getEvePart()){
                            System.out.println(g);
                        }
                        person=scanner.next();
                        return announce(name,person);
                    }
            }
            //return name+" has winner already";
        }
        return name+" doesn't found ";
    }

    @Override
    public String cancel(String name) {
        try{
            for(int index=0;index<evs.length;index++){
                if(evs[index]!=null&&evs[index].getEveName().equalsIgnoreCase(name)){
                    if(evs[index].getEveWinner()==null){
                        evs[index]=null;
                        return name+" event has cancelled";
                    }
                    return name+" event can't cancel since it has been held already";
                }
            }
            throw new EventNotFoundException();
        }
        catch (EventNotFoundException eve){
            System.out.println(eve+"\nenter the any of following event ");
            for(Event e:evs){
                System.out.println(e.getEveName());
            }
            name=scanner.next();
            for(int index=0;index<evs.length;index++){
                if(evs[index]!=null&&evs[index].getEveName().equalsIgnoreCase(name)){
                    if(evs[index].getEveWinner()==null){
                        evs[index]=null;
                        return name+" event has cancelled";
                    }
                    return name+" event can't cancel since it has been held already";
                }
            }
            return name+" doesn't found";
        }
    }

    @Override
    public void update(Event obj) {
        for(int index=0;index<evs.length;index++){
            if(evs[index]!=null&&evs[index].getEveName().equalsIgnoreCase(obj.getEveName())){
                if(evs[index].getEveWinner()==null){
                    evs[index]=obj;
                    System.out.println(obj.getEveName()+" has updated");
                    return;
                }
                else{
                    System.out.println(evs[index].getEveName()+" can;t update since it has been held");
                    return;
                }
            }
        }
        System.out.println(obj.getEveName()+" is not in the record");
    }

    @Override
    public void listEvents() {
        for(Event e:evs){
            System.out.println(e);
        }
    }

    @Override
    public void listBy(Date date) {
        for(Event e:evs){
            if(e!=null&&e.getEveDate().equals(date)){
                System.out.println(e);
            }
        }
    }

    @Override
    public void listBy(String host) {
        for(Event e:evs){
            if(e!=null&&e.getEveHost().equalsIgnoreCase(host)){
                System.out.println(e);
            }
        }
    }
}
