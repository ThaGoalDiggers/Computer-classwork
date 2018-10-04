public class PC {
    private String pcCase;
    private String monitor;
    private String motherboard;

    public PC(String pcCase, String monitor, String motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private String getPcCase() {
        return pcCase;
    }

    private String getMonitor() {
        return monitor;
    }

    private String getMotherboard() {
        return motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel();
    }

    public void description(){
        System.out.println("The " + monitor + " looks like a large, thin flat-screen. " + "The " + pcCase + " looks like a large, black box with a transparent glass panel on the side. " + "The " + motherboard + " is an organized panel of components.");
    }

    public void poweUp(){
        pcCase.pressPowerButton();
        pcCase.drawLogo();
        motherboard.loadProgram();
    }

    @Override
    public String toString() {
        return "PC{" +
                "pcCase='" + pcCase + '\'' +
                ", monitor='" + monitor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }
}