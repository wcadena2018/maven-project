package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

   /**
   * @param someone el nombre de una persona.
   * @return saludar a la persona.
   */
  public final String greet(final String someone) {
    return String.format("Hola, %s!", someone);
  }
}
