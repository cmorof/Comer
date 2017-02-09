
public class Comida
{
    private String nombreComida;
    private int calorias;

    public Comida(String nombreComida, int calorias)
    {
        this.nombreComida = nombreComida;
        this.calorias = calorias;
    }
    
    public int getCalorias()
    {
        return calorias;
    }
}
