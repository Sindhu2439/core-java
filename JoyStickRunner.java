class JoyStickRunner{
    public static void main(String[] args){
        JoyStick j1 = new JoyStick();
        JoyStick j2 = new JoyStick();
        JoyStick j3 = new JoyStick();
        JoyStick j4 = new JoyStick();
        JoyStick j5 = new JoyStick();

        System.out.println(j1.brand);
        System.out.println(j1.type);
        System.out.println(j1.price);
        System.out.println(j1.buttons);
        System.out.println(j1.colour);

        j1.brand = "Sony";
        j2.type = "Wireless";
        j3.price = 3000;
        j4.buttons = 12;
        j5.colour = "Black";

        System.out.println(j1.brand);
        System.out.println(j2.type);
        System.out.println(j3.price);
        System.out.println(j4.buttons);
        System.out.println(j5.colour);
    }
}