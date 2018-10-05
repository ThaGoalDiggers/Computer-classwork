public class PC {
    private Case compCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case Case, Monitor monitor, Motherboard motherboard) {
        this.compCase = Case;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getCase() {
        return compCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(10,10,"Blue");
    }

   public void description(){
        System.out.println(Case.toString());
        System.out.println(monitor.toString());
        System.out.println(motherboard.toString());
    }

    public void poweUp(String loadProgram){
        Case.pressPowerButton();
        drawLogo();
        motherboard.loadProgram(loadProgram);
    }

    @Override
    public String toString() {
        return "PC{" +
                "Case='" + compCase + '\'' +
                ", monitor='" + monitor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }
}
