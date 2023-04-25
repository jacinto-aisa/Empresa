import RRHH.Departamento;
import RRHH.Empleado;
import RRHH.EmpleadoPrimitivo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado Manolo = new Empleado("Manolo", (byte) 3,2234.4f, 0.12f);
        Empleado Ana = new Empleado("Ana", (byte) 3,789.5f,0.15f);
        EmpleadoPrimitivo ManoloPrimi = new EmpleadoPrimitivo("Manolo", (byte) 3,2345.4f,0.16f);
        EmpleadoPrimitivo AnaPrimi = new EmpleadoPrimitivo("Ana", (byte) 0,1234.5f,0.15f);

        Departamento RRHH = new Departamento();
        RRHH.addEmpleado(Manolo);
        RRHH.addEmpleado(Ana);
        RRHH.addEmpleadoPrimitivo(ManoloPrimi);
        RRHH.addEmpleadoPrimitivo(AnaPrimi);

        System.out.println("Total: "+RRHH.getSueldoTotal());

        //Crear dos empleados y mostrarlos por pantalla.
        //Crear un departamento y ver el total de sueldos de es departamento.
        }
    }
