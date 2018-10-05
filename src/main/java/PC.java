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
        System.out.println(Case.toString());
        System.out.println(monitor.toString());
        System.out.println(motherboard.toString());
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