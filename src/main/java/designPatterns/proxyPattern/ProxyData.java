package designPatterns.proxyPattern;

public class ProxyData implements Data{

    private String serverName;
    private RealData realData;

    public ProxyData(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public void show() {
        if(realData == null) {
            realData = new RealData(serverName);
        }
        realData.show();
    }
}
