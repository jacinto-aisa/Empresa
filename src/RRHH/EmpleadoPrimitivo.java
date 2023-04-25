package RRHH;
//Variables tipo primitivo
//string,int,short,long,float
public class EmpleadoPrimitivo {
    String Nombre;
    byte numeroDeHijos;

    public float getSueldo() {
        return sueldo;
    }

    float sueldo;

    float porcentajeBeneficios;

    public EmpleadoPrimitivo(String nombre, byte numeroDeHijos, float sueldo, float porcentajeBeneficios) {
        Nombre = nombre;
        this.numeroDeHijos = numeroDeHijos;
        this.sueldo = sueldo;
        this.porcentajeBeneficios = porcentajeBeneficios;
    }

}
