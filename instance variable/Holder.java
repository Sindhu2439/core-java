class Holder{

  Holder()
  {
    System.out.println("no arguement constructor");
  }

  void info(Keychain keychain){

    if(keychain != null){
      System.out.println("valid " + keychain);
      keychain.details();
    }
    else{
      System.out.println("invalid");
    }

  }

}