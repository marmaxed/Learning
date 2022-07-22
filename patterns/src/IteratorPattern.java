import java.util.List;

class iteratorPattern{

}

class Collection{
    private Object value;
    int getSize(){
        return myCollection.size();
    }
    public List<Object> myCollection;
    public void setValue(Object value){
        this.value = value;
        myCollection.add(value);
    }
    public Object getValue(int index){
        return myCollection.get(index);
    }
}
class Iterator{
    private Collection collection;
    private int index = 0;
    private int amount;
    public Iterator(Collection collection){
        this.collection=collection;
        this.amount = collection.getSize();
    }
    boolean hasNext() {
        return index<amount;
    }
    public Object getNext(){
      if (hasNext()){
          index++;
          return collection.myCollection.get(index);
      } else
          return null;
    }
    void remove(){
        collection.myCollection.remove(index);
    }
}
class IteratorRev{
    private Collection collection;
    private int index;
    private int amount;
    public IteratorRev(Collection collection){
        this.collection=collection;
        this.amount = collection.getSize();
        this.index = collection.getSize();
    }
    boolean hasNext() {
        return index>0;
    }
    public Object getNext(){
        if (hasNext()){
            index--;
            return collection.myCollection.get(index);
        } else
            return null;
    }
    void remove(){
        collection.myCollection.remove(index);
    }
}
