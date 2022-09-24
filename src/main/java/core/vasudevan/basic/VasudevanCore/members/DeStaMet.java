package core.vasudevan.basic.VasudevanCore.members;

public class DeStaMet {
    public static void main(String[] args) {
        System.out.println(HaiThere.term.length);

//        double d = HaiThere.doSome(4);
//        System.out.println(d);
        System.out.println(HaiThere.doSome(4));

        HaiThere h1=new HaiThere();
        h1.alter();

        HaiThere.hunt(5);
    }
}

class HaiThere{
    static double[] term={34.5,90.3,5.6,7.9,12.5};

    float micro=0F;

    public static void hunt(int user){
        HaiThere hai=new HaiThere();
        hai.micro = (float)(term[4]*user);
        System.out.println(hai.micro);
    }

    public static double doSome(int pos){
        return term[pos];
    }

    public void alter(){
        term[2]=1000.45;
        System.out.println(term[2]);
    }
}