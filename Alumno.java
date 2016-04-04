
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    public static int numClase = 0;
    public float[] notas;
    
    public static final int MEDIA = 5;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        notas = new float[0];
        numClase++;
    }

    /**
     * Añade una nota a la lista de notas
     */
    public void addNota(float nota)
    {
        float[] array2 = notas;
        notas = new float[array2.length + 1];
        for (int i = 0; i < array2.length; i++)
        {
            notas[i] = array2[i];
        }
        notas[array2.length] = nota;
    }
    
    /**
     * Permite conocer la nota media del alumno
     */
    public float notaMedia()
    {
        float notaMedia = 0;
        float notaTotal = 0;
        for (int i = 0; i < notas.length; i++){
            notaTotal = notaTotal + notas[i];
        }
        notaMedia = (float)(notaTotal / notas.length);
        return notaMedia;
    }
    
    /**
     * Permite saber si el alumno ha aprobado o no
     * Si esta aprobado es true
     * Sino es false
     */
    public boolean calificado()
    {
        boolean aprobado = false;
        if(notaMedia() >= 5){
            aprobado = true;
        }
        return aprobado;
    }
    
    /**
     * Muestra los datos del alumno
     */
    public void mostrarDatos()
    {
        System.out.println("Nombre: " + nombre + "   Edad: " + edad);
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas);
        }
        System.out.println("Nota media del alumno: " + notaMedia());
        System. out.println("El alumno promociona: " + calificado());
    }
}
