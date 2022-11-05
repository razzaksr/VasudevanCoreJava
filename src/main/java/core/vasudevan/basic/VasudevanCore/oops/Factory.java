package core.vasudevan.basic.VasudevanCore.oops;

import lombok.Data;

import java.util.Arrays;

public class Factory {
    public static void main(String[] args) {
        Stores st=new Stores();
        st.convert();
        System.out.println(Arrays.toString(st.getSin()));
        st=new Provisioneries();
        st.convert();
        System.out.println(Arrays.toString(st.getSin()));
        st=new Marts();
        st.convert();
        System.out.println(Arrays.toString(st.getSin()));
    }
}
class Marts extends Stores{
    //private int[] diag=new int[getArr().length*getArr()[0].length];
    public void convert(){
        System.out.println("Mart convert");
        int row=0,col=0,index=0;
        for(;row<getArr().length&&col<getArr()[row].length;row++,col++,index++){
            getSin()[index]=getArr()[row][col];
        }
        row=0;col--;
        for(;row<getArr().length&&col>=0;row++,col--,index++){
            if(row==1&&col==1) {
                index--;
                continue;
            }
            getSin()[index]=getArr()[row][col];
        }
        System.out.println(index+" "+getSin()[4]);
        row=0;col=1;
        getSin()[index]=getArr()[row][col];
        index++;
        getSin()[index]=getArr()[col][row];
        row++;col++;index++;
        getSin()[index]=getArr()[row][col];
        index++;
        getSin()[index]=getArr()[col][row];
        //super.convert();
    }
}

@Data
class Provisioneries extends Stores{
    //private int[] spiral=new int[getArr().length*getArr()[0].length];
    public void convert(){
        int row=0,col=0,index=0;
        while(col<getArr()[row].length){
            getSin()[index]=getArr()[row][col];
            col++;index++;
        }
        col--;row++;
        while(row<getArr().length){
            getSin()[index]=getArr()[row][col];
            row++;index++;
        }
        col--;row--;
        while(col>=0){
            getSin()[index]=getArr()[row][col];
            col--;index++;
        }
        col++;row--;
        while(col<2){
            getSin()[index]=getArr()[row][col];
            col++;index++;
        }
        //super.convert();
    }
}

@Data
class Stores{
    private int[][] arr={{14,32,26},{12,64,27},{36,122,65}};
    private int[] sin=new int[arr.length*arr[0].length];
    public void convert(){
        int index=0;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++,index++){
                sin[index]=arr[row][col];
            }
        }
    }
}

