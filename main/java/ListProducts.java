import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products{
    private List<Product> products = new ArrayList();//an arraylist to dummy what will eventually be a database we're talking to [think coffee project]
    public ListProducts(){
        insert(new Product("sink",14.99));
        insert(new Product("hose",9.99));
        insert(new Product("glass",5.99));
    }

    public List<Product> all() {
        return this.products;
    }

    public void insert(Product productToInsert) {
        this.products.add(productToInsert);
    }
}
