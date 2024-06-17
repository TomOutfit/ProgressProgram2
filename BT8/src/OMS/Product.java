package OMS;

public abstract class Product {
    public string name;
    public string id;
    public double price;
    public Product(string name, string id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public string getName() {
        return name;
    }
    public void setName(string name) {
        this.name = name;
    }
    public string getId() {
        return id;
    }
    public void setId(string id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.name))
            return false;
        return true;
    }
    
}
