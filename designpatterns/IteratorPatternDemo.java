package designpatterns;

interface Iterator{
	public boolean hasNext();
	public Object next();
}

interface Container{
	public Iterator getIterator();
}

class CollectionOfNames implements Container{

	public String names[] = {"Riya","Ajay","Meera","Tahir","Raj","Manas"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new IterateCollectionOfNames();
	}
	
	private class IterateCollectionOfNames implements Iterator{
		int i;
		@Override
		public boolean hasNext() {
			if(i<names.length)
			{
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[i++];
			}
			
			return null;
		}
		
	}
	
}

public class IteratorPatternDemo {

	public static void main(String[] args) {
		CollectionOfNames coOfNames = new CollectionOfNames();
		
		for(Iterator iterator= coOfNames.getIterator();iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
		}

	}

}











