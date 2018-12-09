
public class MemoryCell {
	// I or S
	private String type;
	// the value
	private String value;
	// the index of this cell in local variable map.
	private int index;
	// it is true if it is a local variable, otherwise it is false.
	private boolean local;
	
	// for index.
	public void setIndex(int i){
		index = i;
	}
	public int getIndex(){
		return index;
	}
	// to get value.
	public String getValue(){
		return value;
	}
	public void setValue(String val){
		value = val;
	}
	// tests if it is a string.
	public boolean isLocal(){
		return local;
	}
	// tests if it is local.
	public boolean isString(){
		return type.equals("S");
	}
	MemoryCell(String v, String t, boolean l){
		type = t;
		value = v;
		local = l;
	}
}
