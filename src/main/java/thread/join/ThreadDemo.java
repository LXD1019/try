package thread.join;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        MyThread mt1 = new MyThread(mainThread);
        Thread thread1 = new Thread(mt1,"子线程");

        thread1.start();
        for(int i = 0 ;i<20;i++) {
            try {
                Thread.sleep(1000); // 每次main线程休眠1秒
                System.out.println(Thread.currentThread().getName() +  "正在工作中……" + i);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我main线程已经完成了所有任务，从此无法再复生了……");
    }
}

