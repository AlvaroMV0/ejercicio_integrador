public class Ronda {
    private int nro;
    //private Partido[] partido; //pq es esto, no sabemos que hace pero esta ahi

    public Ronda(int nro /*Partido[] partido*/) {
        this.nro = nro;
        // this.partido = partido;
    }

    public int getNro() {
        return nro;
    }

     /*/public Partido[] getPartido() {
        return partido;
    }*/

    public void setNro(int nro) {
        this.nro = nro;
    }

   /* public void setPartido(Partido[] partido) {
       this.partido = partido;*/

}
