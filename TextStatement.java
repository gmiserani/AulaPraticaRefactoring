import java.util.Enumeration;
public class TextStatement extends Statement {
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = head() + aCustomer.getName() +
      enter();
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
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
    return "Rental Record for ";
  }
  private String enter(){
    return "\n";
  }
  private String result(String each){
    return "\t" + each + "\t";
  }
  private String enterBR(){
    return "\n";
  }
  private String paragraph(){
    return "Amount owed is ";
  }
  private String EM(){
    return "\n";
  }
  private String close(){
    return "You earned ";
  }
  private String closeP(){
    return  " frequent renter points";
  }
}