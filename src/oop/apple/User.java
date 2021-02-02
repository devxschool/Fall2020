package oop.apple;

public class User {

    /*
      Add a feature in Iphone which will keep track of battery life
      Battery should go down 5% for every appDownload.
      Battery should go down 2% for every display of all apps.
     */


    /*
       Add a feature for Iphone which will enable us to add contacts, show all contacts, delete contacts, update contacts
       in the contacts list.
     */






    public static void main(String[] args) {
        AppStore appStore = new AppStore();
        fillOutAppStore(appStore);
        Battery battery = new Battery();
        Iphone iphone = new Iphone("12 Pro Max", 128, "Blue", battery);
        iphone.downloadNewApp("turo", appStore);
        iphone.showAllApps();
        iphone.downloadNewApp("telegram", appStore);
        iphone.showAllApps();
        iphone.downloadNewApp("turo", appStore);
        iphone.showAllApps();
        iphone.getBattery().showPercentage();
        iphone.getBattery().switchMode();
        iphone.getBattery().showPercentage();
    }























    private static void fillOutAppStore(AppStore appStore){
        IosApp instagram = new IosApp("Instagram", "1.2.2", 10.2,0);
        IosApp fb = new IosApp("Facebook", "2.3.4", 5,0);
        IosApp yelp = new IosApp("Yelp", "0.2.2", 5,0);
        IosApp chess = new IosApp("Chess", "1.2.2", 2,0);
        IosApp robinhood = new IosApp("Robinhood", "0.2.2", 1,0);
        IosApp turo = new IosApp("Turo", "0.2.2", 4,0);
        IosApp uber = new IosApp("Uber", "3.2.2", 10.2,0);
        IosApp todoist = new IosApp("Todoist", "1.2.2", 10.2,0);
        appStore.addApp(instagram);
        appStore.addApp(fb);
        appStore.addApp(yelp);
        appStore.addApp(chess);
        appStore.addApp(robinhood);
        appStore.addApp(turo);
        appStore.addApp(uber);
        appStore.addApp(todoist);
    }
}
