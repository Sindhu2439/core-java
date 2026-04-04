class PlasticItem {

    public static void main(String[] args){

        String[] items = {
            "Bottle","Bag","Chair","Table","Bucket",
            "Mug","Box","Container","Pipe","Plate",
            "Spoon","Fork","Cover","Toy","Brush",
            "Tray","Cup","Jar"
        };

        for(int i=0; i<items.length; i++){
            System.out.println("plastic item name is" +items[i] + "is in the position" + i);
        }
    }
}