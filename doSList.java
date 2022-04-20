/*
 * do something with list kind of relate to shopping list.
 * 
 * @author Lengfan Yan
 * @version "Make-Up" Assignment: MyList
 */ 

class doSList implements SimplestList {
  //field
  Object[] a;
  int count = 0;
  /*
   * constructor
   * @param x the max number list hold
   */ 
  public doSList(int x){
    if (x< 0){
       throw new IllegalArgumentException("you can give negative number for this list");
    }
    a = new Object[x];
  }
  
  /*
   * add thing in list
   * @param o the thing need to add in to list
   */ 
  public void add(Object o){
    a[count++] = o;
  } 
  
  /*
   * get item
   * @param index  the position in list
   */ 
  public Object get(int index){
    Object g;
    g = a[index];
    return g;
  }
  
  // give back count - the number of item added to list
  public int size(){
    return count;
  }
  
  // the length of list
  public int capacity(){
    int c = a.length;
    return c;
  }
}