package designPatterns.adapterDesignPattern;

public class IosApp implements AppStore{
    @Override
    public void fetchFromStore() {
        System.out.println("Getting the App from Apple's App Store");
    }

    @Override
    public void fetchFromPlayStore() {

    }
}
