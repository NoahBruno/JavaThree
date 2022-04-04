import java.util.List;

public interface Products {
    List<Product> all();//Get me all the products and return it as a list

    void insert(Product productToInsert);//insert a product

}
