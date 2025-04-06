package hexlet.code;

public class Main {
    public static void main(String[] args) {
/*        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

 */

        //Device pc1 = new PC();
        //pc1.getRAM();
        //pc1.getHardDriveMemory();
        Device pc = new Pc();
        pc.getHardDriveMemory();
        pc.getRam();

        Pc pc1 = new Pc();
        pc1.getHardDriveMemory();
        pc1.getRam();
        pc1.getProcessor();

        Processor intel = new Pc();
        intel.getRam();

        System.out.println(Device.getNameDevice());
        pc.getSsd();

    }
}
