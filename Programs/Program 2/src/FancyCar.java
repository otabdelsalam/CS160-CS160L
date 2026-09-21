public class FancyCar
{
   private boolean engine;
   private int odometer;
   private double gasGallons;
   private double mpg;
   private double capacity;
   private String model;
   private final int FULL_TANK = 14;

   // Default constructor
   public FancyCar() {
      this.odometer = 5;
      this.gasGallons = FULL_TANK;
      this.mpg = 24.0;
      this.model = "Old Clunker";
      this.engine = false;
   }
   
   // Constructor (String make, double mpg)
   public FancyCar(String make, double mpg) {
      this.odometer = 5;
      this.gasGallons = FULL_TANK;
      this.mpg = mpg;
      this.model = make;
      this.engine = false;
   }

   // Return car model
   public String getModel() {
      /* Update the return statment */  
      return model;
   }
    
   // Return miles per gallon (MPG)      
    public double getMPG(){
       /* Update the return statment */  
       return mpg;
    }
    
   // Return miles on odometer    
   public int checkOdometer() {
      /* Update the return statment */  
      return odometer;
   } 
         
   // Return amount of gas in tank
   public double checkGasGauge() {
      /* Update the return statment */  
      return gasGallons;
   }   
   
   // Honk horn
   public void honkHorn() {
      System.out.println("The " + this.model + " says beep beep!");
   }
   
   // Drive car requested miles but check for enough
   // gas and check for positive value
   public void drive(int milesToDrive) {
      if(this.engine)
      {
         if(milesToDrive > 0)
         {
            double totalGallons = (milesToDrive/mpg);
            if(totalGallons > this.gasGallons)
            {
               double onlyMiles = gasGallons*mpg;
               odometer += onlyMiles;
               gasGallons = 0.0;
               stopEngine();
            }
            else
            {
               odometer += milesToDrive;
               gasGallons -= totalGallons;


            }
         }
      }
   }

   // Add gas to tank. Check for positive value.
   public void addGas(double amtToAdd) {
      if(this.engine == false)
      {
         if(amtToAdd > 0)
         {
            if(gasGallons + amtToAdd < FULL_TANK)
            {
               gasGallons += amtToAdd;
            }
            else
            {
               gasGallons = FULL_TANK;
            }
         }
      }
   }
      
   // Set boolean variable to true
    public void startEngine(){
      this.engine = true;
    }
      
   // Set boolean variable to false  
   public void stopEngine() {
      this.engine = false;
   }
}