public class HtmlStatement extends Statement {
  public String head(){
    return "<H1>Rentals for <EM>";
  }
  public String enter(){
    return "</EM></H1><P>\n";
  }
  public String result(String each){
    return each + ": ";
  }
  public String enterBR(){
    return "<BR>\n";
  }
  public String paragraph(){
    return "<P>You owe <EM>";
  }
  public String EM(){
    return "</EM><P>\n";
  }
  public String close(){
    return "On this rental you earned <EM>";
  }
  public String closeP(){
    return "</EM> frequent renter points<P>";
  }
}