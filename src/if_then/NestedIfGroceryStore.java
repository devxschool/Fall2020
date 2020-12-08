package if_then;

public class NestedIfGroceryStore {

    public static void main(String[] args) {


//        //if the vendor brings a product
//        and it's green products then set the expiration date for 7 days for all greens
//
//        except
//
//        1. if it's cilantro set the expiration date for 10 days.
//        2. for dill please make expiration date for 4 days.
//
//
//
////Grocery store
////Greens
//
////Fruits -> Fruits should be expired in 30 days by default
//
//                except:
////rasberries should be expired in 6 days
////Bananas should be expired in 15 days by default
//
//
//
//
////Vegatables
//
//        all vegies should expire in 90 days
//
//        except:
//        Tomatoes in 20 days
//        Pumpkin in 60 days

//


        String productType = "";
        String productName = "";
        int daysToExpire = 0;

        if (productType.equals("Greens")) {//outer if statement open

            if (productName.equals("Cilantro")) {//inner if statement open
                daysToExpire = 10;
            }//inner close 155
            else if (productName.equals("Dill")) { //inner open
                daysToExpire = 4;
            }//inner close 158
            else {
                daysToExpire = 7;
            }

        } //outter close 159

        else if (productType.equals("Fruits")) {//outer

            if (productName.equals("Banana")) {
                //question
                //input
                String import
                daysToExpire = 15;
            } else if (productName.equals("Rasberries") {
                daysToExpire = 7;
            }
            else{
                daysToExpire = 30;
            }
        }

        System.out.println("This " + productName + " is going to expire in " + daysToExpire);
    }
}
