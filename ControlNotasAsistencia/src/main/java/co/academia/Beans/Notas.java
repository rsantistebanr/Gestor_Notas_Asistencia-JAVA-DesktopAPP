
package co.academia.Beans;

public class Notas {
    private String dni;
    private int id_curso;
    private int id_parcial;
    private int num_preguntasM;
    private int num_preguntasB;
    private float puntaje;

    public Notas(String dni, int id_curso, int id_parcial, int num_preguntasM, int num_preguntasB, float puntaje) {
        this.dni = dni;
        this.id_curso = id_curso;
        this.id_parcial = id_parcial;
        this.num_preguntasM = num_preguntasM;
        this.num_preguntasB = num_preguntasB;
        this.puntaje = puntaje;
    }
    public Notas(){
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_parcial() {
        return id_parcial;
    }

    public void setId_parcial(int id_parcial) {
        this.id_parcial = id_parcial;
    }

    public int getNum_preguntasM() {
        return num_preguntasM;
    }

    public void setNum_preguntasM(int num_preguntasM) {
        this.num_preguntasM = num_preguntasM;
    }

    public int getNum_preguntasB() {
        return num_preguntasB;
    }

    public void setNum_preguntasB(int num_preguntasB) {
        this.num_preguntasB = num_preguntasB;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
