
public class TwoPointsDistance {
 public double setStartPoint(double x1, double y1){
     final Scanner scanner1 = new Scanner(System.in);
     System.out.println("Please, enter x1");
     double x1 = scanner1.nextDouble;
     final Scanner scanner2 = new Scanner(System.in);
     System.out.println("Please, enter y1");
     double y1 = scanner2.nextDouble;
 }
  public double setStsrtPoint(double x2, double y2){
      final Scanner scanner1 = new Scaner(System.in);
      System.out.println("Please, enter x2");
      double x2 = scanner1.nextDouble;
      final Scanner scanner2 = new Scanner(System.in);
      System.out.println("Please, enter y2");
      double y2 = scanner2.nextDouble;
  }
   public double count (double l){
       double l = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
       System.out.println("Distance between points: " + l);
   }
}
