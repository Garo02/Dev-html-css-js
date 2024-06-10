public class Gradazioni {
    private int[][] mat;
/* crea un oggetto Matrix il cui contenuto è rappresentato dalla matrice mat. */
	public Gradazioni(int[][]mat){
		this.mat=new int[mat.length][mat.length];
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				this.mat[i][j]=mat[i][j];
			}
		}
	}
	/* Dato un indice di cornice, restituisce il valore di quella cornice, cioè la somma degli elementi di
	quella cornice. Se i non è un indice di cornice valido, il metodo restituisce -1 */
    public int valoreCornice(int i){
		int somma=0;
		if(i<0 || i>this.mat.length){
			somma=-1;
		}else{
			for(int j=0;j<=i;j++){
				somma+=this.mat[j][i];
			}
			for(int h=0;h<i;h++){
				somma+=this.mat[i][h];
			}

		}
		return somma;
	}
	/* Restituisce true se la matrice rappresentata dall’oggetto su cui il metodo è invocato (this) è
	euqivalente rispetto alle cornici alla matrice rappresentata dall’oggetto m, false in caso contrario.*/
    public boolean equivalenti(Gradazioni m){
		boolean equivalenti=false;
		for(int i=0;i<this.mat.length;i++){
			if(m.valoreCornice(i)==this.valoreCornice(i)){
				equivalenti=true;
			}
		}
		return equivalenti;
	}
	/* Restituisce una rappresentazione testuale della matrice */
	public String toString(){
		String s="";
		for(int i=0;i<this.mat.length;i++){
			for(int j=0;j<this.mat.length;j++){
				s+=this.mat[i][j]+" ";
			}
			s+="\n";
		}
		return s;
	}

}
