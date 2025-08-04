public class Knjiznica{

    int stClanov;
    int stNaslovov;
    int stIzvodovNaNaslov;

    private static int[][] tabelaClana;
    private static int[] tabelaKnjiznice;
    private static int[] tabelaNaslovov;

    
    

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovNaNaslov = stIzvodovNaNaslov;    
        
        tabelaClana = new int[this.stClanov][this.stNaslovov];
        tabelaKnjiznice = new int[stNaslovov];
        tabelaNaslovov = new int[stNaslovov];

        for(int i = 0; i<stNaslovov; i++){
            tabelaKnjiznice[i] = stIzvodovNaNaslov;
        }
    }

    public boolean posodi(int clan, int naslov){
        if(tabelaKnjiznice[naslov] > 0  && tabelaClana[clan][naslov] == 0 ){
            tabelaClana[clan][naslov] = 1;
            tabelaKnjiznice[naslov] = tabelaKnjiznice[naslov] -1;
            tabelaNaslovov[naslov] = tabelaNaslovov[naslov] +1;
            return true;
        }
        return false;
            
    }

    public void clanVrne(int clan){
        for(int i = 0; i<tabelaClana[clan].length; i++){
            
            if(tabelaClana[clan][i] != 0){
                tabelaClana[clan][i] = 0;
                tabelaKnjiznice[i] = tabelaKnjiznice[i] +1;
            }
        }
        for(int i=0; i<tabelaKnjiznice.length; i++){
            
        }
    }

    public int posojeni(int naslov){
        int stPosojenih = 0;

        stPosojenih = this.stIzvodovNaNaslov - tabelaKnjiznice[naslov];
        
        
        return stPosojenih;
    }

    public int priClanu(int clan){
        int priClanu = 0;
        for(int i = 0; i<tabelaClana[clan].length; i++){
            priClanu = priClanu + tabelaClana[clan][i];
        }
        return priClanu;
    }

    public int najNaslov(){
        int najNaslov = 0;
        int max = 0;
        for(int i =0; i<tabelaNaslovov.length; i++){
            if(tabelaNaslovov[i] > max){
                max = tabelaNaslovov[i];
                najNaslov = i;
            }
        }
        return najNaslov;
    }

}