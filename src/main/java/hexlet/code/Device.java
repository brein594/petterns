package hexlet.code;

public interface Device {
    static String NAME_DEVICE = "Laptop";
    static String getNameDevice() {
        return NAME_DEVICE;
    }
    int getRam();
    int getHardDriveMemory();

    default int getSsd(){
        System.out.println("PC.getSSD");
        return 2;
    }
}
