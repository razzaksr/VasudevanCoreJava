package core.vasudevan.basic.VasudevanCore.array;

import java.util.Arrays;

public class Sortings {

    public int findPivot(double[] arr, int start,int end){
        double piData=arr[end];
        int initial=start-1;

        for(int current=start;current<end;current++){
            if(arr[current]<piData){
                initial++;
                double third=arr[initial];
                arr[initial]=arr[current];
                arr[current]=third;
            }
        }

        double tmp=arr[initial+1];
        arr[initial+1]=arr[end];
        arr[end]=tmp;

        return initial+1;
    }

    public void quick(double[] arr,int start,int end){
        if(start<=end){
            int pivotalPoint=findPivot(arr,start,end);
            quick(arr,start,pivotalPoint-1);
            quick(arr,pivotalPoint+1,end);
        }
    }

    public void selection(double[] wet){
        for(int hold=0;hold<wet.length;hold++){
            for(int comp=hold+1;comp<wet.length;comp++){
                if(wet[hold]<wet[comp]){
                    double third=wet[hold];
                    wet[hold]=wet[comp];
                    wet[comp]=third;
                }
            }
        }
    }

    public void bubble(double[] yet){
        for(int total=0;total<yet.length-1;total++){
            for(int taken=0;taken<yet.length-total-1;taken++){
                if(yet[taken]>yet[taken+1]){
                    yet[taken]*=yet[taken+1];
                    yet[taken+1]=yet[taken]/yet[taken+1];
                    yet[taken]/=yet[taken+1];
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr={45.3,9.5,12.4,91.4,67.5,35.7,8.2,7.2,6.75};
        System.out.println("Before Sort ");
        System.out.println(Arrays.toString(arr));
        Sortings tings=new Sortings();
        //tings.bubble(arr);
        //tings.selection(arr);
        tings.quick(arr,0, arr.length-1);
        System.out.println("After Sort ");
        System.out.println(Arrays.toString(arr));
    }
}
