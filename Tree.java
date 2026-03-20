class Tree {

    public static void main(String[] args){

        String[] treeNames = {
            "Neem","Mango","Banyan","Peepal","Coconut",
            "Teak","Pine","Oak","Ashoka","Palm",
            "Apple","Cherry","Guava","Lemon","Orange",
            "Banana","Papaya","Rosewood","Sandalwood","Fir",
            "Maple","Birch","Willow","Spruce","Cedar"
        };

        for(int i = 0; i < treeNames.length; i++){
            System.out.println("tree name is: " +treeNames[i]+" is in the position "+i);
        }
    }
}