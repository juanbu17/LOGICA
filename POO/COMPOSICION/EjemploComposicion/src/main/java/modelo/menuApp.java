package modelo;

import java.util.Scanner;

public class menuApp {
    Scanner sc = new Scanner(System.in);
    Curso curso = new Curso();
    Profesor profesor = new Profesor();
    Asignacion asignacion = new Asignacion();

    public void menu(){
        System.out.println("Oprima 1 para iniciar");
        int init = sc.nextInt();

        while(init!=0){

            System.out.println(
                    "1. Crear profe \n"+
                    "2. Ver profe \n"+
                    "3. Crear curso \n"+
                    "4. Crear profe \n"+
                    "5. Crear asignacion \n"+
                    "6. Crear profe \n"+
                    "7. Salir \n"
            );
                    int opc=1;

                    switch(opc){

                        case 1:
                            profesor.crearProfesor();
                            break;

                        case 2:
                            profesor.verProfesor();
                            break;

                        case 3:
                            curso.crearCurso();
                            break;

                        case 4:
                            curso.verCurso();
                            break;

                        case 5:
                            asignacion.crearAsignacion();
                            break;

                        case 6:
                            asignacion.profesor=profesor;
                            asignacion.curso= curso;
                            asignacion.verAsignacion();
                            break;

                        case 7:
                            System.out.println("salir");
                            init=0;
                            break;

                        default:

                            System.out.println("Asigna una opcion correcta");

                    }


        }
    }
}
