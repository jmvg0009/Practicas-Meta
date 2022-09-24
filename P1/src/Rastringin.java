public class Rastringin {
    public double evaluacion(double [] solucion,int dimension){
        double sum=0.0;
        double sol=0.0;
        for (int i = 0; i < dimension; i++) {
            sum+= ((Math.pow(solucion[i],2))-10*Math.cos(2*Math.PI*solucion[i]));
        }
        sol= 10*dimension + sum;
        return sol;
    }
}
