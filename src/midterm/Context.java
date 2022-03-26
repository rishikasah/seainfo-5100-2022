package midterm;

public class Context {

    MathOperation operation;

    public Context(MathOperation operation) {
        this.operation = operation;
    }
    public int execute(int num1, int num2) {
        return operation.performOperation(num1,num2);
    }
}
