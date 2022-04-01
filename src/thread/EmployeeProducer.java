package thread;

import java.util.Random;

public class EmployeeProducer implements Runnable{

    ThreadSafeQueue<Employee> queue;

    public EmployeeProducer(ThreadSafeQueue<Employee> queue){
        this.queue = queue;
    }

    @Override
    public void run() {

        // Create some employee Objects
        for(int i=0; i<20; i++){

            try{
                Employee e = new Employee(new Random().nextInt(500), new Random().nextInt(100));
                System.out.println(EmployeeProducer.class + " creating employee - " + e);
                queue.add(e);
                if(i%4 == 0){
                    System.out.println("Peeking into queue - " + queue.peek());
                }
                Thread.sleep(5000);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
