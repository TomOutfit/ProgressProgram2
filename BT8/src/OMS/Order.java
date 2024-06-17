package OMS;

import java.sql.Array;
import java.util.ArrayList;

public abstract class Order {
    public String OrderId;
    public String Date;
    Customer customer;
    ArrayList<Product> productList;

public Order(String orderId, String date, Customer customer, ArrayList<Product> productList) {
    OrderId = orderId;
    Date = date;
    this.customer = customer;
    this.productList = productList;
    
}

public String getOrderId() {
    return OrderId;
}

public void setOrderId(String orderId) {
    OrderId = orderId;
}

public String getDate() {
    return Date;
}

public void setDate(String date) {
    Date = date;
}

public Customer getCustomer() {
    return customer;
}

public void setCustomer(Customer customer) {
    this.customer = customer;
}

public ArrayList<Product> getProductList() {
    return productList;
}

public void setProductList(ArrayList<Product> productList) {
    this.productList = productList;
}
