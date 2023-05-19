import org.json.JSONException;
import org.json.JSONObject;

public interface I_ToJSON
{
    JSONObject toJSON() throws JSONException;

    void fromJSON(JSONObject jsonObject)throws JSONException;

}
