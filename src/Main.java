import RRHH.Departamento;
import RRHH.Empleado;
import RRHH.EmpleadoPrimitivo;
import RRHH.FactoriaDeEmpleados;
import RRHHRefactorizado.ICostable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FactoriaDeEmpleados MiFabrica = new FactoriaDeEmpleados();
        Empleado Manolo = MiFabrica.dameNormal("Manolo", (byte) 3,2234.4f, 0.12f);
        Empleado Ana = MiFabrica.dameNormal("", (byte) -3,-789.5f,1.15f);
        EmpleadoPrimitivo ManoloPrimi = MiFabrica.damePrimitivo("Manolo", (byte) 3,2345.4f,0.16f);
        EmpleadoPrimitivo AnaPrimi = MiFabrica.damePrimitivo("Ana", (byte) 0,1234.5f,0.15f);

        Departamento RRHH = new Departamento();
        if (Manolo != null) {
            RRHH.addEmpleado(Manolo);
        }
        if (Ana != null) {
            RRHH.addEmpleado(Ana);
        }
        if (ManoloPrimi != null) {
            RRHH.addEmpleadoPrimitivo(ManoloPrimi);
        }
        if (AnaPrimi != null) {
            RRHH.addEmpleadoPrimitivo(AnaPrimi);
        }
        System.out.println("Total: "+RRHH.getSueldoTotal());

        ICostable Manolo2 = new RRHHRefactorizado.Empleado("Manolo", (byte) 3,2234.4f, 0.12f);
        ICostable Ana2 = new RRHHRefactorizado.Empleado("Ana", (byte) 3,789.5f,0.15f);
        ICostable ManoloPrimi2 = new RRHHRefactorizado.EmpleadoPrimitivo("Manolo", (byte) 3,2345.4f,0.16f);
        ICostable AnaPrimi2= new RRHHRefactorizado.EmpleadoPrimitivo("Ana", (byte) 0,1234.5f,0.15f);


        RRHHRefactorizado.Departamento Informatica = new RRHHRefactorizado.Departamento();
        Informatica.addRecurso(Manolo2);
        Informatica.addRecurso(Ana2);
        Informatica.addRecurso(ManoloPrimi2);
        Informatica.addRecurso(AnaPrimi2);

        System.out.println("Total--: "+Informatica);
        System.out.println("Total: "+Informatica.dameCoste());

        RRHHRefactorizado.Departamento Contabilidad = new RRHHRefactorizado.Departamento();
        Contabilidad.addRecurso(Contabilidad);



        RRHHRefactorizado.Departamento SuperDepartamento = new RRHHRefactorizado.Departamento();
        SuperDepartamento.addRecurso(Informatica);
        SuperDepartamento.addRecurso(Ana2);
        SuperDepartamento.addRecurso(Contabilidad);

        //Crear dos empleados y mostrarlos por pantalla.
        //Crear un departamento y ver el total de sueldos de es departamento.
        }
    }
