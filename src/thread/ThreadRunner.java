package thread;

public class ThreadRunner {

    public static void main(String[] args) {

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores = " + cores);

        ThreadSafeQueue<Employee> que = new ThreadSafeQueue<>();
        EmployeeProducer ep = new EmployeeProducer(que);
        ep.run();

        EmployeeConsumer ec = new EmployeeConsumer(que);
        ec.run();
    }
}
