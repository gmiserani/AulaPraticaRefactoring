import java.util.Enumeration;
abstract class Statement {
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
  abstract String head();
  abstract String enter();
  abstract String result(String each);
  abstract String enterBR();
  abstract String paragraph();
  abstract String EM();
  abstract String close();
  abstract String closeP();
}