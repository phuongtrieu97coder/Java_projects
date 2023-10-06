public class Droid{
  String name;
  int batteryLevel=100;
  
  public Droid(String droidName){
    this.name = droidName;
  }

  public String toString(){
    return "Hello, I'm the droid: "+name;
  }

  public void performTask(String task){
    System.out.println(name+" is performing task: "+task);
    batteryLevel-=10;
  }

  public void energyReport(){
    System.out.println("Battery Level: "+batteryLevel);
  }

  public static void main(String[] args){
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      Codey.performTask("Coding");
      Codey.energyReport();
  }
}