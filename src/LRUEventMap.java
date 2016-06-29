import java.util.Map;

import java.util.HashMap;

public class LRUEventMap implements CacheEvents {

	HashMap map;
	private long interval;

	public void setMapValue() {

		long timeNow = System.currentTimeMillis();

		Object putValues = null;
		synchronized (putValues) {
			map.put(new Double(timeNow), getObject());
		}
	}

	public Object getMapValue(Object Key) {
		Object getValue;
		synchronized (Key) {
			getValue = map.get(Key);
		}
		return getValue;
	}

	public Object getObject() {
		return this;
	}

	public void remove(Object Key) {
		synchronized (Key) {
			this.map.remove(Key);
		}
	}

	public boolean isExpired(long inputTime) {
		long timeValue = System.currentTimeMillis();

		if (timeValue >= (inputTime + 1000)) {
			return true;
		} else {
			return false;
		}
	}

	// public void cleanOldValues(){
	//
	// Iterator iter=map.KeySet().Iterator();
	//
	// while(iter.hasNext()){
	// Key k=iter.next();
	//
	// if (isExpired(key))
	// map.remove(key);
	// }
	// }

}