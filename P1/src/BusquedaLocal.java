public class BusquedaLocal {

    private final Randon rand;

    public BusquedaLocal(long semilla) {
        rand=new Randon();
        rand.Set_random(semilla);
    }

    void busquedalocal(int iteracion,float probabilidad,float porcentajeAleatorio,int k,double[] solucion,int dimension,int valorMin,int valorMax,String funcion){
        double [] mejorSolucion = new double[dimension];
        double mejorCoste=0.0;
        int it=0;
        double [][] vecinos = new double[k][dimension];
        boolean mejora = true;
        Evaluacion eva=new Evaluacion();
        mejorSolucion=solucionInicialAleatoria(solucion,dimension,valorMin,valorMax);
        mejorCoste=eva.ackley(mejorSolucion);

        while(it<iteracion && mejora){
            for(int i =0;i<k;i++){
                for (int j = 0; j < dimension; j++) {
                    double muta = rand.Randfloat(0,1);
                    if (muta < probabilidad){
                        float inferior= (float) (mejorSolucion[j]*(1-porcentajeAleatorio));
                        float superior= (float) (mejorSolucion[j]*(1+porcentajeAleatorio));
                        vecinos[i][j]=rand.Randfloat(inferior,superior);
                    }else {
                        vecinos[i][j]=mejorSolucion[j];
                    }
                }
            }

            mejorSolucion=nuevoMejor(vecinos);

        }

    }

    double[] solucionInicialAleatoria(double [] sol,int dimension,int valorMin,int valorMax){

        for (int i = 0; i < dimension; i++) {
            sol[i]=rand.Randint(valorMin,valorMax);
        }
        return sol;
    }

    double [] nuevoMejor (double [][] vecinos){
        return null;
    }

}
