import java.util.*;


public class Oseba{

    String ime;
    String priimek;
    char spol;
    int letoRojstva;
    Oseba oce;
    Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva,Oseba oce, Oseba mati){
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;

    }

    public String vrniIme(){
        return this.ime;
    }

    public String toString(){
        return String.format("%s %s (%c), %d", this.ime, this.priimek, this.spol, this.letoRojstva);
    }

    public int starost(int leto){
        int starost = 0;
        starost = leto - this.letoRojstva;
        return starost;
    }

    public boolean jeStarejsaOd(Oseba os){
        boolean jeStarejsaOd = false;

        if(this.letoRojstva<os.letoRojstva){
            jeStarejsaOd = true;
        }
        return jeStarejsaOd;
    }

    public static Oseba starejsa(Oseba a, Oseba b){
        if(a.letoRojstva < b.letoRojstva){
            return a;
        }else if(a.letoRojstva > b.letoRojstva){
            return b;
        }else{
            return null;
        }
    }

    public String imeOceta(){
        if(this.oce == null){
            return null;
        }else{
            return (this.oce).vrniIme();
        }
    }

    public boolean jeBratAliSestraOd(Oseba os){
        boolean jeBratAliSestraOd = false;

        if((this.oce).toString() == (os.oce).toString() &&(this.mati).toString() == (os.mati).toString()){
            jeBratAliSestraOd = true;
        }

        return jeBratAliSestraOd;
    }




}