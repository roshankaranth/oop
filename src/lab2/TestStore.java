package lab2;

class Item {

    private String itemName;
    private String itemNo;
    private int itemQuantity;
    private double itemPrice;

        

    public Item(String itemName, String itemNo, int itemQuantity, double itemPrice){
        this.itemName = itemName;
        this.itemNo = itemNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public Item(String itemName, String itemNo, int itemQuantity){
        this.itemName = itemName;
        this.itemNo = itemNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = 500;
    }

    public Item(String itemName, String itemNo){
        this.itemName = itemName;
        this.itemNo = itemNo;
        this.itemQuantity = 1;
        this.itemPrice = 500;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setItemNo(String itemNo){
        this.itemNo = itemNo;
    }

    public void setItemQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }

    public void setitemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public String getItemName(){
        return itemName;
    }

    public String getItemNo(){
        return itemNo;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }

    public double getItemPrice(){
        return itemPrice;
    }

}

class Customer{
    

    private String name;
    private String idNo;
    private double balance;
    private Item item;


    public Customer(String name, String idNo, double balance){
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;

    }

    public Customer(String name, String idNo){
        this.name = name;
        this.idNo = idNo;
        this.balance = 500;
    }

    public String getName(){
        return name;
    }

    public String getIdNo(){
        return idNo;
    }

    public double getBalance(){
        return balance;
    }

    public Item getItem(){
        return item;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIdNo(String idNo){
        this.idNo = idNo;
    }

    public void print(){

        System.out.println("Item Bought : " + item.getItemName());
        System.out.println("Item id No. : " + item.getItemNo());
        System.out.println("No. of items bought : " + item.getItemQuantity());
        System.out.println("Price of item bought : " + item.getItemPrice() );
        System.out.println("Balance left after item bought : " + balance);

    }

    public void buyItem(Item item){

        if(balance>=item.getItemPrice() && item.getItemQuantity()>=1){

            System.out.println("Item bought : " + item.getItemName());
            System.out.println("Current Balance : " + balance);

            this.item = item;
            balance = balance - item.getItemPrice();
            System.out.println();
            print();

        }else if (item.getItemQuantity() < 1){
            System.out.println("Order is Invalid!");
        }else{
            System.out.println("Insufficient Balance!");
        }
        
    }
    
}


public class TestStore{
    public static void main(String[] args) {
        Customer c1 = new Customer("ROshan" , "2021B4A31745P", 700);
        Item item1 = new Item("Laptop", "1");
        Item item2 = new Item("Phone", "2", 1, 300);

        c1.buyItem(item1);
        System.out.println();
        c1.buyItem(item2);
        System.out.println();
        

    }
}



