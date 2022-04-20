
public class test{
  
  public static void main(String[] args)
  {
    Library lib = new Library();
    LibraryItem item1 = new DVD("Monsters Inc.", "animated", "1990", "Joe", 110);
    lib.addItem(item1);
    LibraryItem item2 = new Book("Sphere", "sci-fi", "1990", "Mike", 340);
    lib.addItem(item2);
    Patron p1 = new Patron("12345", "bob");
    lib.addMember(p1);
    lib.checkOutItem(p1, item1);
    lib.incrementCurrentDate();
    lib.checkOutItem(p1, item2);
    for (int i=0; i<25; i++)
      lib.incrementCurrentDate();
    System.out.println(p1.getFineAmount());
    Patron p2 = new Patron("23454", "jill");
    lib.addMember(p2);
    Patron p3 = new Patron("65463", "emma");
    lib.addMember(p3);
    lib.requestItem(p2, item1);
    lib.requestItem(p3, item1);
    lib.returnItem(p1, item1);
    lib.checkOutItem(p3, item1);
    lib.checkOutItem(p2, item1);
    for (int i=0; i<22; i++)
      lib.incrementCurrentDate();
    System.out.println(p1.getFineAmount());
    System.out.println(p2.getFineAmount());
    System.out.println(item1.getCheckedOutBy().getName());
  }
}