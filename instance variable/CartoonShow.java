class CartoonShow{

  CartoonShow()
  {
    System.out.println("no arguement constructor");
  }

  void info(Masha masha){

    if(masha != null){
      System.out.println("valid " + masha);
      masha.details();
    }
    else{
      System.out.println("invalid");
    }

  }

}