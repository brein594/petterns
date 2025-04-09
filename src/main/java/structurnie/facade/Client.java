package structurnie.facade;

public class Client {
    private HostinaImageLoader loader;

    public void loadImage(String filePath) {
        loader.loadImage(filePath);
    }
}
