public class Main {
    public static void main(String[] args) {
        Configurador config = new Configurador(args[0]);
        int dimension= config.getDimension();
        int rango_inferior= config.getRango_inferior();
        int rango_superior= config.getRango_superior();
        BusquedaLocal bl=new BusquedaLocal(14523);
        double[] sol= new double[10];
        bl.busquedalocal(12,1,1,1,sol,10,-100,100);
        for (int i = 0; i < 10; i++) {
            System.out.println(sol[i]);
        }
    }
}