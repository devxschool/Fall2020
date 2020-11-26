package arithmetic_operators;

public class NotEqual {

    public static void main(String[] args) {
        //use cases for not equal
        //apple != orange
        //reset password
        //oldPassword != newPassword

        String oldPassword = "h@rdPa$$";
        String newPassword = "VeryHardPassword";
        boolean shouldNewPasswordBeApplied = oldPassword != newPassword;
        System.out.println(shouldNewPasswordBeApplied);

        //!=
        String person = "Elon Musk";
        boolean isBlacklisted = true;
        boolean shouldThisPersonUseMyProduct = person != "John Doe";
        System.out.println(shouldThisPersonUseMyProduct);//true

        boolean result = isBlacklisted != true;
        System.out.println(result);//false

        String todayDate = "11/25/2020";
        String thanksGiving = "11/26/2020";

        boolean shouldIWork = todayDate != thanksGiving;
        System.out.println(shouldIWork);

        //exclude one scenario out of many.
        int myCarWheels = 4;
        boolean result1 = myCarWheels != 3;
        System.out.println(result1);//true


    }
}
