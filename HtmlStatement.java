import java.util.Enumeration;
public class HtmlStatement extends Statement {
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = head() + aCustomer.getName() +
      enter();
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += result(each.getMovie().getTitle()) +
         String.valueOf(each.getCharge()) + enterBR();
      }
      //add footer lines
      result += paragraph() +
      String.valueOf(aCustomer.getTotalCharge()) + EM();
      result += close() + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      closeP();
      return result;
   }
  private String head(){
    return "<H1>Rentals for <EM>";
  }
  private String enter(){
    return "</EM></H1><P>\n";
  }
  private String result(String each){
    return each + ": ";
  }
  private String enterBR(){
    return "<BR>\n";
  }
  private String paragraph(){
    return "<P>You owe <EM>";
  }
  private String EM(){
    return "</EM><P>\n";
  }
  private String close(){
    return "On this rental you earned <EM>";
  }
  private String closeP(){
    return "</EM> frequent renter points<P>";
  }
}