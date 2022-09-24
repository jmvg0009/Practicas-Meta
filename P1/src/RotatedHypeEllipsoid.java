public class RotatedHypeEllipsoid {
    public double evaluacion(double [] solucion,int dimension){
        double sum1=0.0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < solucion.length; j++) {
                sum1+= Math.pow(solucion[j],2);
            }
        }
        return sum1;
    }
}
