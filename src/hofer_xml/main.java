package hofer_xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class main {

	private static final String MITARBEITER_XML = "./mitarbeiter.xml";
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Mitarbeiter> ma = new ArrayList<Mitarbeiter>();

	    Mitarbeiter ma1 = new Mitarbeiter();
	    ma1.setName("Tom Turbo");
	    ma1.setAbteilung("Fahrräder");
	    ma1.setGehalt(1000);
	    ma.add(ma1);

	    Mitarbeiter ma2 = new Mitarbeiter();
	    ma2.setName("Herbie");
	    ma2.setAbteilung("VWs");
	    ma2.setGehalt(500);
	    ma.add(ma2);

	    Filiale f = new Filiale();
	    f.setName("FunFunFun");
	    f.setAdresse("Blaubärgasse 123");
	    f.setList(ma);

	    //JAXB und Marshaller zum umwandeln des Codes/der Daten in ein XML File!
	    JAXBContext context = JAXBContext.newInstance(Filiale.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    m.marshal(f, System.out);

	    m.marshal(f, new File(MITARBEITER_XML));

	    //Ausgabe des XML Files auf der Console!
	    System.out.println();
	    System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    Filiale ftwo = (Filiale) um.unmarshal(new FileReader(MITARBEITER_XML));
	    ArrayList<Mitarbeiter> list = ftwo.getList();
	    for (Mitarbeiter mitarbeiter : list) {
	      System.out.println("Mitarbeiter: " + mitarbeiter.getName() + " ,Abteilung:  "
	          + mitarbeiter.getAbteilung() + " ,Gehalt:  " + mitarbeiter.getGehalt());
	    }
	}

}
