public class Ejemplo {

    public static void main(String[] args) {
        String apellido, nomeq, cdsede, nomjug;
        double costo;
        int edad;
        int total = (int) (Math.random() * (8 - 4 + 1) + 4);; //total de equipos el rango utilizado es entre 4 y 8

        //llenar vectore de nombres de equipos (16), de ciudades sede (16), de nombres de jugadores (20)y de apellidosnombresequipos (20)
        String nombresequipos[] = {"America", "Chivas", "Rayados", "Cruz Azul", "Santos Laguna", "Tigres", "Atlas", "Xolos", "Toluca", "Puebla", "Leon", "Monarcas", "Necaxa", "Veracruz", "San Luis", "Pachuca"};
        String ciudadessede[] = {"mexico", "Guadalajara", "Mty", "Mexico", "Torreon", "Mty", "Gdl", "Tijuana", "Toluca", "Puebla", "Leon", "Morelia", "AGS", "Veracruz", "San luis Potosi", "Pachuca"};
        String nomjugadores[] = {"Alejandro ", "Carlos ", "Victor ", "Luis enrique ", "Pablo ", "Guillermo ", "Patricio ", "Roberto ", "Cristobal ", "Hector ", "Mario ", "Javier ", "Daniel ", "Oscar ", "Angel ", "Antonio ", "Esteban ", "Ivan ", "Alberto ", "Cesar "};
        String listaapellidos[] = {"Barba", "Delgado", "Diaz", "Jimenez", "Avila", "Alva", "Hernandez", "Garcia", "Martinez", "Lopez", "Gonzalez", "Perez", "Rodriguez", "Sanchez", "Cruz", "Ramirez", "Flores", "Gomez", "salazar", "comte"};

        //ciclo para controlar equipos
        int n, totjug;
        System.out.println("Liga de Futbol .... ");
        System.out.println("Total de equipos en la liga: "+total+"\n");
        for (int i = 0; i < total; i++) {
            //trabajando el equipo de la posicion i
            n = (int) (Math.random() * (15 - 0 + 1) + 0); //generamos un aleatorio entre 0 y 15 porque tenemos 16 equipos en el array de nombres de equipos
            //No se incluye la validacion para que los nombres de equipo no se repitan ...
            nomeq = nombresequipos[n];//asigna el nombre del equipo de la posicion n
            cdsede = ciudadessede[n];//asigna la ciudad sede de la posicion n

            //genera un aleatorio entre 12 y 18 para el total de jugadores del equipo de la posicion i
            totjug = (int) (Math.random() * (18 - 12 + 1) + 12);

            //Imprime datos generados hasta el momento

            System.out.println("Equipo# "+(i+1));
            System.out.println("Nombre: "+nomeq);
            System.out.println("Ciudad Sede: "+cdsede);
            System.out.println("Total de jugadores: "+totjug);
            System.out.println("");
            System.out.println("Lista de jugadores <nombre>  <edad> <costo> ");


            //Generacion de datos de los jugadores
            for (int j = 0; j < totjug; j++) {
                //generando datos para el jugador de la posicion j del equipo de la posicion i
                n = (int) (Math.random() * (19 - 0 + 1) + 0); //generamos un aleatorio entre 0 y 19 porque tenemos 20 nombres en el array de nombres de jugadores
                nomjug = nomjugadores[n];//asigna el nombre del jugador de la posicion n
                n = (int) (Math.random() * (19 - 0 + 1) + 0); //generamos un aleatorio entre 0 y 19 porque tenemos 20 apellidos en el array de apellidos

                apellido = listaapellidos[n];//asigna el apellido de la posicion n
                //NO se incluye la validacion para que los nombres de jugadores no se repitan
                nomjug = nomjug+apellido;
                costo = (int) (Math.random() * (8000 - 1000 + 1) + 1000);//Generamos un costo del jugador entre un rango de 8000 y 1000
                edad = (int) (Math.random() * (38 - 19 + 1) + 19);//Generamos una edad del jugador entre un rango de 19 y 38

                //Imprimiendo datos de los jugadores

                //Nuevo !!!!! uso de printf en Java para dar formato a la salida

                System.out.printf("\n%-3d%-20s%4d%8.0f",(j+1),nomjug,edad,costo);
            }//fin for jugadores
            System.out.println("\n");

        }//fin for de equipos
    }//fin main
}//fin clase
