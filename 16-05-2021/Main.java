class CPU {
    double price=27000;
    class Processor{
        double cores=8;
        String manufacturer="Intel";

    }
    protected class RAM{
        double memory=16;
        String manufacturer="OWC";
    }
}

public class Main2 {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        System.out.println("CPU price = " + cpu.price);
        System.out.println("Processor cores = " + processor.cores);
        System.out.println("Processor manufacturer = " + processor.manufacturer);
        System.out.println("RAM memory = " + ram.memory);
        System.out.println("RAM manufacturer = " + ram.manufacturer);
    }
}