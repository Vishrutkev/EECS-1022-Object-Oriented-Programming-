package EECS1022;

public class Velocity {
    private double velocity;
    private double acceleration;
    private double time;

  public Velocity(double velocity, double acceleration, double time ){
      this.velocity = velocity;
      this.acceleration = acceleration;
      this.time = time;

  }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public static double calculateDisplacement(double velocity, double acceleration, double time){

        return (((velocity)*(time)) + ((acceleration *(time)*(time)))/2);

    }

    public static void main(String[] args) {

      double displa = calculateDisplacement(3.0,4.0,5.0);
        System.out.println(displa);

    }
}



