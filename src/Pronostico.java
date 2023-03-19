public class Pronostico {

    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico( Equipo equipo, ResultadoEnum resultado) {

        this.equipo = equipo;
        this.resultado = resultado;
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

    public int puntos(){
        return 0;
    }
}
