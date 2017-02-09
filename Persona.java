
public class Persona
{
    private String nombrePersona;
    private boolean hombre;
    private int peso;
    private int altura;
    private int edad;
    private int calorias;
    private int caloriasIngeridas;
    
    public Persona(String nombrePersona, boolean hombre, int peso, int altura, int edad)
    {
        this.nombrePersona = nombrePersona;
        this.hombre = hombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        calorias = 0;
        caloriasIngeridas = 0;
    }

    public int comer(Comida comer)
    {
        if(hombre = true){
            if(calorias <= ((10 * peso) + (6 * altura) + (5 * edad) + 5))
            {
                calorias += comer.getCaloriasIngeridas();
                caloriasIngeridas = comer.getCaloriasIngeridas();
            }
            else
            {
                caloriasIngeridas = -1;
            }
        }
        
        if(hombre = false)
        {
            if(calorias <= ((10 * peso) + (6 * altura) + (5 * edad) - 161))
            {
                calorias += comer.getCaloriasIngeridas();
                caloriasIngeridas = comer.getCaloriasIngeridas();
            }
            else
            {
               caloriasIngeridas = -1;
            }
        }
        return caloriasIngeridas;
    }
    
    public int getCaloriasIngeridas()
    {
        return calorias;
    }
    
    public String contestar(String pregunta)
    {
        String respuesta = "";
        if(hombre = true)
        {
            if(pregunta.contains(nombrePersona))
            {
                respuesta = pregunta.toUpperCase();
            }
            else if(calorias <= ((10 * peso) + (6 * altura) + (5 * edad) + 5))
            {
                if(pregunta.length() % 3 == 0)
                {
                    respuesta = "SI";
                }
                else
                {
                    respuesta = "NO";
                }
            }
            else if (calorias > ((10 * peso) + (6 * altura) + (5 * edad) + 5) || pregunta.contains(nombrePersona))
            {
                respuesta = pregunta.toUpperCase();
            }
        }
        
        if(hombre = false)
        {
            if(calorias <= ((10 * peso) + (6 * altura) + (5 * edad) - 161))
            {
                if(pregunta.length() % 3 == 0)
                {
                    respuesta = "SI";
                }
                else
                {
                    respuesta = "NO";
                }
            }
            else if (calorias > ((10 * peso) + (6 * altura) + (5 * edad) - 161) || pregunta.contains(nombrePersona))
            {
                respuesta = pregunta.toUpperCase();
            }
        }
        return respuesta;
    }
}
