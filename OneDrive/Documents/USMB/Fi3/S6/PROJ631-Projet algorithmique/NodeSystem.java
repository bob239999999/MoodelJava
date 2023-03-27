package proj631_projet2;
import java.util.*;

public class NodeSystem extends Node {
    private int id;
    private int memoryCapacity;
    private HashMap<Integer, Data> storedData;

    public NodeSystem(int id, int MemoryCapacity, HashMap<Integer, Data> storedData) {
    	super(id); // call the constructor of the superclass with the id argument
        this.memoryCapacity = MemoryCapacity;
        this.storedData = storedData;
    }

    public int getId() {
        return id;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public HashMap<Integer, Data> getstoredData() {
        return storedData;
    }


}
