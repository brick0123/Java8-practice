package concurrent;

public class MultiThreadExample {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
        // 2번째 방법
        Thread thread = new Thread(() -> {
//            try {
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//                // InterruptedException Thread가 자는 동안 깨우면 발생
//                e.printStackTrace();
//            }

            while (true) {
                System.out.println("Thread : " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                    return; // 리턴을 했기 떄문에 종료
                }
            }

        });
        thread.start();


        System.out.println("hello : " + Thread.currentThread().getName());
//        thread.interrupt();
        thread.join(); // 쓰레드 기다리기
        System.out.println(thread + "is finished");

    }
    // 메인쓰레드에서 다른 쓰레드를 만드는 두 가지 방법

    // 1. 불편한 방법
//    static class MyThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println("Thread : " +Thread.currentThread().getName());
//        }
//    }

}
