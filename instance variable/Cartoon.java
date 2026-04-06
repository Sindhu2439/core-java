class Cartoon{

  Cartoon()
  {
    System.out.println("no arguement constructor");
  }

  void info(MickyMouse mickyMouse){

    if(mickyMouse != null){
      System.out.println("valid " + mickyMouse);
      mickyMouse.details();
    }
    else{
      System.out.println("invalid");
    }

  }

}