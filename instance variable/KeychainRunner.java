class KeychainRunner{

    public static void main(String... values)
    {
        Keychain keychain1 = new Keychain();
        Holder holder = new Holder();

        Keychain keychain2 = new Keychain();
        keychain2 = null;

        holder.info(keychain1);
        holder.info(keychain2);
    }

}