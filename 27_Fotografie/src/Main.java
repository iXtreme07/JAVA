public class Main {


    static int cameraCrowd = 0;
    static int lensCrowd = 0;

    public static void main(String[] args) {


        Lens lense20_40 = new Lens(20, 40);
        Lens lense70_350 = new Lens(70, 350);
        Lens lense50_80 = new Lens(50, 80);
        Lens lense65_400 = new Lens(65, 400);


        Camera Canon_XS = new Camera("Canon", 20, 10, true, lense20_40);
        Camera Nikon_SP = new Camera("Nikon", 20, 10, true, lense50_80);
        Camera Sony_RS = new Camera("Sony RS", 20, 10, true, lense65_400);
        Camera Hasselblad_X1 = new Camera("Hasselblad", 20, 10, true, lense20_40);
        Camera GoPro_R3 = new Camera("GoPro", 20, 10, true, lense70_350);

        System.out.println(Hasselblad_X1.getLens().getFocalLengthMin() + "/" + Hasselblad_X1.getLens().getFocalLengthMax());
        Hasselblad_X1.setLens(lense65_400);
        System.out.println(Hasselblad_X1.getLens().getFocalLengthMin() + "/" + Hasselblad_X1.getLens().getFocalLengthMax());


        System.out.println("Camera Anzahl. " + cameraCrowd);
        System.out.println("Linsen Anzahl. " + lensCrowd);

        System.out.println(Hasselblad_X1);
        System.out.println(lense20_40);

    }
}
