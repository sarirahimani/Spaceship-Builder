package project;


/**
 *@author Sahara Karima Mosin Rahimani
 *The mannedS class is the Manned Spaceship 
 *class that extends the spaceship class and 
 *is the aggregate class for the rover class
 */

public class mannedS extends spaceship{

private rover[] rovers;
	private int numPass;

	/**
	 * Argumented constructor 
	 * @param sNum Serial Number of Spaceship
	 * @param material Material of Spaceship
	 * @param dest Destination of Spaceship
	 * @param numPass Number of Passengers in the 
	 * Spaceship
	 * @param height Height of the Spaceship
	 * @param sNumR Serial Number of Rover
	 * @param heightR Height of Rover
	 * @param materialR Material of Rover
	 * @param frover Function of the rover
	 */
	public mannedS(double radius, String sNum, int material, int dest, int numPass, double height) {
		super(sNum,material, dest, height,radius);
		
			this.numPass=numPass;
		
		rovers=new rover[5];
		 for(int i=0;i<5;i++) {
				rovers[i]=new rover();
		}

	}


	/**
	 * Getter/Accessor
	 * gets a specific rover
	 * @param index Index of the rover 
	 * that will be returned
	 * @return rover 
	 */
	public rover getRovers(int index) {
		return new rover(rovers[index]);

	}
	/**
	 * Setter/Mutator
	 * Copies a rover and
	 * adds it to the arrayList
	 * @param in the rover that will 
	 * be copied
	 */
	public void setRovers(rover in, int index) {
		rovers[index]=new rover(in);
	}

	/**
	 * Setter/Mutator
	 * Sets the number of passengers which can
	 * be from 1 to 5
	 * @param numPass Number of Passengers in 
	 * the manned spaceship
	 */
	public void setNumPass(int numPass) {
		if(numPass>=1 && numPass<=5 ) {
			this.numPass=numPass;
		}else {
			throw new IllegalArgumentException("The number of Passengers is in the incorrect range.");
		}
	}


	/**
	 * Getter/Accessor
	 * @return numPass Number
	 * of Passengers in the manned Spaceship
	 */

	public int getNumPass() {
		return numPass;
	}

	/**
	 *toString for easy printing of the data fields 
	 */
	public String toString() {
		return "["+super.toString()+"mannedS [rovers=" + rovers + ", numPass=" + numPass + "]"+"]";
	}







}
