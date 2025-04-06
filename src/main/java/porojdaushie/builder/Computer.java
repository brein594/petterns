package porojdaushie.builder;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Setter
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class Computer {
    private int ram;
    private int cpu;
    private int ssd;
    private int hdd;
    private int power;
    private boolean hasCdDrive;
    private String videoAdapterType;

    @Override
    public String toString() {
        return String.format("ram: %d, cpu: %d, SSD: %d, HDD: %d, power: %d, CD: %b, VIDEO: %s",
                                            ram, cpu, ssd, hdd, power, hasCdDrive, videoAdapterType);
    }
}
