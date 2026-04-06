class Mesh{

  Mesh()
  {
    System.out.println("no arguement constructor");
  }

  void info(Net net){

    if(net != null){
      System.out.println("valid " + net);
      net.details();
    }
    else{
      System.out.println("invalid");
    }

  }

}