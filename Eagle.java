public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }
    
  	public void takeOff() {
  		System.out.println(getName() + " takes off in the sky.");
  	};
  	
  	public int ascend(int meters) {
  		this.altitude += meters;
  		System.out.println(getName() + " flies upward, altitude : " + getAltitude());
  		return meters;
  	};
  	
  	public int descend(int meters){
  		this.altitude -= meters;
  		System.out.println(getName() + " flies downward, altitude : " + getAltitude());
  		return meters;
  	};
  	
  	public void land() {
  		if (this.altitude > 1) {
  			System.out.println(getName() + " is to high, it can't land.");
  		} else {
  			System.out.println(getName() + " lands on the ground");
  		}
  	};

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
