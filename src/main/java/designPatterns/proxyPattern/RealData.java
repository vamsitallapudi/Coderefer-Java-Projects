package designPatterns.proxyPattern;

public class RealData implements Data{

    private String serverName;

    public RealData(String serverName) {
        this.serverName = serverName;
        loadFromNetwork();
    }

    @Override
    public void show() {
        System.out.println("Fetched data from " + serverName);
    }

    private void loadFromNetwork() {
        System.out.println("Loading From: " + serverName);
    }
}
