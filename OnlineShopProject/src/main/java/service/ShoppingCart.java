package service;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Product;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
  private List<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public void clearCart() {
    products.clear();
  }
}
