public class Monitor {

    private String model;
    private int size;
    private String nativeResolution;

    public Monitor(String model, int size, String nativeResolution) {
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public String getNativeResolution() {
        return nativeResolution;
    }


    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' + ", size=" + size + ", nativeResolution='" + nativeResolution + '\'' + '}';
    }
}
