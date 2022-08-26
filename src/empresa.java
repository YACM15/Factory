public class empresa {

    private String nombreEmpresa;
    private String direccion;
    private int telefono;
    private int nit;


    //CONSTRUCTOR
    public empresa(String nombreEmpresa, String apellido, int edad, String nombre1, String direccion, int telefono, int nit) {
        super(nombre, apellido, edad);
        this.nombre = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }


    //GET AND SET

    public String getNombreEmpresa() {
        return nombre;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
