public class BusquedaLocal {

    private final Randon rand;

    public BusquedaLocal(long semilla) {
        rand=new Randon();
        rand.Set_random(semilla);
    }

    void busquedalocal(int iteracion,float probabilidad,float porcentajeAleatorio,int k,double[] solucion,int dimension,int valorMin,int valorMax){
        solucion=solucionInicialAleatoria(solucion,dimension,valorMin,valorMax);


    }

    double[] solucionInicialAleatoria(double [] sol,int dimension,int valorMin,int valorMax){

        for (int i = 0; i < dimension; i++) {
            sol[i]=rand.Randint(valorMin,valorMax);
        }
        return sol;
    }
}
