package designPatterns.adapterDesignPattern;

public class MobileApp implements Store{
    private AppStore appStore;
    @Override
    public void fetchApp(String name) {
        if(name.equalsIgnoreCase("other")) {
            System.out.println("Fetching the app from Windows Store");
        } else if(name.equalsIgnoreCase("ios")) {
            appStore = new IosApp();
            appStore.fetchFromStore();
        } else if(name.equalsIgnoreCase("android")) {
            appStore = new AndroidApp();
            appStore.fetchFromPlayStore();
        }
    }
}
