package designPatterns.builderDesignPattern;

public class BuilderDPDemo {
    public static void main(String[] args) {
        new Bakery.Builder()
                .addItem(new Pizza())
                .addItem(new Pastry())
                .build();
    }
}
