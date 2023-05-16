package de.mcc;

import controller.ConsoleUI;
import lombok.extern.java.Log;

@Log
public class Main {
  public static void main(String[] args) {
    ConsoleUI console = new ConsoleUI();
    console.run();
  }
}

