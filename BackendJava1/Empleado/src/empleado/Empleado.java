/* Gestión de empleados: Crea una clase "Empleado"
 con atributos como nombre, salario y cargo.
 Agrega un método para calcular el salario anual.*/

package empleado;

public class Empleado {
    public String name;
    public double salary;
    public String position;


    public double salarioAnual(){
        double anual = salary*12;
        return anual;
    }


}
