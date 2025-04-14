package structurnie.condition;

public class Main {
    public static void main(String[] args) {
        var document = new Document();
        document.proceed();
        document.proceed();
        document.proceed();
        document.reject();
        document.reject();
        document.reject();
    }
}
