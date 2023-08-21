package thread.join;

public class MyThread implements Runnable{

    private Thread thread = null;

    public MyThread() {

    }

    public MyThread(Thread thread) {
        this.thread = thread;
    }



    @Override
    public void run() {
        for(int i = 0; i<50 ; i++) {
            if(i >= 20 && i <= 25) {
                try {
                    System.out.println(thread.getName()  + "被迫参与 " + Thread.currentThread().getName() + " 的工作了……" +i);
                    thread.join();
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 以下语句不管上面判断语句是否执行都会执行的
            System.out.println(Thread.currentThread().getName() + " 正在工作中……" +i);
        }
    }
}
