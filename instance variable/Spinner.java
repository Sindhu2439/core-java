class Spinner{

  Spinner()
  {
    System.out.println("no arguement constructor");
  }

  void info(Rotater rotater){

    if(rotater != null){
      System.out.println("valid " + rotater);
      rotater.details();
    }
    else{
      System.out.println("invalid");
    }

  }

}