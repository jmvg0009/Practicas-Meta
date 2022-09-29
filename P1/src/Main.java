public class Main {
    public static void main(String[] args) {
        Configurador config = new Configurador(args[0]);
        int dimension= config.getDimension();
        int rango_inferior= config.getRango_inferior();
        int rango_superior= config.getRango_superior();
        BusquedaLocal bl=new BusquedaLocal(14523);

        bl.busquedalocal(12, 0.3,0.1f,3,10,-100,100,"acley");


    }
}