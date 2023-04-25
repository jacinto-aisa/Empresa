package RRHHRefactorizado;

import java.util.ArrayList;

//Contendrá un ArrayList de Empleados
public class Departamento implements ICostable{
    ArrayList<ICostable> Plantilla;
    private long sueldoTotal;

    public Departamento() {
        Plantilla = new ArrayList<>();
        this.sueldoTotal = 0;
    }


    public void addRecurso(ICostable Empleado)
    {
        Plantilla.add(Empleado);
        sueldoTotal+=Empleado.dameCoste();
    }

    @Override
    public float dameCoste() {
        return sueldoTotal;
    }

    @Override
    public String dameDescripcion() {
        StringBuilder descripcion= new StringBuilder();
        for (ICostable Item : Plantilla)
        {
            descripcion.append(Item.dameDescripcion());
        }
        return descripcion.toString();
    }
}

