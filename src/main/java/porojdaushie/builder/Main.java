package porojdaushie.builder;

public class Main {
    public static void main (String[] args) {
        var computer = new Computer.ComputerBuilder()
                .withHdd(1000)
                .withRam(512)
                .build();

        var computer2 = new Computer.ComputerBuilder()
                .withCpu(2215)
                .withHasCdDrive(true)
                .withVideoAdapterType("NVIDIA")
                .build();


        System.out.println(computer.toString());
        System.out.println(computer2.toString());
    }
}
