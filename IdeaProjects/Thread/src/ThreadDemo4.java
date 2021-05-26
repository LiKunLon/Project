public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[20];
        for(int i=0;i<20;i++){
            final  int n=i;
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(n);
                }
            });
        }
        for(Thread t: threads){
            t.start();
        }
        for(Thread t: threads){
            t.join();
        }
        System.out.println("ok");
    }
}
