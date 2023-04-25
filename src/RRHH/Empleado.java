package RRHH;
//Variables no son de tipo primitivo
//String,Integer,Short,Long,Float
public class Empleado {
    String nombre;
    Byte numeroDeHijos;

    float sueldo;

    float porcentajeBeneficio;

    public Empleado(String nombre, Byte numeroDeHijos, float sueldo, float porcentajeBeneficio) {
        this.nombre = nombre;
        this.numeroDeHijos = numeroDeHijos;
        this.sueldo = sueldo;
        this.porcentajeBeneficio = porcentajeBeneficio;
    }


    public float getSueldo() {
        return sueldo;
    }
}


