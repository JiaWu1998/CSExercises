public class Book{
  private String title;
  private String author;
  private ISBN isbnObj;
  private String publisher;
  private String category;
  private Double price;
  private int numInStock;

  public Book(){
    title = "";
    author = "";
    isbnObj = new ISBN();
    publisher = "";
    category = "";
    price = 0.0;
    numInStock = 0;
  }
  public Book(String tit, String aut, ISBN isbn, String pub, String cat, Double pri, int num){
    title = tit;
    author = aut;
    isbnObj = isbn;
    publisher = pub;
    category = cat;
    price = pri;
    numInStock = num;
  }
  public void setTitle(String titl){
    title = titl;
  }
  public void setAuthor(String auth){
    author = auth;
  }
  public void setISBN(ISBN isbm){
    isbnObj = isbm;
  }
  public void setPublisher(String publi){
    publisher = publi;
  }
  public void setCategory(String cate){
    category = cate;
  }
  public void setPrice(Double pric){
    price = pric;
  }
  public void setNumInStock(int numI){
    numInStock = numI;
  }
  public String getTitle(){
    String copy = title;
    return copy;
  }
  public String getAuthor(){
    String copy = author;
    return copy;
  }
  public ISBN getISBN(){
    ISBN copy = isbnObj;
    return copy;
  }
  public String setPublisher(){
    String copy = publisher;
    return copy;
  }
  public String setCategory(){
    String copy = category;
    return copy;
  }
  public Double setPrice(){
    Double copy = price;
    return copy;
  }
  public int setNumInStock(){
    int copy = numInStock;
    return copy;
  }
  public String toString(){
    return "Title: " + title + " Author: " + author + " ISBN: " + isbnObj + " Publisher: " + publisher + " Category: " + category + " Price: " + price + " Stock: " + numInStock;
  }

}
