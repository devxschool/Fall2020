package oop.apple;

import java.util.ArrayList;
import java.util.List;

//Create a program which will mimic Iphone
//Once a user will buy an Iphone we will create a new Iphone object;
//A a method which can add,Buy apps from AppStore;
public class Iphone {

    private String model;
    private int memory;
    private String color;
    //instance variable which defines that Iphones will have List of IosAppliactions.
    private List<IosApp> apps;
    private Battery battery;
    private List<Contact> contactList;

    //in order to create an iphone you only need to provide
    //model, memory, battery and color;
    //Default apps will be appStore, facetime, calendar;
    //default contacts are empty;


    public Iphone(String model, int memory, String color, Battery battery) {
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.battery = battery;
        this.apps = new ArrayList<>();
        this.contactList = new ArrayList<>();
        //we can call methods in a constructor;
        addDefaultApps();
        showAllApps();
    }

    /**
     * declared it as private -> bc we dont want Iphones to have addDefaultApps functionality, rather
     * it's only used in this class for code readibility purposes;
     */
    private void addDefaultApps() {
        IosApp appStore = new IosApp("AppStore", "1.4.3",1.34,0);
        IosApp facetime = new IosApp("FaceTime", "2.2.3",2.4,0);
        IosApp calendar = new IosApp("Calendar", "3.3.3",0.4,0);
        this.apps.add(appStore);
        this.apps.add(facetime);
        this.apps.add(calendar);
    }


    //Add a functionality for an Iphone which will addNewApps from AppStore;
    public void downloadNewApp(String appName, AppStore appStore) {
        for (IosApp app : appStore.getApps()) {
            if (app.getName().equalsIgnoreCase(appName)){
                apps.add(app);
            }
        }
    }

    public void showAllApps(){
        for (IosApp app : apps) {
            System.out.print(" || " + app.getName());
        }
        System.out.println();
    }

    public Battery getBattery() {
        return battery;
    }
}
