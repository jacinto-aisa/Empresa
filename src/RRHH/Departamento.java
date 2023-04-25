package RRHH;

import java.util.ArrayList;

//Contendrá un ArrayList de Empleados
public class Departamento {
    ArrayList<Empleado> PlantillaNormal;
    ArrayList<EmpleadoPrimitivo> PlantillaPrimitiva;

    public long getSueldoTotal() {
        return sueldoTotal;
    }

    private long sueldoTotal;

    public Departamento() {
        PlantillaNormal = new ArrayList<>();
        PlantillaPrimitiva = new ArrayList<>();
    }

    public void addEmpleadoPrimitivo(EmpleadoPrimitivo Empleado){
        PlantillaPrimitiva.add(Empleado);
        sueldoTotal+=Empleado.getSueldo();
    }

    public void addEmpleado(Empleado Empleado)
    {
        PlantillaNormal.add(Empleado);
        sueldoTotal+=Empleado.getSueldo();
    }


}
