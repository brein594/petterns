package structurnie.facade;

import java.io.Reader;

public class HostigImageLoaderImpl implements HostingImageLoader{
    public void loadImage(String filePath){
        var image = Reader.readFile(filePath);
        var croppedImage = ImageProcessor.crop(image);
        var jpgImage = imageConverter.converter(croppedImage, "jpg");
        var compressedImage = ImageProcessor.compress(jpgImage);
        ImageLoader.load(compressedImage);
    }
}
