public class Schewefel {
    public double evaluacion(double [] solucion,int dimension){
        double sum=0.0;
        double sol=0.0;
        for (int i = 0; i < dimension; i++) {
            sum+=(solucion[i]*Math.sin(Math.sqrt(Math.abs(solucion[i]))));
        }
        sol=418.9829*dimension-sum;
        return sol;
    }
}
