package input_from_user;

public class Test {

    public static void main(String[] args) {
        Device device1 = new Device();
        device1.deviceConfiguration.put("iosVersion", "12.22");
        device1.deviceConfiguration.put("iphone", "11");
        device1.deviceConfiguration.put("carrier", "T-mobile");


        Device device2 = new Device();
        device2.deviceConfiguration.put("iosVersion", "11");
        device2.deviceConfiguration.put("iphone", "12");
        device2.deviceConfiguration.put("carrier", "ATM");


        test(device1);
        test(device2);
    }

    static void test(Device device) {
        System.out.println("testing device");
        System.out.println(device.deviceConfiguration);
    }


}
