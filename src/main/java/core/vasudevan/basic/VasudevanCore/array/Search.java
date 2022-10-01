package core.vasudevan.basic.VasudevanCore.array;

import java.util.Arrays;

public class Search {

    public int linear(int[] arr,int data){
        for(int index=0;index<arr.length;index++){
            if(arr[index]==data)
                return index;
        }
        return -1;
    }

    public int binary(int[] arr,int start,int end,int userData){
        if(start<=end){
            int midPoint=start+(end-start)/2;
            if(arr[midPoint]==userData)
                return midPoint;
            else if(arr[midPoint]>userData)
                return binary(arr,start,midPoint-1,userData);
            else
                return binary(arr,midPoint+1,end,userData);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] orderId={120,45,32,67,42,78,422,789,64,3,32,57};
        Search ser=new Search();
        int pos=ser.linear(orderId,422);
        System.out.println(pos);
        Arrays.sort(orderId);
        System.out.println(ser.binary(orderId,0,orderId.length-1,32));
    }
}
