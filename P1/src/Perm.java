public class Perm {
    public double evaluacion(double [] solucion,int dimension,int beta){
        double sum1=0.0;
        double sum2=0.0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                sum2+= ((j+beta)*(Math.pow(solucion[j],i)-(1/Math.pow(j,i))));
            }
            sum1+= Math.pow(sum2,2);
        }
        return sum1;
    }
}
