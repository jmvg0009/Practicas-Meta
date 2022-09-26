public class Evaluacion {

    public double ackley(double [] solucion,int dimension){
        int a=20;
        double b= 0.2;
        double c= 2*Math.PI;
        double score;
        double sum1=0.0;
        double sum2=0.0;

        for (int i = 0; i < dimension; i++) {
            sum1 += Math.pow(solucion[i],2);
            sum2 += Math.cos(c*solucion[i]);
        }

        score= -20*Math.exp(-b * Math.sqrt((1.0/dimension)*sum1)) - Math.exp((1.0/dimension)*sum2) + a + Math.exp(1);

        return score;
    }
    public double perm(double [] solucion,int dimension,int beta){
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

    public double rastringin(double [] solucion,int dimension){
        double sum=0.0;
        double sol=0.0;
        for (int i = 0; i < dimension; i++) {
            sum+= ((Math.pow(solucion[i],2))-10*Math.cos(2*Math.PI*solucion[i]));
        }
        sol= 10*dimension + sum;
        return sol;
    }

}
