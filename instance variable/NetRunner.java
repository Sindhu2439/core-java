class NetRunner{

    public static void main(String... values)
    {
        Net net1 = new Net();
        Mesh mesh = new Mesh();

        Net net2 = new Net();
        net2 = null;

        mesh.info(net1);
        mesh.info(net2);
    }

}