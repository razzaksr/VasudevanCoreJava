package core.vasudevan.basic.VasudevanCore.oops;

import java.util.Arrays;

public class DemoOverriding extends Cheetah implements MagnumOpus,OptimusPrime{
    int[] hi={34,89,12,556,65,56,75,676,44};
    public void heySome(int[] arr){
        System.out.println("Overridden manually from base");
        super.heySome(arr);
    }
    public static void main(String[] args) {
        DemoOverriding demo=new DemoOverriding();
        System.out.println(Arrays.toString(demo.hi));
        demo.heySome(demo.hi);
        demo.findTwoMin(demo.hi);
        demo.findMaxTwo(demo.hi);
    }

    @Override
    public void findTwoMin(int[] arr) {
        int min1=arr[0];
        int min2=arr[0];
        for(int index=0;index<arr.length;index++){
            if(min1>arr[index]){
                min2=min1;
                min1=arr[index];
            }
            else if(min2>arr[index]){
                min2=arr[index];
            }
        }
        System.out.println("Minimum1 is "+min1+" and Minimum2 is "+min2);
    }

    @Override
    public void findMaxTwo(int[] arr) {
        int max1=arr[0];
        int max2=arr[0];
        for(int index=0;index<arr.length;index++){
            if(max1<arr[index]){
                max2=max1;
                max1=arr[index];
            }
            else if(max2<arr[index]){
                max2=arr[index];
            }
        }
        System.out.println("Maximum1 is "+max1+" and Maximum2 is "+max2);
    }
}
class Cheetah{
    public void heySome(int[] arr){
        System.out.println("Hi there!!!");
        for(int index=arr.length-1;index>=0;index--){
            System.out.println(arr[index]);
        }
    }
}
interface MagnumOpus{
    public void findTwoMin(int[] arr);
}

interface OptimusPrime{
    public void findMaxTwo(int[] arr);
}