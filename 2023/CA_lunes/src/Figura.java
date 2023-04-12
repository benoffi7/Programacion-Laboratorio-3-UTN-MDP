public abstract class Figura
{
    private int algo;

    public int getAlgo() {
        return algo;
    }

    public void setAlgo(int algo) {
        this.algo = algo;
    }

    public abstract void otroMetodoAbs();

    public void mostrarAlgo()
    {

    }
    public abstract int calcularArea();
}
