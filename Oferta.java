

public class Oferta
{
   private Persona ofertante;
   private int monto;
   
   public Oferta(Persona ofertante, int monto){
        this.ofertante = ofertante;
        this.monto = monto;
    }

    public int getMonto(){
        return monto;
        
    }
    
    public String getNombre(){
        return ofertante.getPersona();
    }
}
