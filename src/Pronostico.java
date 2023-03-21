public class Pronostico {

    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(Equipo equipo, ResultadoEnum resultado, Partido partido) {

        this.equipo = equipo;
        this.resultado = resultado;
    }

    int puntos(ResultadoEnum resultado, ResultadoEnum pronostico, int puntos){

        if (resultado == pronostico){
            puntos ++;
        }
        return puntos;

    }


/*  public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }*/

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    public int puntos() {
        return 0;
    }
}
