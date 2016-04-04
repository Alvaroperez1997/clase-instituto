import java.util.*;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        Random aleatorio = new Random();
        int edad = 0;
        
        ArrayList<String> listaNombres = new ArrayList<String>(Arrays.asList("Alvaro", "Dani", "Carlos", 
        "Pepe", "Juan"));
        
        Collections.shuffle(listaNombres);
        
        Alumno alumno = null;
        for (int i = 0; i < 5; i++){
            edad = aleatorio.nextInt(60)+16;
            
            alumno = new Alumno(listaNombres.get(i), edad);
            for(int d = 0; d < 5; d++){
            }
        }
    }

}
