public class Estudiante {
    //Atributos
    String nombre;
    int id;
    String materia;
    private double calificacion;
    private String estado;
    static int idGlobal = -1;


    //Constructor
    public Estudiante(String nombre, int id, String materia, double calificacion ) {
        setNombre(nombre);
        setMateria(materia);
        setId(id);
        setCalificacion(calificacion);
        idGlobal++;
    }

    //Metodos
    public void AsignarEstado(){
        double califacion = this.calificacion;
        if(calificacion<60)
        {
            this.estado="Reprobado";
        }
        else {
            this.estado = "Aprobado";
        }
    }

    public void CambiarCalificacion(double calificacion){
        this.calificacion = calificacion;
    }

    //Setters y gettes

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getMateria() {
        return materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public static int getIdGlobal() {
        return idGlobal;
    }
}
