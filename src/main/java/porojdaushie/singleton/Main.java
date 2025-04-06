package porojdaushie.singleton;

public class Main {
    public static void main(String[] args) {
        //new SimpleSingleton();// Ошибка. Конструктор SimpleSingleton() приватный

        var singletone1 = SimpleSingleton.getInstance();
        var singletone2 = SimpleSingleton.getInstance();
        
        System.out.println(singletone1==singletone2);
    }
}
