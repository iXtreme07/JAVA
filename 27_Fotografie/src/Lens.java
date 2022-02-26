public class Lens {
    private int focalLengthMin;
    private int focalLengthMax;


    public Lens(int focalLengthMin, int focalLengthMax) {
        if (focalLengthMax >= focalLengthMin) {
            this.focalLengthMin = focalLengthMin;
            this.focalLengthMax = focalLengthMax;
        } else {
            this.focalLengthMin = focalLengthMax;
            this.focalLengthMax = focalLengthMin;
        }
        Main.lensCrowd++;

    }

    public void setFocalLengthMin(int focalLengthMin) {

        if (this.focalLengthMax >= focalLengthMin) {
            this.focalLengthMin = focalLengthMin;
        } else {
            System.err.println("Focus MAX can't be smaller than Focus MIN!! \n");
        }
    }

    public void setFocalLengthMax(int focalLengthMax) {
        if (this.focalLengthMin <= focalLengthMax) {
            this.focalLengthMax = focalLengthMax;
        } else {
            System.err.println("Focus MIN can't be bigger than Focus MAX!! \n");
        }

    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }


    @Override
    public String toString() {
        return "Lens{" +
                "focalLengthMin=" + focalLengthMin +
                ", focalLengthMax=" + focalLengthMax +
                '}';
    }
}
