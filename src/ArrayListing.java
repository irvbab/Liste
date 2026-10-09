public class ArrayListString
{
    //data
    private String[] tab;
    private int taille;

    public ArrayListString(){
        tab = new String[5];
        taille = 0;
    }
    public ArrayListString(int capacite){
        tab = new String[capacite];
        taille= 0;
    }

    public void add (String s){
        if (taille == tab.length){
            // Nouveau Tableau 2 fois plus grand
            String[] tab2 = new String[tab.length*2];
            // on copie les valeurs dans le nouveau tableau
            for (int i = 0; i < taille;i++) {
                tab2[i] = tab[i];
            }
            tab = tab2;
        }
        tab[taille] = s;
        taille++;
    }
    public void printListe(){
        
    }

    public int getTaille() {
        return taille;
    }

    public int getCapacite(){
        return tab.length;
    }
    public String remove(int index){
        if (index < 0 && index > taille){
            throw new ArrayIndexOutOfBoundsException();
        }
        String recup = tab[index];
        tab[index] = null;
        for (int i = index; i < taille-1;i++) {
            tab[i] = tab[i+1];

        }
        tab[taille-1]= null;
        taille--;
        return recup;
    }
}

