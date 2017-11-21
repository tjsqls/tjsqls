package music;

public class TEST {

	private int seonBin;
	private int im;
	private int babo;
	private String jinhwi;
	private String jjangjjang;
	
	public TEST() {
		seonBin = 1;
		im = 2;
		babo = 3;
	}
	
	private boolean checkOurLeader() {
		
		if (seonBin+im == babo) {
			System.out.println("�씤�븷 : �뀋�뀍");
		}
		return true;
	}
	
	}


