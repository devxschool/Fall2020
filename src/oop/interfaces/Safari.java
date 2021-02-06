package oop.interfaces;

public class Safari implements BrowserService{

    @Override
    public void navigate(String url) {
        //Find Safari app
        //open
        //find the tab
        //put url/
        //go to page
    }

    @Override
    public void playVideo() {
       //play video
     }


    @Override
    public void click() {
        //click on the button, link
    }

    @Override
    public String getUrl() {
        return "SafariURL";
    }
}
