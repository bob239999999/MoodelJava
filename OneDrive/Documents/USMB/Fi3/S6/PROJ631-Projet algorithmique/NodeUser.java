package proj631_projet2;
import java.util.*;

public class NodeUser extends Node {
    private int id;
    private HashMap<Integer, Data> interestData;
    
    public NodeUser(int id, HashMap<Integer, Data> interestData) {
    	super(id); // call the constructor of the superclass with the id argument
        this.interestData = interestData;
    }

    public int getId() {
        return id;
    }

    public HashMap<Integer, Data> getInterestData() {
        return interestData;
    }

}