public class LKartchner_P1 
{
   public static void main (String[] args) {
      double foodSalesTaxRate = .03; // Tax rate for food items
      double nonFoodSalesTaxRate = .0675; // Tax rate for non-food items
      
      double foodBill = 150.0; // Total food bill
      double nonFoodBill = 50.0; // Total non-food bill
      
      /* Total taxes = food taxes + nonfood taxes */
      double totalTax = foodSalesTaxRate * foodBill 
         + nonFoodSalesTaxRate * nonFoodBill; 
      
      /* Print statement with the total calculated taxes */
      System.out.println("The total tax for your bill is: " + totalTax);
   }
}