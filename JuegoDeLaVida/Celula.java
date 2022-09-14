package codigos.JuegoVida;

public class Celula {

    private boolean estado;

    public Celula(boolean vivo) {
                this.estado = vivo;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
         if (estado) {
            return "0";
        }else{
            return ".";
        }
    }
}
