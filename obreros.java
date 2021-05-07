import java.util.Scanner;

public class obreros{

   public static void main(String argv[]){
	Scanner leer = new Scanner(System.in);
	int prod[][],n,dias;
	String nom[];

	 System.out.println("\nCuantos obreros son: ");
        	n = leer.nextInt();

        nom = new String [n];
        prod = new int [n][];

	for(int i = 0; i < n; i++){
		System.out.println("\nNombre del obrero " +i+ " : ");
		     leer.nextLine();
		     nom[i] = leer.nextLine();

		System.out.println("Cuantos dias fue a trabajas: ");
		     dias = leer.nextInt();

		prod[i] = new int [dias];

		for(int j = 0; j < dias; j++)
		    prod[i][j] = (int)(Math.random() * (20 - 10 + 1) + 10);
	}

	imprimir(nom,prod);
	obreros.sumP(nom, prod);
	sumaC(prod);
   }

   public static void sumP(String nom[], int prod[][]){
        System.out.println("\nProduccion por obrero \n");
        int acum, may = 0;
        String aux="";

        for(int i = 0; i < prod.length; i++){
            System.out.print(nom[i] + "  ");
            acum = 0;
              for(int j = 0; j < prod[i].length; j++)
                  acum+= prod[i][j];

            if(acum > may){
                aux = nom[i];
                may = acum;
            }

           System.out.println(acum + "  \n");
        }

        System.out.println("\n Obrero con mas produccion: " +aux);

   }

   public static void sumaC(int prod[][]){
    int acum,mayor=0,menor=1000000,pos=0,aux;

        System.out.println("Sumatoria por Columnas.....");

        for (int i = 0; i < prod.length; i++){
        aux=0;
            for (int j = 0; j < prod[i].length; j++) {
            aux++;
                if(aux > mayor)
                    mayor = aux;
            }
        }

        for (int i = 0; i < mayor; i++) {
        acum = 0;
            for(int j = 0; j < prod.length; j++) {
                if(i < prod[j].length)
                    acum += prod[j][i];
            }
            if(acum < menor){
                menor = acum;
                pos = i;
            }
            System.out.println("La suma de la columna " + i + " es: " + acum);
        }
        System.out.println("La columna con menor produccion es la: " + pos + " con "  + menor);
    }

   public static void imprimir(String nom [], int prod [][]){
   	System.out.println("\nImprimiendo....	\n");

   	for(int i = 0; i < prod.length; i++){
   	    System.out.println(nom[i] + "  ");
   	      for(int j = 0; j < prod[i].length; j++)
   		  System.out.print("  " + prod[i][j] + "  ");

        System.out.println("");
   	}

   }
}
