class PhotoFrameRunner{
    public static void main(String[] args){
        PhotoFrame p1 = new PhotoFrame();
        PhotoFrame p2 = new PhotoFrame();
        PhotoFrame p3 = new PhotoFrame();
        PhotoFrame p4 = new PhotoFrame();
        PhotoFrame p5 = new PhotoFrame();

        System.out.println(p1.material);
        System.out.println(p1.colour);
        System.out.println(p1.price);
        System.out.println(p1.size);
        System.out.println(p1.shape);

        p1.material = "Wood";
        p2.colour = "Brown";
        p3.price = 250;
        p4.size = 10;
        p5.shape = "Square";

        System.out.println(p1.material);
        System.out.println(p2.colour);
        System.out.println(p3.price);
        System.out.println(p4.size);
        System.out.println(p5.shape);
    }
}