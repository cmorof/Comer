
public class Persona
{
    private String nombrePersona;
    private boolean hombre;
    private int peso;
    private int altura;
    private int edad;
    private int calorias;
    
    public Persona(String nombrePersona, boolean hombre, int peso, int altura, int edad)
    {
        this.nombrePersona = nombrePersona;
        this.hombre = hombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        calorias = 0;
    }

    public int comer(Comida darDeComer)
    {
        if(hombre = true){
            if(calorias <= ((10 * peso) + (6 * altura) + (5 * edad) + 5))
            {
                calorias += darDeComer.getCalorias();
            }
            else
            {
                calorias = -1;
            }
        }
        
        if(hombre = false)
        {
            if(calorias <= ((10 * peso) + (6 * altura) + (5 * edad) - 161))
            {
                calorias += darDeComer.getCalorias();
            }
            else
            {
                calorias = -1;
            }
        }
        return calorias;
    }
    
    public int getCaloriasIngeridas()
    {
        return calorias;
    }
}
