package Agent;

import java.util.ArrayList;
import java.util.HashMap;

public class A_Uebergabe {
	HashMap<String, A_Situation> situationen;
	ArrayList<A_Aktion> aktionen_ID;
	HashMap<String, A_Aktion> aktionen = new HashMap<String, A_Aktion>();
	ArrayList<String> agenten;
	public HashMap<String, A_Aktion> getAktionen() {
		return aktionen;
	}
	public void setAktionen(HashMap<String, A_Aktion> aktionen) {
		this.aktionen = aktionen;
	}
	public ArrayList<A_Aktion> getAktionen_ID() {
		return aktionen_ID;
	}
	public void setAktionen_ID(ArrayList<A_Aktion> aktionen_ID) {
		this.aktionen_ID = aktionen_ID;
	}
	public HashMap<String, A_Situation> getSituationen() {
		return  situationen;
	}
	public void setSituationen(HashMap<String, A_Situation> situationen) {
		this.situationen = situationen;
	}
	public ArrayList<String> getAgenten() {
		return agenten;
	}
	public void setAgenten(ArrayList<String> agenten) {
		this.agenten = agenten;
	}
}
