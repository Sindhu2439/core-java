class PowderRunner{

    public static void main(String... values)
    {
        Powder powder1 = new Powder();
        Talc talc = new Talc();

        Powder powder2 = new Powder();
        powder2 = null;

        talc.info(powder1);
        talc.info(powder2);
    }

}