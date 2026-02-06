import java.util.Scanner;

class CPU {
    double price;

    // Correct constructor
    CPU(double c2) {
        price = c2;
    }

    class Processor {
        int no_of_cores;
        String manufacturer;

        // Correct constructor
        Processor(int n, String m) {
            no_of_cores = n;
            manufacturer = m;
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }
}

public class CPUMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CPU
        System.out.print("Enter CPU price: ");
        double price = sc.nextDouble();
        CPU cpu = new CPU(price);

        // Processor
        System.out.print("Enter number of cores: ");
        int cores = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter processor manufacturer: ");
        String procMan = sc.nextLine();

        CPU.Processor p = cpu.new Processor(cores, procMan);

        // RAM
        System.out.print("Enter RAM memory (GB): ");
        int memory = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter RAM manufacturer: ");
        String ramMan = sc.nextLine();

        CPU.RAM r = new CPU.RAM(memory, ramMan);

        // Output
        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("CPU Price: " + cpu.price);
        System.out.println("Processor Cores: " + p.no_of_cores);
        System.out.println("Processor Manufacturer: " + p.manufacturer);
        System.out.println("RAM Memory: " + r.memory + " GB");
        System.out.println("RAM Manufacturer: " + r.manufacturer);

        sc.close();
    }
}

