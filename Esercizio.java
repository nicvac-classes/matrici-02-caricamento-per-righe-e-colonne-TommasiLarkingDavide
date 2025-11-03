
public class Esercizio {

    public static void riempiRighe(int [][] M, int righe,int  colonne) {
		int i,c,j;
		c=1;
		i=0;
		while(i<=righe-1) {
			j=0;
			while(j<colonne-1) {
				M[i][j]=c;
				++c;
				++j;
			}
			++i;
		}
	}

  	public static void riempiColonne(int [][] M, int righe,int  colonne) {
		int i,c,j;
		c=1;
		j=0;
		while(j<=colonne-1) {
			i=0;
			while(i<righe-1) {
				M[i][j]=c;
				++c;
				++i;
			}
			++j;
		}
	}

    public static void main(String[] args) {
        // SCRIVERE QUI IL CODICE DELL'ESERCIZIO
    }
}