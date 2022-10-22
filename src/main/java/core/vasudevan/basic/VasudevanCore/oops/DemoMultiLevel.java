package core.vasudevan.basic.VasudevanCore.oops;

import java.util.Arrays;

public class DemoMultiLevel extends DemoSingle{
    public String[] beginAs(String userGiven){
        StringBuffer buffer=new StringBuffer();
        for(int pos=0;pos<getArr().length;pos++){
            if(getArr()[pos].startsWith(userGiven)){
                buffer.append(getArr()[pos]+",");
            }
        }
        String tmp = buffer.toString();
        String[] hi=tmp.split(",");
        return hi;
    }
    public static void main(String[] args) {
        DemoMultiLevel demo=new DemoMultiLevel();
        demo.list();// wink
        demo.findMin();// DemoSingle
        System.out.println(Arrays.toString(demo.beginAs("S")));
        System.out.println(Arrays.toString(demo.beginAs("Red")));
    }
}
