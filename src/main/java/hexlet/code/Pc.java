package hexlet.code;

public class Pc implements Processor {
    public int getRam() {
        System.out.println("PC.getRam");
        return 1;
    }
    public int getHardDriveMemory(){
        System.out.println("PC.getHard Drive Memory");
        return 1;
    }

    public int getProcessor() {
        System.out.println("PC.getProcessor");
        return 1;
    }
}
