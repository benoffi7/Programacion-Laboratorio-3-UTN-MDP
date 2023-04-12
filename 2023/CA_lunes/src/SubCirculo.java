public class SubCirculo extends Circulo{
    @Override
    public void otroMetodoAbs() {

    }

    @Override
    public void metodoAbsCirculo() {

    }

    //no es obligatoria esta sobrecarga
    @Override
    public int calcularArea() {
        return super.calcularArea() + 10;
    }
}
