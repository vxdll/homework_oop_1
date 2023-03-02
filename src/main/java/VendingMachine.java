import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList(){
        return productList;
    }

    public void addProduct(Product productList){
        this.productList.add(productList);
    }

    public Product getProductByName(String name){
        for (Product product : productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String text = "";
        for (Product product : productList){
            text += product.toString() + "\n";
        }
        return text;
    }
}