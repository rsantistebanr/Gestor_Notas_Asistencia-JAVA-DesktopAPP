
package co.academia.Beans;




public class Estudiante extends Persona{
    
    private String dni;
    
    private int id_grupo;
    
    public Estudiante() {
    }

    public Estudiante(String dni) {
        this.dni = dni;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }
    
    

    
    
}
