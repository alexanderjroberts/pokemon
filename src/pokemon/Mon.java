package pokemon;

public class Mon {
	String species = "missingno";
	int speciesID = 0, xp = 0;
	String nickname,gender,ability,item,statuscondition,altform = "";
	byte[] personality = "0xFFFFFFFF".getBytes();
	int[] ev,iv = new int [6]; //stored as HP, ATK, DEF, SPA, SPD, SPE
	String[] moveset = new String[4];
	int[] currentmovepp,totalmovepp = new int[4];
	
	public Mon(int ID) { 
		
	}
}
