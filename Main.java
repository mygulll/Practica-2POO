import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    int optionMenu;
    int auxId;
        ArrayList <Estudiante> EstudianteArrayList = new ArrayList <> ();
        //Voy a crear 5 instancias
        EstudianteArrayList.add(new Estudiante("Camilo",123,"Geologia",88.5));
        EstudianteArrayList.get(0).AsignarEstado();
        EstudianteArrayList.add(new Estudiante("Michale",1,"Fisica",8));
        EstudianteArrayList.get(1).AsignarEstado();
        EstudianteArrayList.add(new Estudiante("Canela",452,"Programacion",95));
        EstudianteArrayList.get(2).AsignarEstado();
        EstudianteArrayList.add(new Estudiante("Lorenso",144,"Fisica",10));
        EstudianteArrayList.get(3).AsignarEstado();
        EstudianteArrayList.add(new Estudiante("Alberto",9,"Circuitos Electricos",4));
        EstudianteArrayList.get(4).AsignarEstado();

        do {
            System.out.println("***Menu***\n1.Captura de alumno \n2.Mostrar alumno" + "\n3.Cambiar calificacion \n4.Salir");
            optionMenu = CapturaEntrada.capturarEntero("");

            switch (optionMenu){
                //Captura Alumnos
                case 1:
                    System.out.println("***Inicio de captura***");
                    EstudianteArrayList.add(new Estudiante(CapturaEntrada.capturarCadena("Nombre: "),
                            CapturaEntrada.capturarEntero("id: "), CapturaEntrada.capturarCadena("Materia"),
                            CapturaEntrada.capturarDoble("Calificacion")));
                            //GetIdglobal es el index de la ultima estancia del array list
                            //Asi asginamos su estado al crearse.
                            EstudianteArrayList.get(Estudiante.getIdGlobal()).AsignarEstado();
                    break;
                //Imprime Alumnos
                case 2:
                    for (int i = 0; i <= EstudianteArrayList.size()-1; i++)
                    {
                        System.out.println("*** Alumno: "+i+" ****");
                        System.out.printf("Nombre: %s\tID: %d\nMateria: %s\t Calificacion: %.2f\nEstado: %s\n",
                                EstudianteArrayList.get(i).getNombre(),  EstudianteArrayList.get(i).getId(),
                                EstudianteArrayList.get(i).getMateria(), EstudianteArrayList.get(i).getCalificacion(),
                                EstudianteArrayList.get(i).getEstado());
                    }
                    System.out.println("***Fin impresion*** \n");
                    break;
                //Cambia calif por medio del id
                case 3:
                    auxId = CapturaEntrada.capturarEntero("Ingrese el id del alumno: ");
                    for (int i = 0; i <= EstudianteArrayList.size()-1; i++){
                        if(auxId == EstudianteArrayList.get(i).getId()){
                            EstudianteArrayList.get(i).CambiarCalificacion(CapturaEntrada.capturarDoble("Calificacion: "));
                            EstudianteArrayList.get(i).AsignarEstado();
                        }
                    }
                    break;
                //Salir
                case 4:
                    System.out.println("Gracias por usar este programa :)");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    optionMenu = 0;
                    break;
            }


        }while(optionMenu!=4);
    }
}
