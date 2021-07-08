package designPatterns.proxyPattern;

public class ProxyDPDemo {
    public static void main(String[] args) {
        Data data = new ProxyData("AWS");
        data.show();
        System.out.println("===========");
        data.show();
    }
}
