public class Pronostico {

    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(Equipo equipo, ResultadoEnum resultado) {

        this.equipo = equipo;
        this.resultado = resultado;
    }


    public ResultadoEnum getResultado() {
        return resultado;
    }


}
