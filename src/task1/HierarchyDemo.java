package task1;

class PersonalComputer {
    private final String id;
    private final int memory;
    private final int ramModuleQuantity;
    private final double internalMemory;

    PersonalComputer() {
        this.id = "not assigned";
        this.memory = 512;
        this.ramModuleQuantity = 1;
        this.internalMemory = 5;
    }

    PersonalComputer(String id, int memory, int ramModuleQuantity, double internalMemory) {
        this.id = id;
        this.memory = memory;
        this.ramModuleQuantity = ramModuleQuantity;
        this.internalMemory = internalMemory;
    }

    public String getId() {
        return id;
    }

    public int getMemory() {
        return memory;
    }

    public int getRamModuleQuantity() {
        return ramModuleQuantity;
    }

    public double getInternalMemory() {
        return internalMemory;
    }
}

class Laptop extends PersonalComputer {
    private final boolean hasSSD;
    private double displaySize;

    public boolean isHasSSD() {
        return hasSSD;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public Laptop() {
        super();
        this.hasSSD = false;
        this.displaySize = 15.6;
    }

    public Laptop(String id, int memory, int ramModuleQuantity, double internalMemory, boolean hasSSD, double displaySize) {
        super(id, memory, ramModuleQuantity, internalMemory);
        this.hasSSD = hasSSD;
        this.displaySize = displaySize;
    }

    public Laptop(PersonalComputer pc, boolean hasSSD, double displaySize) {
        super(pc.getId(), pc.getMemory(), pc.getRamModuleQuantity(), pc.getInternalMemory());
        this.hasSSD = hasSSD;
        this.displaySize = displaySize;
    }
}

class OfficeLaptop extends Laptop {
    private static final String operationalSystem = "MACOS";
    private final boolean hasMSOffice;

    public OfficeLaptop() {
        super();
        this.hasMSOffice = false;
    }

    public OfficeLaptop(String id, int memory, int ramModuleQuantity, double internalMemory,
                        boolean hasSSD, double displaySize, boolean hasMSOffice) {
        super(id, memory, ramModuleQuantity, internalMemory, hasSSD, displaySize);
        this.hasMSOffice = hasMSOffice;
    }

    public OfficeLaptop(Laptop laptop, boolean hasMSOffice) {
        super(laptop.getId(), laptop.getMemory(), laptop.getRamModuleQuantity(), laptop.getInternalMemory(),
                laptop.isHasSSD(), laptop.getDisplaySize());
        this.hasMSOffice = hasMSOffice;
    }

    @Override
    public String toString() {
        return "OfficeComputer " +
                "id = '" + super.getId() + '\'' + "\n" +
                "memory = " + super.getMemory() + " MB\n" +
                "ramModuleQuantity = " + super.getRamModuleQuantity() + "\n" +
                "internalMemory = " + super.getInternalMemory() + " GB\n" +
                "hasSSD = " + super.isHasSSD() + "\n" +
                "displaySize = " + super.getDisplaySize() + "\n" +
                "operationalSystem = " + operationalSystem + "\n" +
                "hasMSOffice = " + hasMSOffice + "\n";
    }
}

public class HierarchyDemo {
    public static void main(String[] args) {
        PersonalComputer pc1 = new PersonalComputer();
        PersonalComputer pc2 = new PersonalComputer("1", 8192, 2, 1128);
        Laptop laptop1 = new Laptop(pc2, true, 13.0);
        OfficeLaptop officeLaptop = new OfficeLaptop(laptop1, true);

        System.out.println(officeLaptop);
    }
}


