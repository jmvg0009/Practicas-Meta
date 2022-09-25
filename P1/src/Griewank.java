public class Griewank {

    public double evaluacion(double [] solucion,int dimension){
        double sum=0.0;
        double sum2=1.0;
        for (int i = 0; i < dimension; i++) {
           sum+= (Math.pow(solucion[i],2))/4000;
           sum2*= (Math.cos((solucion[i])/Math.sqrt(i)))+1;
        }
        return (sum-sum2);
    }

    public double evaluacion2(double [] solucion,int dimension,int m){
        double sum=0.0;
        for (int i = 0; i < dimension; i++) {
            sum+= ((Math.sin(solucion[i]))*Math.pow(Math.sin(i*Math.pow(i*solucion[i],2)/Math.PI),2*m));
        }
        return -sum;
    }
}
