package designPatterns.adapterDesignPattern;

public class AndroidApp implements AppStore{
    @Override
    public void fetchFromStore() {

    }

    @Override
    public void fetchFromPlayStore() {
        System.out.println("Getting the App from Google Play Store");
    }
}
