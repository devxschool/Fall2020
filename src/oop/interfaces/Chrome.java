package oop.interfaces;

//implements not extends
public class Chrome implements BrowserService{


    @Override
    public void navigate(String url) {
        //find chrome
        //call it's main method
        //call goToUrl method
        //open the page.
    }

    @Override
    public void playVideo() {
        //Check player
        //if flashInstalled
        //then play the vide
    }

    @Override
    public void click() {
        //click on the button, link
    }

    @Override
    public String getUrl() {
        return "ChromURL";
    }
}
