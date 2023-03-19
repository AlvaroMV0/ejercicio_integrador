public class Ronda {
    private String nro;
    //private Partido[] partido; //pq es esto, no sabemos que hace pero esta ahi

    public Ronda(String nro /* Partido[] partido*/) {
        this.nro = nro;
        //this.partido = partido;
    }

    public String getNro() {
        return nro;
    }

    /* public Partido[] getPartido() {
        return partido;
    } */

    public void setNro(String nro) {
        this.nro = nro;
    }

    //public void setPartido(Partido[] partido) {
       // this.partido = partido;
    //}
}
