package learn.review.ForExperiment.ex3;

public class Queue {
    private int [] element;
    private int size = 8;
    private int num = 0;
    Queue(){
        this.element = new int[size] ;
    }

    Queue(int size){
        this.size = size;
        this.element = new int[size];
    }

    public int getSize() {
        return num;
    }

    boolean empty(){
        return num == 0;
    }

    int dequeue(){
        if(empty()){
            System.out.println("Queue is empty.It can't dequeue");
            return -1;
        }


        int temp = element[0];
        for(int i = 0;i < this.num - 1; i++){
            element[i] = element[i+1];
        }
        this.num --;
        return temp;
    }

    void enqueue(int data){

        if (num == size){
            this.size *= 2;
            int [] newElement = new int[this.size];
            System.arraycopy(element,0,newElement,0,num);
            element = newElement;
        }
        element[num] = data;
        this.num++;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        Queue queue2 = new Queue();
        System.out.println(queue2.getSize());

    }
}
