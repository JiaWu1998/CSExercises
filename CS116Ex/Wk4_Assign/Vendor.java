public class Vendor{
  private String manufacturer,model,login,pass;
  public Vendor(){
    manufacturer = "";
    model = "";
    login = "";
    pass = "";
  }
  public Vendor(String man, String mod, String log, String passee){
    manufacturer = man;
    model = mod;
    login = log;
    pass = passee;
  }
  public String toString(){
    return "manufacturer="+manufacturer+",model="+model+",login="+login+",pass="+pass;
  }
  public void setManfacturer(String mans){
    manufacturer = mans;
  }
  public void setModel(String mods){
    model = mods;
  }
  public void setLogin(String logs){
    login = logs;
  }
  public void setPass(String passs){
    pass = passs;
  }
  public String getManfacturer(){
    return manufacturer;
  }
  public String getModel(){
    return model;
  }
  public String getLogin(){
    return login;
  }
  public String getPass(){
    return pass;
  }
  public Boolean equals(Vendor sys1){
    if(((this.manufacturer).toLowerCase()).equals((sys1.manufacturer).toLowerCase())){
      return true;
    }else{
      return false;
    }
  }
  public String compareTo(Vendor sys2){
    //Return position of sys2 vendor name order before or after this vendor name(alphabetical order)..
    if(((this.manufacturer).toLowerCase()).compareTo((sys2.manufacturer).toLowerCase()) > 0){
      return "Before this";
    }else if(((this.manufacturer).toLowerCase()).compareTo((sys2.manufacturer).toLowerCase()) < 0){
      return "After this";
    }else{
      return "Equals this";
    }
  }

}//end class
