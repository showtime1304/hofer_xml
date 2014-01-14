package hofer_xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Mitarbeiter")
public class Mitarbeiter {
	  private String name;
	  private String abteilung;
	  private int gehalt;

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getAbteilung() {
	    return abteilung;
	  }

	  public void setAbteilung(String abteilung) {
	    this.abteilung = abteilung;
	  }

	  public int getGehalt() {
	    return gehalt;
	  }

	  public void setGehalt(int gehalt) {
	    this.gehalt = gehalt;
	  }
}
