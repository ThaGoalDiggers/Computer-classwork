public class PC {
    private Case Case;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case Case, Monitor monitor, Motherboard motherboard) {
        this.Case = Case;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getCase() {
        return Case;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel();
    }

    public void description(){
        System.out.println("The " + monitor + " looks like a large, thin flat-screen. " + "The " + pcCase + " looks like a large, black box with a transparent glass panel on the side. " + "The " + motherboard + " is an organized panel of components.");
    }

    public void poweUp(){
        Case.pressPowerButton();
        Case.drawLogo();
        motherboard.loadProgram();
    }

    @Override
    public String toString() {
        return "PC{" +
                "Case='" + Case + '\'' +
                ", monitor='" + monitor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }
}