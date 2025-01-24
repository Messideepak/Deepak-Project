public class ThreadExtendsExample extends Thread {
    public void run(){
        for(int=1;i=<5;i++)
        {
            System.out.println(Thread.currentThread().getId()+"value:"+i);
        }
    }
    
}
public static void main(string[]args){
    ThreadExtendsExample t1=new ThreadExtendsExample();
    ThreadExtendsExample t2=new ThreadExtendsExample();
        
}
