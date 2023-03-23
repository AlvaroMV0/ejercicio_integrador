public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;


    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }


    ResultadoEnum resultado(Equipo equipo) {
        if (equipo == equipo1 && golesEquipo1 > golesEquipo2) {
            return ResultadoEnum.GANAEQUIPO1;
        } else if (equipo == equipo2 && golesEquipo2 > golesEquipo1) {
            return ResultadoEnum.GANAEQUIPO2;
        } else if (golesEquipo1 == golesEquipo2) {
            return ResultadoEnum.EMPATE;
        } else if (equipo == equipo1 && golesEquipo1 < golesEquipo2) {
            return ResultadoEnum.GANAEQUIPO2;
        } else if (equipo == equipo2 && golesEquipo2 < golesEquipo1) {
            return ResultadoEnum.GANAEQUIPO1;
        } else {
            return ResultadoEnum.EMPATE;
        }
    }

}

