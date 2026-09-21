class FancyCarClient {
   public static void main(String[] args) {
      FancyCar car = new FancyCar();
      car.drive(50);
      System.out.println("Miles driven: " + car.checkOdometer());
      System.out.println("Gas Tank: " + car.checkGasGauge() + " gallons");
      
      /* Add statements as methods are completed to support development mode test */ 
      
   }
}
