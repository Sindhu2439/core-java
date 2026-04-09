class NailCutterRunner {
    public static void main(String[] args) {

        Username username1 = new Username("Sindhu", NailType.GLOSSY, 23);
        Username username2 = new Username("Puneeth", NailType.SHINY, 78);
        Username username3 = new Username("Rahul", NailType.MATTE, 45);

        Username[] usernames = {username1, username2, username3};

        NailCutter nailcutter = new NailCutter("Metal","Sivate",usernames);

        nailcutter.display();
    }
}