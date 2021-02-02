package oop.apple;

import java.util.ArrayList;
import java.util.List;


public class AppStore {

   private List<IosApp> apps = new ArrayList<>();

   public List<IosApp> getApps() {
      return apps;
   }

   public void addApp(IosApp iosApp) {
      apps.add(iosApp);
   }

   //Add a method called open()
   //when open method is called you should print out all available Apps in the appstore
   //ex:
   //1. Instagram, 2.99
   //2. Facebook, 3.11
   //3. WhatsApp, 2.99
   public void open() {
     for (int i = 0; i < apps.size(); i++) {
        System.out.println((i+1) + ". " + apps.get(i).getName() + ", " + apps.get(i).getPrice());
     }
   }
}
