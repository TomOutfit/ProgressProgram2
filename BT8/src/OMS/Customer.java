package OMS;

public class Customer extends Person {
    String country;
    public Customer(String name, String age, String Sex);
    super(name, age, sex);
    this.country = country;   
}
@Override
public void language() {
    if (country.equals("USA")) {
        System.out.println("English");
    }
    else if (country.equals("VN")) {
        System.out.println("Vietnam");
    }
    else if (country.equals("JP")) {
        System.out.println("Japanese");
    }
    else {
        System.out.println("We don't know");
    }
}