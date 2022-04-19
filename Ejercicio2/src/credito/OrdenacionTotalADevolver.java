package credito;

import java.util.Comparator;



public class OrdenacionTotalADevolver implements Comparator<Credito>{

	@Override
	public int compare(Credito o1, Credito o2) {
		return o1.getTotalADevolver().compareTo(o2.getTotalADevolver());
	}



}
