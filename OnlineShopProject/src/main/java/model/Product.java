package model;

import lombok.Data;

@Data
public class Product {
  private long id;
  private final String name;
  private final String description;
  private final double price;
  private double weight;
  private static boolean isDigital;


  public Product(String name, String description, double price, double weight, boolean isDigital) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.weight = weight;
    this.isDigital = isDigital;

  }

  public long getId() {
    return id;
  }

  public double getWeight() {
    return weight;
  }

  public static boolean isDigital() {
    return isDigital;
  }
}
