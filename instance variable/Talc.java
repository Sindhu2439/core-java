class Talc{

  Talc()
  {
    System.out.println("no arguement constructor");
  }

  void info(Powder powder){

    if(powder != null){
      System.out.println("valid " + powder);
      powder.details();
    }
    else{
      System.out.println("invalid");
    }

  }

}