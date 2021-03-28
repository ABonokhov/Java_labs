package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

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
    public void eatSweet(int index){
		list.remove(index);
	}
    
    public List<Sweet> getSweetsWithSugarAmountInRange(int from, int to) {

		List<Sweet> sugarList = new ArrayList<>();
		
		for (Sweet sweet : list) {
			if (sweet.getSugarAmount() >= from && sweet.getSugarAmount() <= to) {
				sugarList.add(sweet);
			}
        }
            return sugarList;
        }

        public void sortByWeight() {

            Collections.sort(list, new Comparator<Sweet>() {
    
                @Override
                public int compare(Sweet o1, Sweet o2) {
                    return o1.getWeight() - o2.getWeight();
                }
            });
    
        }
		

		



    @Override
    public Iterator<Sweet> iterator() {
        
        return null;
    }
    
}
