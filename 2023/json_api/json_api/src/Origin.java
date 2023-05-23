import org.json.JSONException;
import org.json.JSONObject;

public class Origin implements I_ToJSON
{
    private String name;
    private String url;

    public Origin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public JSONObject toJSON() throws JSONException
    {
        JSONObject jsonObject_origin = new JSONObject();
        jsonObject_origin.put("url",getUrl());
        jsonObject_origin.put("name",getUrl());
        return jsonObject_origin;
    }

    @Override
    public void fromJSON(JSONObject jsonObject) throws JSONException {

    }
}
