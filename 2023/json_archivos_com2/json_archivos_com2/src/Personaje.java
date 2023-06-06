/**
 * Clase persona
 */
public class Personaje
{
    private int id;
    private String name;

    /**
     * Constructor vacio que inicializa el name en "" y el id en 0
     */
    public Personaje() {
        name = "";
        id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
