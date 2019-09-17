public class Wilder {

	public String firstname; 
	public boolean aware;
	
	 public Wilder(String firstname, boolean aware) {
	        this.firstname = firstname;
	        this.aware = false;
	    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}
	 
	public String whoAmI() {
        if (isAware() == true) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }

        else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
}
