package model;

import java.io.Serializable;

public class Part implements Serializable{

	private int partID;
	private int nrOfParts;
	private String name;
	private String make;
	private String description;
	private String category;
	private Location location;
	public Part(int partID,  String name, String make, String description,
			String category, int nrOfParts, int shelfNr, int box) {
		this.partID = partID;
		this.name = name;
		this.make = make;
		this.description = description;
		this.category = category;
		this.nrOfParts = nrOfParts;
		//this.location = new Location(shelfNr, box, partID, nrOfParts);
		this.location = new Location(shelfNr, box);
		
	}

	public void setPartID(int partID) {
		this.partID = partID;
	}
	public void setNrOfParts(int nrOfParts) {
		this.nrOfParts = nrOfParts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getPartID() {
		return partID;
	}
	public int getNrOfParts() {
		return nrOfParts;
	}

	public String getName() {
		return name;
	}

	public String getMake() {
		return make;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public Location getLocation() {
		return location;
	}
	public int getShelfNr()
	{
		return location.getShelfNr();
	}
	public int getBox()
	{
		return location.getBox();
	}

	public String toString() {
		return "\nPartID: " + partID + "\nName: " + name + "\nMake: " + make
				+ "\nDescription: " + description + "\nCategory: " + category  + "\nNumber of parts: " + nrOfParts
				+ "\n"+location;
	}
}
