package core.vasudevan.basic.VasudevanCore.members;

public class DemStats {
    public static void main(String[] args) {
        DemStats dem1=new DemStats();
        dem1.wick='Q';dem1.quick=255;
        System.out.println(dem1.wick+" "+dem1.quick);

        DemStats dem2=new DemStats();
        System.out.println(dem2.wick+" "+dem2.quick);

        DemStats.quick=55;DemStats.wick='W';

        System.out.println(dem1.wick+" "+dem1.quick);
        System.out.println(dem2.wick+" "+dem2.quick);
        System.out.println(DemStats.wick+" "+DemStats.quick);

    }
    static char wick;
    static Integer quick;
}