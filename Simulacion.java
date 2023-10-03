import java.util.ArrayList;
import java.util.Scanner;

public class Simulacion {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de iteraciones");
        int nmi = sc.nextInt();
        SolucionDto solution = obtenerSolucion(nmi);
        System.out.println(solution.toString());
        sc.close();
    }
    public static SolucionDto obtenerSolucion(int nmi){
        int x1= 0,x2=0;
        int aux1,aux2;
        double auxz,z=9999999;;
        int seed ;
        int a;
        for(int i = 0; i<nmi ; i++){
            seed =  Math.round((float) Math.random() * 8999 + 1000);
            seed = seed % 2 == 0 ? seed + 1 : seed;
            a = Math.round((float) Math.random() * 20);
           // System.out.println("seed: "+seed);
            ArrayList<Double> randArray = numerosAleatorios.multiplicativeMethod(a, 1024, seed,2);
            aux1 = (int) Math.round(randArray.get(0) * 1000);
            aux2 = (int) Math.round(randArray.get(1) * 95 + 5);
            if((6*aux1 + 3*aux2 >= 200)&&(3*aux1 + 5*aux2 >= 180)) {
                auxz = (2.5 * aux1 + 2 * aux2);
                if(auxz < z){
                    z = auxz;
                    x1 = aux1;
                    x2 = aux2;
                }
            }
        }
        return new SolucionDto(z,x1,x2);
    }
}
