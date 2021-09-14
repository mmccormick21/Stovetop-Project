// Authors: Matthew Mccormick and Sophia Fausey
public enum Setting {
	OFF ("[---]"), LOW ("[--+]"), MEDIUM ("[-++]"), HIGH ("[+++]");
	String value;
	
	Setting (String aValue) {
		value = aValue;
	}
	
	// getter
	public String getSetting() {
		return value;
	}
}
