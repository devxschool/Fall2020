package if_then;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the product type?");
        String productType = scanner.nextLine();
        System.out.println("What is the product name?");
        String productName = scanner.nextLine();
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

        else if (productType.equals("Fruits")) {//outer - used in the context of a broader condition.

            if (productName.equals("Banana")) {
                //question
                System.out.println("Where are the bananas impored from?");
                //input
                String importedFrom = scanner.nextLine();
                if(importedFrom.equals("Peru")) {
                    daysToExpire = 11;
                }
                else if(importedFrom.equals("Brazil")) {
                    daysToExpire = 14;
                }
                else {
                    daysToExpire = 15;
                }

            } else if (productName.equals("Rasberries")) {
                daysToExpire = 7;
            }
            else{
                daysToExpire = 30;
            }
        }

        System.out.println("This " + productName + " is going to expire in " + daysToExpire);
    }
}
