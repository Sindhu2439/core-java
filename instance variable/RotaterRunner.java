class RotaterRunner{

    public static void main(String... values)
    {
        Rotater rotater1 = new Rotater();
        Spinner spinner = new Spinner();

        Rotater rotater2 = new Rotater();
        rotater2 = null;

        spinner.info(rotater1);
        spinner.info(rotater2);
    }

}