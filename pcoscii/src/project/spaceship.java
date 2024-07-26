package project;
/**
 *  @author Sahara Karima Mosin Rahimani
 * The spaceship class which describes 
 * a basic spaceship is the parent class for the 
 * mannedS and unmannedS classes. 
 */
public class spaceship {
	private String sNum; 
	private double height; 
	private int material;
	private double cost; 
	private int dest; 
	private double weight;
	private double velocity; 
	private double durmiss;
	private static int numSS;
	private boolean success;
	private double radius;
	/**
	 * Argumented Constructor 
	 * @param sNum Serial number with the format (XXX-123)
	 * @param material Three material options Metal Alloy(1), Aluminium(2) or Titanium(3)
	 * @param dest Six destination options Moon(1), Mars(2), Venus(3), Jupiter(4), Saturn(5) or Titan(6)
	 * @param height The height of the spaceship
	 * @param radius The radius of the spaceship
	 */
	public spaceship(String sNum, int material, int dest, double height, double radius) {
		this.height=height;
		this.radius=radius;
		this.sNum=sNum;
		this. material=material; 
		this.dest=dest;
		
	}
	/**
	 * Setter/Mutator sets the Serial Number with the format(XXX-123)
	 * @param sNum Serial Number of the spaceship
	 */
	public void setsNum(String sNum) {
			this.sNum=sNum;
		
	}
	public spaceship(spaceship in) {
		sNum=in.sNum; 
		height=in.height; 
		material=in.material;
		cost=in.cost; 
		dest=in.dest; 
		weight=in.weight;
		velocity=in.velocity; 
		durmiss=in.durmiss;
		success=in.success;
		radius=in.radius;
	}
	/**
	 * Setter/Mutator Sets the height
	 * @param height Height of the spaceship
	 */
	public void setHeight(double height) {
		this.height=height;
	}
	/**
	 * Setter/Mutator Sets the material 
	 * to one of the three options Metal
	 *  Alloy(1), Aluminum(2) or Titanium(3)
	 * @param material Material of the spaceship
	 */
	public void setMaterial(int material) {
			this. material=material; 
	}
	/**
	 * Setter/Mutator 
	 * Sets the cost of the spaceship
	 * depending on the material and the price 
	 * of the material per kilogram
	 */
	public  void setCost() {
		if(material==1)
			cost=weight*3;
		if(material==2)
			cost=weight*4;
		if(material==3)
			cost=weight*2.4;

	}
	/**
	 * Setter/Mutator 
	 * Sets the destination 
	 * to one of the six options 
	 * @param dest the destination 
	 * of the Spaceship
	 */
	public void setDest(int dest) {
		
			this.dest=dest;
		
	}
	/**
	 * Setter/Mutator 
	 * Sets the Weight of the spaceship
	 * by calculating the volume using v=pi*h*r*r in m^3
	 * and by using the density formula mass=vol*density
	 * of each material in kg/m^3
	 */
	public void setWeight() {
		
		double volume=Math.PI*Math.pow(radius,2)*height;
		if(material==1)
			weight=volume*7050;
		if(material==2)
			weight=volume*2600;
		if(material==3)
			weight=volume*4510;

	}

	/**
	 * Setter/Mutator
	 * Calcualtes the velocity in m/s of the spaceship
	 * by using the escape velocity formula.
	 */
	public void setVelocity() {
	velocity=Math.sqrt((2*6.674E-11*5.972E24)/6371);
	}


	/**
	 * The duration of the mission 
	 * is calculated with the formula t=s/v
	 * depending of the distance from earth to the destination
	 * in hours.
	 */
	public void setDurmiss() {
		double vkmh=0;
		if(dest==1) {
			vkmh=velocity*3.6;
			durmiss=384400/vkmh;
		}
		if(dest==2) {
			vkmh=velocity*3.6;
			durmiss=281720000/vkmh;
		}
		if(dest==3) {
			vkmh=velocity*3.6;
			durmiss=257040000/vkmh;
		}
		if(dest==4) {
			vkmh=velocity*3.6;
			durmiss=757750000/vkmh;
		}
		if(dest==5) {
			vkmh=velocity*3.6;
			durmiss=1529100000/vkmh;
		}
		if(dest==6) {
			vkmh=velocity*3.6;
			durmiss=1530321850/vkmh;
		}
	}
	/**
	 * 	Setter/Mutator 
	 * Sets success,if the spaceship 
	 * meets certain criteria it is true 
	 * if it does not it is false.
	 * @param success Success of the spaceship
	 */

	public void setSuccess(boolean success) {
		this.success=success;
	}
	/**
	 * Setter/Mutator
	 * adds 1 to the number of
	 * spaceships
	 */
	public static void setNumSS() {
		numSS++;
	}
	/**
	 * Setter/mutator
	 * Sets the radius
	 * @param radius Radius of the spaceship
	 */
	public void setRadius(double radius) {
		this.radius=radius;
	}
	/**
	 * Getter/ accessor
	 * @return sNum the spaceships' serial number
	 */
	public String getsNum() {
		return sNum;
	}
	/**
	 * Getter/Accesor
	 * @return height Spaceships' height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * Getter/Accesor
	 * @return material Spaceships' Material
	 */
	public int getMaterial() {
		return material;
	}
	/**
	 *Getter/Accesor
	 * @return cost Spaceships' cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * Getter/Accesor
	 * @return weight Spaceships' weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * Getter/Accesor
	 * @return dest Spaceships' destination
	 */
	public int getDest() {
		return dest;
	}
	/**
	 * Getter/Accesor
	 * @return velocity Spaceships' velocity
	 */
	public double getVelocity() {
		return velocity;
	}
	/**
	 * Getter/Accesor
	 * @return durmiss Spaceships' duration of mission
	 */
	public double getDurmiss() {
		return durmiss;
	}
	/**
	 * Getter/Accesor
	 * @return success Spaceships' success
	 */
	public boolean getSuccess() {
		return success;
	}
	/**
	 * Getter/Accesor
	 * @return numSS Number of spaceships
	 */
	public static int getNumSS() {
		return numSS;
	}
	/**
	 * Getter/Accesor
	 * @return radius Spaceships' radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * toString for easy printing of data fields
	 */
	public String toString() {
		return "spaceship [sNum=" + sNum + ", height=" + height + ", material=" + material + ", cost=" + cost
				+ ", dest=" + dest + ", weight=" + weight + ", velocity=" + velocity + ", durmiss=" + durmiss
				+ ", success=" + success + ", radius=" + radius + "]";
	}
	/**
	 * Equals method to compare 
	 * spaceships easily
	 * @param obj a Spaceship 
	 * that will be compared to
	 * another spaceship
	 */
	public boolean equals(spaceship obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		spaceship other = (spaceship) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (dest != other.dest)
			return false;
		if (Double.doubleToLongBits(durmiss) != Double.doubleToLongBits(other.durmiss))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (material != other.material)
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		if (sNum == null) {
			if (other.sNum != null)
				return false;
		} else if (!sNum.equals(other.sNum))
			return false;
		if (success != other.success)
			return false;
		if (Double.doubleToLongBits(velocity) != Double.doubleToLongBits(other.velocity))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}



}
