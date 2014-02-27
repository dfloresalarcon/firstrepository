
package correoelectronico;

public class Correo {
    
    private String contido;
    private boolean lido;
    
    public Correo()
    {
        this.contido = null;
        this.lido = false;
    }
    
    public Correo(String contido, boolean lido)
    {
        this.contido = contido;
        this.lido =lido;
    }
    
    public void setContido(String contido)
    {
        this.contido=contido;
    }
    
    public void setLido(boolean lido)
    {
        this.lido=lido;
    }
    
    public String getContido()
    {
        return this.contido;
    }
    
    public boolean getLido()
    {
        return this.lido;
    }
}
