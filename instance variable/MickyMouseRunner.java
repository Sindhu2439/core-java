class MickyMouseRunner{

    public static void main(String... values)
    {
        MickyMouse mickyMouse1 = new MickyMouse();
        Cartoon cartoon = new Cartoon();

        MickyMouse mickyMouse2 = new MickyMouse();
        mickyMouse2 = null;

        cartoon.info(mickyMouse1);
        cartoon.info(mickyMouse2);
    }

}