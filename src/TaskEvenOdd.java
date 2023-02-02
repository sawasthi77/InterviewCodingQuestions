public class TaskEvenOdd implements Runnable{
    private int max;
    private Printer print;
    private Boolean isEvenNumber;

    public TaskEvenOdd(int max, Printer print, Boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2: 1;
        while (number <= max){
            if(isEvenNumber){
                print.printEven(number);
            }else{
                print.printOdd(number);
            }
            number +=2;
        }
    }
}
