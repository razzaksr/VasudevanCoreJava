package core.vasudevan.basic.VasudevanCore.array;

import java.util.Scanner;

public class SearchMulti {

    public void linear(String[][] arr,String value){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col].equalsIgnoreCase(value)){
                    System.out.println(value+" actor matched @ row "+row+" and column "+col);
                    return;
                }
            }
        }
        System.out.println(value+" doesn't match with any cast");
    }

    public static void main(String[] args) {
        SearchMulti multi=new SearchMulti();
        Scanner scanner=new Scanner(System.in);
        String[][] cast={{"Vikram","Ravi","Karthi"},{"Kishore","Aishwarya","Riyaz"},
                {"Jeyram","Lal","Prabu"},{"Prakash","Nassar"}};

        System.out.println("Enter the actor name to search in the PS1 cast ");
        multi.linear(cast, scanner.next());
    }
}
