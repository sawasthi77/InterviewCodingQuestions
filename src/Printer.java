public class Printer {
    private volatile boolean isOdd;

    synchronized void printEven(int number){
        while(!isOdd){
            try{
                wait();
            }catch (InterruptedException interruptedException){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number){
        while (isOdd){
            try{
                wait();
            }catch (InterruptedException interruptedException){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }

    public static void main(String[] args) {
        Printer p1 = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(10,p1,false));
        Thread t2 = new Thread(new TaskEvenOdd(10,p1,true));
        t1.start();
        t2.start();
    }
}
