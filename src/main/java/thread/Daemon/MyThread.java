package thread.Daemon;

class MyThread implements Runnable{
    private int times;
    public MyThread(int times) {
        this.times = times;
    }
    @Override
    public void run() {
        for(int i = 0 ; i<times;i++) {
            if(Thread.currentThread().isDaemon()) {
                try {
                    Thread.sleep(10); // 如果是守护线程，则休眠0.01秒钟
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " 正在工作中……"+i);
        }
    }
}



