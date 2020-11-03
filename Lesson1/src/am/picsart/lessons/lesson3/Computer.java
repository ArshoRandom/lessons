package am.picsart.lessons.lesson3;


/**
 * @author Arshak Papoyan
 */

public class Computer {

    private int ram = 1;
    private int cpuCount = 1;
    private String brand;
    private String model;
    private boolean isNotebook;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 16 || ram < 1) {
            System.out.println("invalid ram size");
        } else {
            this.ram = ram;
        }
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        if (cpuCount > 16 || cpuCount < 1) {
            System.out.println("invalid cpu count");
        }else {
            this.cpuCount = cpuCount;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public void printComputerFullName(){
        System.out.println(this.getBrand() + " " + this.getModel());
    }

    public void addRam(int ram){
        if (ram > 8 || ram < 0)
            System.out.println("Invalid ram size : " + ram);
        if (this.ram > 16)
            System.out.println("Maximal ram size : " + this.ram);
        else
            this.ram += ram;
    }
}
