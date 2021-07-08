package designPatterns.adapterDesignPattern;

public class AdapterDesignPatternDemo {
    public static void main(String[] args) {
        MobileApp app = new MobileApp();
        app.fetchApp("Android");
        app.fetchApp("iOS");
        app.fetchApp("other");
    }
}
