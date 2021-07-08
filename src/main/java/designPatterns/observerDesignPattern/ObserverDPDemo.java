package designPatterns.observerDesignPattern;

public class ObserverDPDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new AddObserver(subject);
        new MultiplyObserver(subject);
        new DivisionObserver(subject);

        System.out.println("Input of 2,3:");
        subject.setData(2,3);
        System.out.println("Input of 10,5:");
        subject.setData(10,5);
    }
}
