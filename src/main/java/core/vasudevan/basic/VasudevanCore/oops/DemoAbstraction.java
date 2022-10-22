package core.vasudevan.basic.VasudevanCore.oops;

public class DemoAbstraction extends Help{
    public static void main(String[] args) {
        //Help h=new Help();
        DemoAbstraction abs=new DemoAbstraction();
        abs.doSome();
        abs.showSome();
    }

    @Override
    public void showSome() {
        System.out.println("Abstract method from abstract class HELP");
    }
}
abstract class Help{
    // non-abstract
    public void doSome(){
        System.out.println("Doing good deeds");
    }
    // abstract
    public abstract void showSome();
}