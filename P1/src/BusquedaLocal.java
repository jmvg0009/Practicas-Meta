public class BusquedaLocal {

    private final Randon rand;

    public BusquedaLocal(long semilla) {
        rand=new Randon();
        rand.Set_random(semilla);
    }

    void busquedalocal(int iteracion,double probabilidad,float porcentajeAleatorio,int k,int dimension,int valorMin,int valorMax,String funcion){
        double [] mejorSolucion = new double[dimension];
        double mejorCoste=0.0;
        int it=0;
        double [][] vecinos = new double[k][dimension];
        boolean mejora = true;
        Evaluacion eva=new Evaluacion();
        double[] solucion=new double[dimension];
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
            int nuevomej;
            nuevomej=nuevoMejor(vecinos,mejorSolucion,mejorCoste,k);
           // mejorSolucion=nuevoMejor(vecinos,mejorSolucion,mejorCoste,k,mejora);
//            double compruebaMejora=eva.ackley(mejorSolucion);
//            if(compruebaMejora==mejorCoste){
//                mejora=false;
//            }
            if(nuevomej==-1){
                mejora=false;
            }else {
                mejorSolucion=vecinos[nuevomej];
            }
            it++;
        }

        System.out.println("El mejor coste es " + mejorCoste);
        for (int i = 0; i < dimension; i++) {
            System.out.println(mejorSolucion[i]);
        }

    }

    double[] solucionInicialAleatoria(double [] sol,int dimension,int valorMin,int valorMax){

        for (int i = 0; i < dimension; i++) {
            sol[i]=rand.Randint(valorMin,valorMax);
        }
        return sol;
    }

    int nuevoMejor (double [][] vecinos,double[] mejorSolucion,double mejorCoste,int k){
        Evaluacion eva=new Evaluacion();
        int posicion=-1;
        for (int i = 0; i <k ; i++) {
            double aux = 9999999999999999999999999999999.0;
            aux = eva.ackley(vecinos[i]);
            if (aux < mejorCoste) {
                //mejorSolucion = vecinos[i];
                posicion=i;
            }
        }
        return posicion;
    }

}
