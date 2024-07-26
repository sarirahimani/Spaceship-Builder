package project;
/**
 * @author Sahara Karima Mosin Rahimani
 * The rover class is aggregated in
 * the mannedS and unmannedS classes
 * and it describes a space rover
 */

public class rover {
	String sNum; 
	double height; 
	int material; 
	double cost;
	double weight;
	int frover;
	static int numRovers; 
	/**
	 * Unargumented Constructor
	 */
	public rover() {
		sNum="ABC-123";
		height=1.5; 
		material=1; 
		cost=5000;
		weight=800;
		frover=1;
	}
	/**
	 * Argumented Constructor
	 * @param sNum Serial Number of the rover with the format (XXX-123)
	 * @param height height of the rover
	 * @param material material of the rover Metal Alloy(1), Aluminium(2), Titanium(3)
	 * @param frover function of the rover 
	 */
	public rover(String sNum, double height, int material,int frover) {
		
			this.sNum=sNum;
			this. height=height; 
			this. material=material; 
			this.frover=frover;
		
	}
	/**
	 *Argumented Copy constructor
	 * @param in rover that will be copied
	 */
	public rover(rover in) {
		this.sNum=in.sNum;
		this. height=in.height; 
		this. material=in.material; 
		this.cost=in.cost;
		this.weight=in.weight;
		this.frover=in.frover;
	}
	/**
	 * Setter/Mutator
	 * Sets serial number with format (XXX-123)
	 * @param sNum Serial Number of rover
	 */
	public void setsNum(String sNum) {
		
		
			this.sNum=sNum;
		
	}
	/**
	 * Setter/Mutator
	 * Sets height
	 * @param height height of rover
	 */
	public void setHeight(double height) {
		
			this. height=height; 
		
	}
	/**
	 * Setter/Mutator
	 * Sets material 
	 * @param material material of rover
	 */
	public void setMaterial(int material) {
		
			this. material=material; 
		
	}
	/**
	 *Setter/Mutator 
	 * Calculates the cost of the rover
	 * depending on the material and the price 
	 * of the material per kilogram
	 */
	public void calculateCost() {
		if(material==1)
			cost=weight*3;
		if(material==2)
			cost=weight*4;
		if(material==3)
			cost=weight*2.4;
	}
	/**
	 Setter/Mutator 
	 * Sets the Weight of the rover
	 * by calculating the volume using v=pi*h*r*r in m^3
	 * and by using the density formula mass=vol*density
	 * of each material in kg/m^3
	 */
	public void calculateWeight() {
		double volume=0;
		volume=Math.pow(height,3);
		if(material==1)
			weight=volume*7050;
		if(material==2)
			weight=volume*2600;
		if(material==3)
			weight=volume*4510;
	}
	/**
	 * Setter/Mutator
	 * Sets the function of the rover 
	 * to one of the three options 
	 * Atmespheric analysis(1), Surface
	 * analysis(2) or Sample collection(3)
	 * @param frover function of the rover
	 */
	public void setFrover(int frover) {
		
			this.frover=frover;
		
	}
	/**
	 * Mutator
	 * increments numRovers by 1
	 */
	public static void addNumRovers() {
		numRovers++;
	}

	/**
	  * Getters/Accessors
	 * @return sNum Serial number of rover
	 */
	public String getsNum() {
		return sNum;
	}
	/**
	 * 
	 * @return
	 */
	public double getHeight() {
		return height;
	}
	/**
	  * Getters/Accessors
	 * @return material material of rover
	 */
	public int getMaterial() {
		return material;
	}
	/**
	  * Getters/Accessors
	 * @return cost cost of rover
	 */
	public double getCost() {
		return cost;
	}
	/**
	  * Getters/Accessors
	 * @return weight Weight of rover
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * Getters/Accessors
	 * @return frover function of rover
	 */
	public int getFrover() {
		return frover;
	}
	/**
	 * Getters/Accessors
	 * @return numRovers number of rovers
	 */
	public static int getNumRovers() {
		return numRovers;
	}
	/**
	 * toString for easy printing of data fields
	 */
	public String toString() {
		return "rover [sNum=" + sNum + ", height=" + height + ", material=" + material + ", cost=" + cost + ", weight="
				+ weight + ", frover=" + frover + "]";
	}
	/**
	 * equals method for easy comparing 
	 * of rovers
	 */
	public boolean equals(rover obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rover other = (rover) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (frover != other.frover)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (material != other.material)
			return false;
		if (sNum == null) {
			if (other.sNum != null)
				return false;
		} else if (!sNum.equals(other.sNum))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}



}
