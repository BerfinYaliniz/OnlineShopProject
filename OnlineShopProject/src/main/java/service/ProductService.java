package service;


import static controller.ConsoleUI.shoppingCart;

import java.util.List;
import java.util.Scanner;
import lombok.extern.java.Log;
import model.Payment;
import model.PaymentType;
import model.Product;
import org.springframework.stereotype.Service;

@Service
@Log
public class ProductService {
  private static final Scanner scanner = new Scanner(System.in);

  public static void addProduct() {
    log.info("Enter product name: ");
    String name = scanner.nextLine();

    log.info("Enter product description: ");
    String description = scanner.nextLine();

    log.info("Enter product price: ");
    double price = scanner.nextDouble();

    log.info("Enter product weight: ");
    double weight = scanner.nextDouble();

    log.info("Enter product is Digital- TRUE or FALSE: ");
    Boolean isDigital = scanner.nextBoolean();

    Product product = new Product(name, description, price, weight, isDigital);
    shoppingCart.addProduct(product);
    log.info("Product added to cart.");
  }

  public static void listProducts() {
    log.info("Product list: ");
    for (Product product : shoppingCart.getProducts()) {
      System.out.printf("%d - %s - %s - %.2f $\n -  %s ",
          product.getId(), product.getName(), product.getDescription(), product.getPrice(),
          product.getWeight());
    }
  }

  public static void deleteProduct() {
    log.info("Enter product id to delete: ");
    long productId = scanner.nextLong();
    scanner.nextLine();

    Product productToDelete = null;
    for (Product product : shoppingCart.getProducts()) {
      if (product.getId() == productId) {
        productToDelete = product;
        break;
      }
    }

    if (productToDelete != null) {
      shoppingCart.removeProduct(productToDelete);
      log.info("Product deleted.");
    } else {
      log.info("Product not found.");
    }
  }

  public static void findProduct() {
    log.info("Enter product name to search: ");
    String productName = scanner.nextLine();

    for (Product product : shoppingCart.getProducts()) {
      if (product.getName().equalsIgnoreCase(productName)) {
        log.info(String.format("Product found: %d - %s - %s - %.2f $",
            product.getId(), product.getName(), product.getDescription(), product.getPrice()));
      }
    }
  }

  public static void buyProducts() {
    if (shoppingCart.getProducts().isEmpty()) {
      log.info("Your cart is empty.");
      return;
    }
    // Calculate total weight of products
    double totalWeight = 0.0;
    for (Product product : shoppingCart.getProducts()) {
      totalWeight += product.getWeight();
    }
    if (!Product.isDigital()) {
      double shippingCost = calculateShippingCost(totalWeight);
      log.info("Shipping cost: %.2f $ " + shippingCost);
    } else {
      log.info("No shipping cost for digital products.");
      return;
    }

    Payment payment = new Payment();
    log.info("Enter your email address: ");
    payment.setEmail(scanner.nextLine());

    log.info("Enter your phone number: ");
    payment.setPhoneNumber(scanner.nextLine());

    log.info("Select payment method:");
    log.info("1- Credit Card");
    log.info("2- PayPal");
    log.info("3- Cash on Delivery");

    int paymentOption = scanner.nextInt();
    scanner.nextLine();

    switch (paymentOption) {
      case 1 -> {
        payment.setPaymentType(PaymentType.CREDIT_CARD);
        log.info("Payment information for Credit Card:");
        log.info("Card number: ");
        String cardNumber = scanner.nextLine();
        log.info("Expiration date (MM/YY): ");
        String expirationDate = scanner.nextLine();
        log.info("CVV: ");
        String cvv = scanner.nextLine();
        log.info("Name on card: ");
        String nameOnCard = scanner.nextLine();
        log.info("Billing address: ");
        String billingAddress = scanner.nextLine();

        // Output relevant data for credit card payment
        log.info("Sending payment information to credit card service provider:");
        log.info("Card number: " + cardNumber);
        log.info("Expiration date: " + expirationDate);
        log.info("CVV: " + cvv);
        log.info("Name on card: " + nameOnCard);
        log.info("Billing address: " + billingAddress);
      }
      case 2 -> {
        payment.setPaymentType(PaymentType.PAYPAL);
        log.info("Payment information for PayPal:");
        log.info("PayPal username: ");
        String username = scanner.nextLine();
        log.info("PayPal password: ");
        String password = scanner.nextLine();

        // Output relevant data for PayPal payment
        log.info("Sending payment information to PayPal service provider:");
        log.info("Username: " + username);
        log.info("Password: " + password);
      }
      case 3 -> payment.setPaymentType(PaymentType.CASH_ON_DELIVERY);
      default -> {
        log.info("Invalid payment option.");
        return;
      }
    }

    shoppingCart.clearCart();
    log.info("Thank you for shopping with us.");
  }

  private static double calculateShippingCost(double totalWeight) {
    if (totalWeight <= 1.0) {
      return 5.0;
    } else if (totalWeight <= 5.0) {
      return 10.0;
    } else {
      return 15.0;
    }
  }

  public List<Product> getProducts() {
    return getProducts();
  }
}
