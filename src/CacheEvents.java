import java.util.Map;

public interface CacheEvents {

    public Object getObject();

    public void setMapValue();

    public Object getMapValue(Object Key);
    
    public boolean isExpired(long inputTime);
}