package project;



/**
 * @author Sahara Karima Mosin Rahimani
 *The unmannedS class is the Unmanned Spaceship 
 *class that extends the spaceship class and 
 *is the aggregate class for the rover class
 */
public class unmannedS extends spaceship{
	private rover[] rovers;
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
	public unmannedS(double radius, String sNum, double height, int material, int dest) {
		super( sNum,  material, dest,height,radius);
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
	 *toString for easy printing of the data fields 
	 */
	public String toString() {
		return "["+super.toString()+"unmannedS [rovers=" + rovers + "]"+"]";
	}



}
