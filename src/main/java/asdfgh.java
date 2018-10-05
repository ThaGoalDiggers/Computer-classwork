package dimensions;

public class Dimensions {


//    Dimensions CLASS
//    Create the following properties/instance variables as well as getters
//    Create a constructor with all the properties
//    int width;
//    int height;
//    int depth;
//    Finally Override the toString Method for the Dimensions Class


    private int width;

    private int height;

    private int depth;



    public  Dimensions(int width, int height, int depth){

        this.width = width;

        this.height = height;

        this.depth = depth;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(){


    }


    public int getHeight(){

        return height;
    }

    public int getDepth(){

        return depth;
    }


    @Override
    public String toString() {
        return "Dimensions{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

}

