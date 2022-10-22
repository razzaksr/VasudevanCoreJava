package core.vasudevan.basic.VasudevanCore.oops;

/*
Run time polymorphism:
    writing a same method with same parameters in derived from base(class,interface) while
    performing inheritance

    while inheritance from interface, all abstract methods should
    be override in derived class
 */

public class DemoInterface implements DevInter {
    public static void main(String[] args) {
        DevClass dclass=new DevClass();
        dclass.alpha=400;dclass.beta=560;
        //DevInter dinter=new DevInter();
        DemoInterface demo=new DemoInterface();
        //demo.alpha=12;demo.beta=15; constant
        System.out.println(demo.alpha+" "+demo.beta);
        demo.dareDevil();
    }

    @Override
    public void dareDevil() {
        System.out.println("Overridden from base component DevInter");
    }
}
class DevClass{
    int alpha,beta;// initialization happens automatically

    // non-abstract method: {}
    public void logan(){
        System.out.println("Logan alias wolverine");
    }
}
interface DevInter{
    int alpha=40,beta=90;// initialization has to be done, final
    // abstract method
    public void dareDevil();
}