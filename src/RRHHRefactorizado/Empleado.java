package RRHHRefactorizado;

public class Empleado implements ICostable {
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
    @Override
    public float dameCoste() {
        return sueldo;
    }

    @Override
    public String dameDescripcion() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeHijos=" + numeroDeHijos +
                ", sueldo=" + sueldo +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                '}';
    }
}



