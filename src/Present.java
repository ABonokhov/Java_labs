package src;

import java.util.Iterator;
import java.util.List;

public class Present implements Iterable <Sweet> {
    private List <Sweet> list;
    public Present(List<Sweet>list) {
        this.list=list;
    }
    public void putSweet(Sweet sweet){
		list.add(sweet);
    }
    public Sweet showSweet(int index){
		return list.get(index);
	}
    


    @Override
    public Iterator<Sweet> iterator() {
        
        return null;
    }
    
}
