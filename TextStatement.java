public class TextStatement extends Statement {
  public String head(){
    return "Rental Record for ";
  }
  public String enter(){
    return "\n";
  }
  public String result(String each){
    return "\t" + each + "\t";
  }
  public String enterBR(){
    return "\n";
  }
  public String paragraph(){
    return "Amount owed is ";
  }
  public String EM(){
    return "\n";
  }
  public String close(){
    return "You earned ";
  }
  public String closeP(){
    return  " frequent renter points";
  }
}