package RRHHRefactorizado;

public class EmpleadoPrimitivo implements ICostable {

    String Nombre;
    byte numeroDeHijos;

    float sueldo;

    float porcentajeBeneficios;

    public EmpleadoPrimitivo(String nombre, byte numeroDeHijos, float sueldo, float porcentajeBeneficios) {
        Nombre = nombre;
        this.numeroDeHijos = numeroDeHijos;
        this.sueldo = sueldo;
        this.porcentajeBeneficios = porcentajeBeneficios;
    }

    @Override
    public float dameCoste() {
        return sueldo;
    }

    @Override
    public String dameDescripcion() {
        return "EmpleadoPrimitivo{" +
                "Nombre='" + Nombre + '\'' +
                ", numeroDeHijos=" + numeroDeHijos +
                ", sueldo=" + sueldo +
                ", porcentajeBeneficios=" + porcentajeBeneficios +
                '}';
    }
}
