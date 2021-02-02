package oop.apple;

public class Battery {
    private double lifePercentage = 100;//how much life left
    private boolean isDecimalMode = false;

    public void showPercentage(){
        if (isDecimalMode) {
            System.out.println(lifePercentage + "%");
        }else {
            System.out.println((int)lifePercentage + "%");
        }
    }

    /**
     *
     */
    public void switchMode(){
        if (isDecimalMode) {
            isDecimalMode = false;
        }
        else {
            isDecimalMode = true;
        }
    }

}
