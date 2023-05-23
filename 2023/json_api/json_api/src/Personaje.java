import org.json.JSONException;
import org.json.JSONObject;

public class Personaje implements I_ToJSON
{
    private int id;
    private String name;

    private Origin origin;

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Personaje() {
    }

    public Personaje(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Origin getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", origin=" + origin +
                '}';
    }


    @Override
    public JSONObject toJSON() throws JSONException{
        JSONObject jsonObject_personaje = new JSONObject();
        jsonObject_personaje.put("name",getName());
        jsonObject_personaje.put("id",getId());
        jsonObject_personaje.put("origin",getOrigin().toJSON());
        return jsonObject_personaje;
    }

    @Override
    public void fromJSON(JSONObject jsonObject) throws JSONException
    {
        setId(jsonObject.getInt("id"));
    }
}
