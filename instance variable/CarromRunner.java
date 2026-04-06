class CarromRunner{

    public static void main(String... values)
    {
        Carrom carrom1 = new Carrom();
        Board board = new Board();

        Carrom carrom2 = new Carrom();
        carrom2 = null;

        board.info(carrom1);
        board.info(carrom2);
    }

}