import model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.ShoppingCart;

public class ShoppingCartTest {
  private ShoppingCart shoppingCart;

  @BeforeEach
  public void setUp() {
    shoppingCart = new ShoppingCart();
    Product product1 = new Product("Product 1", "Description 1", 10.0, 20.0, true);
    Product product2 = new Product("Product 2", "Description 2", 20.0, 20.0, true);
    shoppingCart.addProduct(product1);
    shoppingCart.addProduct(product2);
  }

  @Test
  public void testRemoveProduct() {
    // Remove an existing product
    Product productToRemove = shoppingCart.getProducts().get(0);
    shoppingCart.removeProduct(productToRemove);
    Assertions.assertEquals(1, shoppingCart.getProducts().size());

    // Remove a non-existing product
    Product nonExistingProduct = new Product("Product 3", "Description 3", 30.0, 20.0, true);
    shoppingCart.removeProduct(nonExistingProduct);
    Assertions.assertEquals(1, shoppingCart.getProducts().size());
  }

  @Test
  public void testAddProduct() {
    // Arrange
    Product product = new Product("Product 1", "Description 1", 10.0, 20.0, true);

    // Act
    shoppingCart.addProduct(product);

    // Assert
    Assertions.assertEquals(product, shoppingCart.getProducts().get(0));
  }

  @Test
  public void testClearCart() {
    // Clear a non-empty cart
    shoppingCart.clearCart();
    Assertions.assertEquals(0, shoppingCart.getProducts().size());

    // Clear an empty cart
    shoppingCart.clearCart();
    Assertions.assertEquals(0, shoppingCart.getProducts().size());
  }
}
