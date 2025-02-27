package EjercitoRuso;

public class Soldado extends Humano implements IHumanoExtremidad {
    private Boolean habilidaBrazoIzquierdo;
    private Boolean habilidaBrazoDererecho;

    public Soldado(String nombre) {
        super(nombre);
        this.habilidaBrazoIzquierdo = getHabilidad();
        if (Soldado.brazoDerecho)
            setHabilidaBrazoDererecho(getHabilidad());
        System.out.println("Brazo Derecho: " + getHabilidaBrazoDererecho());
        if (Soldado.brazolzquierdo)
            setHabilidaBrazoIzquierdo(getHabilidad());
        System.out.println("Brazo Izquierdo: " + getHabilidaBrazoIzquierdo());

        // for (int i = 0; i < 10; i++) {
        // System.out.println(getHabilidad());
        // }
    }

    boolean getHabilidad() {
        int bias = 50;
        return (Math.random() * 100 < bias);
    }

    public Boolean getHabilidaBrazoIzquierdo() {
        return habilidaBrazoIzquierdo;
    }

    public void setHabilidaBrazoIzquierdo(Boolean habilidaBrazoIzquierdo) {
        this.habilidaBrazoIzquierdo = habilidaBrazoIzquierdo;
    }

    public Boolean getHabilidaBrazoDererecho() {
        return habilidaBrazoDererecho;
    }

    public void setHabilidaBrazoDererecho(Boolean habilidaBrazoDererecho) {
        this.habilidaBrazoDererecho = habilidaBrazoDererecho;
    }
}
