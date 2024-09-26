package com.campusdual.classroom;

public class FuelTank {

  public void setActualFuel(int actualFuel) {

    if(actualFuel<0){
      System.out.println("No puede ser negativo el fuel");
    }else{
      this.actualFuel = actualFuel;
    }

  }

  private int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }
}
