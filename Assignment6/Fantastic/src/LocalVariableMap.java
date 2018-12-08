import java.util.HashMap;

public class LocalVariableMap {
	HashMap<String, MemoryCell> map;
	private int nextAvailableIndex = 0;
	public LocalVariableMap(){
		map = new HashMap<String, MemoryCell>();
	}
	public void put(String key, MemoryCell mc){
		mc.setIndex(nextAvailableIndex++);
		map.put(key, mc);
	}
	public void freeCells(int num){
		nextAvailableIndex = nextAvailableIndex - num;
	}
	public MemoryCell get(String key){
		return map.get(key);
	}
	
}
