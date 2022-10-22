package core.vasudevan.basic.VasudevanCore.oops;

import java.util.Arrays;

public class DemoHierarchy extends DemoSingle {
    private int[][] ascii=new int[getArr().length][];
    public void singleToJagged(){
        for(int row=0;row<ascii.length;row++){
            String tmp = getArr()[row];
            ascii[row]=new int[tmp.length()];
            for(int col=0;col<ascii[row].length;col++){
                ascii[row][col]=(int)tmp.charAt(col);
            }
        }
    }
    public void listMulti(){
        for(int[] row:ascii){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        DemoHierarchy demo=new DemoHierarchy();
        demo.list();// wink
        demo.findMin();// demosingle
        demo.singleToJagged();
        demo.listMulti();
    }
}