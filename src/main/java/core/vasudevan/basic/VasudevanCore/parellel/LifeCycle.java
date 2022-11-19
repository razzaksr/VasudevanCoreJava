package core.vasudevan.basic.VasudevanCore.parellel;

public class LifeCycle {
    public static void main(String[] args) {
        vikings vik=new vikings();
        Thread t1=new Thread(vik,"Saravanan");
        Thread t2=new Thread(vik,"Vikram");
        Thread t3=new Thread(vik,"Raman");
        t1.start();
        t2.start();
        t3.start();
    }
}
class vikings extends Tony implements Runnable{
    //private String[][] arrs={{"React","Angular","SpringBoot","Jpa","MySQL"},{"React","Django","Flask","MongoDB"},{"Node","MongoDB","Express","Angular","React"}};
    public void slice(int startRow,int startColumn,int endRow, int endColumn, int chances){
        try{
            while(startRow<=endRow){
                //System.out.println(startRow);
//                while(startColumn<endRow&&endRow<arr.length){
                while(startColumn<arr[startRow].length){
                    //System.out.print(arr[startRow][startColumn]+" ");
                    if(startRow<endRow||startColumn<=endColumn){
                        //System.out.println(startRow+" "+startColumn);
                        System.out.print(arr[startRow][startColumn]+" ");
                    }
                    startColumn++;
                }
                startColumn=0;
                startRow++;
            }
            System.out.println();
        }
        catch (ArrayIndexOutOfBoundsException ain){
            System.out.println(ain+" row "+arr.length+" and column "+arr[0].length);
            if(chances<2){
                System.out.println("Enter the start row index ");
                startRow= scanner.nextInt();
                System.out.println("Enter the start column index ");
                startColumn= scanner.nextInt();
                System.out.println("Enter the end row index ");
                endRow= scanner.nextInt();
                System.out.println("Enter the end column index ");
                endColumn= scanner.nextInt();
                chances++;
                slice(startRow,startColumn,endRow,endColumn,chances);
            }
            else{
                System.out.println("Maximum chances obtained");
                Thread.currentThread().stop();
            }
        }
    }
    @Override
    synchronized public void run() {
        System.out.println(Thread.currentThread().getName());
//        synchronized (scanner){
//            System.out.println("Enter the start row, start column, end row and end column ");
//            slice(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());
//        }
        System.out.println("Enter the start row, start column, end row and end column ");
        slice(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt(), 1);
        list();
        try {
            System.out.println("Please wait.......................... ");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}