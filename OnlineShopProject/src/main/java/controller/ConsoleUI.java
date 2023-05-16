package controller;

import static service.ProductService.addProduct;
import static service.ProductService.buyProducts;
import static service.ProductService.deleteProduct;
import static service.ProductService.findProduct;
import static service.ProductService.listProducts;

import java.util.Scanner;
import lombok.extern.java.Log;
import service.ShoppingCart;

@Log
public class ConsoleUI {
  private static final Scanner scanner = new Scanner(System.in);
  public static final ShoppingCart shoppingCart = new ShoppingCart();

  public void run() {
    while (true) {
      log.info("1- Add product");
      log.info("2- List products");
      log.info("3- Delete product");
      log.info("4- Find product");
      log.info("5- Buy products");
      log.info("6- Exit");
      log.info("Select an option: ");
      int option = scanner.nextInt();
      scanner.nextLine();
      switch (option) {
        case 1 -> addProduct();
        case 2 -> listProducts();
        case 3 -> deleteProduct();
        case 4 -> findProduct();
        case 5 -> buyProducts();
        case 6 -> System.exit(0);
        default -> log.info("Invalid option");
      }
    }
  }
}