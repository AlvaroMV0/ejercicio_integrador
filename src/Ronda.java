public class Ronda {
    private int nro;
    private int puntos;


    public Ronda(int nro ) {
        this.nro = nro;

    }
    public int puntos(ResultadoEnum resultado, ResultadoEnum pronostico, int puntos){

        if (resultado == pronostico){
            puntos ++;
        }
        return puntos;

    }

        public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
