public class Monitor {

    private String model;
    private int size;
    private String manufacturer;
    private Resolution nativeResolution;

    public Monitor(String model, int size, String manufacturer,Resolution nativeResolution) {
        this.model = model;
        this.size = size;
        this.nativeResolution= nativeResolution;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' + ", size=" + size + ",manufacturer" +manufacturer + ", nativeResolution='" + nativeResolution + '\'' + '}';
    }
}
