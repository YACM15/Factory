public class empleado {
    //ATRIBUTOS

    private String nombre;
    private String correo;
    private String rol;
    private int empresaContratadora;


    //CONSTRUCTOR

    public empleado(String nombre, String correo, String rol, int empresaContratadora) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.empresaContratadora = empresaContratadora;

    }


    //GET AND SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEmpresaContratadora() {
        return empresaContratadora;
    }

    public void setEmpresaContratadora(int empresaContratadora) {
        this.empresaContratadora = empresaContratadora;
    }

    //METODOS

}