package hofer_xml;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(namespace = "hofer_xml")
public class Filiale {
	private ArrayList<Mitarbeiter> ma;
	  private String name;
	  private String adresse;

	  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }

		  public String getAdresse() {
		    return adresse;
		  }

		  public void setAdresse(String adresse) {
		    this.adresse = adresse;
		  }
		  
	  @XmlElement(name = "Mitarbeiter")
	  public void setList(ArrayList<Mitarbeiter> ma) {
	    this.ma = ma;
	  }

	  public ArrayList<Mitarbeiter> getList() {
	    return ma;
	  }
}
