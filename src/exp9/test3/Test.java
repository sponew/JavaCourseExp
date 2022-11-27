package exp9.test3;

public class Test {
    public static void main(String[] args) {
        Compute compute = new Addition();
        UseCompute.useCom(compute, 20, 10);
        compute = new Subtraction();
        UseCompute.useCom(compute, 20, 10);
        compute = new Multiplication();
        UseCompute.useCom(compute, 20, 10);
        compute = new Division();
        UseCompute.useCom(compute, 20, 10);
    }
}
