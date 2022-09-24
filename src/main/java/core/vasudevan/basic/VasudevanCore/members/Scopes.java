package core.vasudevan.basic.VasudevanCore.members;

/*

 */

public class Scopes {
    int[] hai={34,6,12,46,897,68,9,87,65,7};
    Short hello;

    public static void main(String[] args) {
        // local to the main method
        String alpha="Vasudevan";
        int cosmo=90;
        double detail=7.8;

        System.out.println(alpha+" "+cosmo+" "+detail);

        Scopes cop=new Scopes();
        Scopes scope=new Scopes();
        scope.wind="Salem";
        scope.hello=78;
        System.out.println(scope.hai.length+" "+scope.hello+" "+scope.wind);
        System.out.println(cop.hello+" "+cop.hai.length+" "+cop.wind);
    }

    String wind="Zealous";
}
