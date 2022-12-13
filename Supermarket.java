package supermarketautomationsoftware;
import java.util.Scanner;

public class Supermarket {
		 
	     int serialNumber;
	     String itemName;
	     int codeNumber;
	     int quantity;
	     double unitPrice;
	     double itemPrice;
	     double totalAmountPayable;
	 
	    public Supermarket(int serialNumber, String itemName, int codeNumber, int quantity, double unitPrice, double itemPrice) {
	        this.serialNumber = serialNumber;
	        this.itemName = itemName;
	        this.codeNumber = codeNumber;
	        this.quantity = quantity;
	        this.unitPrice = unitPrice;
	        this.itemPrice = itemPrice;
	        this.totalAmountPayable = 0.0;
	    }
	 
	     void setSerialNumber(int serialNumber) {
	        this.serialNumber = serialNumber;
	    }
	 
	     int getSerialNumber() {
	        return serialNumber;
	    }
	 
	     void setItemName(String itemName) {
	        this.itemName = itemName;
	    }
	 
	     String getItemName() {
	        return itemName;
	    }
	 
	     void setCodeNumber(int codeNumber) {
	        this.codeNumber = codeNumber;
	    }
	 
	     int getCodeNumber() {
	        return codeNumber;
	    }
	 
	     void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
	 
	     int getQuantity() {
	        return quantity;
	    }
	 
	     void setUnitPrice(double unitPrice) {
	        this.unitPrice = unitPrice;
	    }
	 
	     double getUnitPrice() {
	        return unitPrice;
	    }
	 
	     void setItemPrice(double itemPrice) {
	        this.itemPrice = itemPrice;
	    }
	 
	     double getItemPrice() {
	        return itemPrice;
	    }
	 
	     void setTotalAmountPayable(double totalAmountPayable) {
	        this.totalAmountPayable += totalAmountPayable;
	    }
	 
	     double getTotalAmountPayable() {
	        return totalAmountPayable;
	    }
	 
	    public void printBill() {
	        System.out.println("Serial Number: " + serialNumber);
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Code Number: " + codeNumber);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Unit Price: " + unitPrice);
	        System.out.println("Item Price: " + itemPrice);
	        System.out.println("Total Amount Payable: " + (totalAmountPayable+(quantity*unitPrice*itemPrice)));
	    }
	 
	    public void updateInventory(int quantity) {
	   
	        this.quantity =25- quantity;
	        System.out.println("Inventory Updated. Quantity remaining: " + this.quantity);
	    }
	 
	    public void checkInventory() {
	        System.out.println("Quantity Available: " + this.quantity);
	    }
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the serial number:");
		int serialNumber=obj.nextInt();
		System.out.println("Enter the item name:");
		String itemName=obj.next();
		System.out.println("Enter the codenumber:");
		int codeNumber=obj.nextInt();
		System.out.println("Enter the quantity:");
		int quantity=obj.nextInt();
		System.out.println("Enter the price:");
		double unitPrice=obj.nextDouble();
		System.out.println("Enter the unitprice:");
		double itemPrice=obj.nextDouble();
		Supermarket obj1=new Supermarket(serialNumber,itemName,codeNumber,quantity,unitPrice,itemPrice);
		obj1.printBill();
		int a=obj1.getQuantity();
		obj1.updateInventory(a);
		obj1.checkInventory();
		
		
		}

}
