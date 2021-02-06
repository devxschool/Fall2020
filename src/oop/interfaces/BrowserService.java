package oop.interfaces;

public interface BrowserService {

    /*
      url - link
     */
    public abstract void navigate(String url);

    public abstract void playVideo();

    public abstract void click();

    public abstract String getUrl();

}
