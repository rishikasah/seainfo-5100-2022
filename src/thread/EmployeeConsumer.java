package thread;

public class EmployeeConsumer implements Runnable{

    ThreadSafeQueue<Employee> queue;

    public EmployeeConsumer(ThreadSafeQueue<Employee> queue){
        this.queue = queue;
    }

    @Override
    public void run() {

        while(!queue.isEmpty()){
            try{
                Employee o = queue.remove();
                System.out.println("Consumer removing element using FIFO - " + o);
                Thread.sleep(300);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
