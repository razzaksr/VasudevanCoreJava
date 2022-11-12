package core.vasudevan.basic.VasudevanCore.handle;

import java.io.IOException;

public class Checked {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime run=Runtime.getRuntime();
        Process pro=null;
        pro=run.exec("calc");
        Thread.sleep(5000);
        pro=run.exec("mspaint");
    }
}
