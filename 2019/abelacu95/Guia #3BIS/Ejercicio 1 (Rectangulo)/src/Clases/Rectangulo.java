package Clases;

public class Rectangulo {

    private float ancho;
    private float altura;

    public Rectangulo(float _ancho, float _altura) {
        ancho = _ancho;
        altura = _altura;
    }

    public float getAncho() {
        return ancho;
    }

    public float getAltura() {
        return altura;
    }

    public void modificarAncho(float ancho){
        this.ancho = ancho;
    }

    public void modificarAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea(float _ancho, float _altura){
        return (_ancho * _altura) ;
    }

    public float calcularPerimetro(float _ancho, float _altura){
        return (2 *_ancho) + (2 * _altura) ;
    }


    public String mostrarAnchoyAltura(){

        return "\nAltura : "+altura+"\nAncho : "+ancho;
    }

    public String mostrarAreayPerimetro(){
        return "\nArea :"+calcularArea(ancho, altura)+
                "\nPerimetro :"+calcularPerimetro(ancho,altura);
    }
}
