package OMS;

public class Main {
    public static void main(String[] args) {
        int choice;
        //Menu
        do { 
            System.out.println("STORE");
            System.out.println("1. Add product");
            System.out.println("2. Update price");
            System.out.println("3. List of all available products");
            System.out.println("4. New Order");
            System.out.println("5. Print an Order by Order ID");
            System.out.println("6. Sort all products by product price");
            System.out.println("7. Print information of all Customer");
            System.out.println("8. Exit");
            System.out.println("Moi chon so");
            choice = Integer.parseInt(sc.nextLine());
    
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    priceUpdate();
                    break;
                case 3:
                    storeProduct();
                    break;
                case 4:
                    newOrder();
                    break;
                case 5:
                    inforOrderbyId();
                    break;
                case 6:
                    productPriceascending();
                    break;
                case 7:
                    infoCustomer("");
                    break;
                case 8:
                    System.out.println("Exit.......");
                default:
                    System.out.println("Khong co dieu nay, chon lai di: ");
            }
        } while (choice !=8);
        }
    }