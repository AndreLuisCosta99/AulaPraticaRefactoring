public class Movie {

    private Price _price;

    public Movie(String name, int priceCode) {
       _title = name;
       setPriceCode(priceCode);
    }
     
    public int getPriceCode() {
       return _price.getPriceCode();
    }
    
    public void setPriceCode(int arg) {
       switch (arg) {
          case REGULAR:
             _price = new RegularPrice();
             break;
          case CHILDRENS:
             _price = new ChildrensPrice();
             break;
          case NEW_RELEASE:
             _price = new NewReleasePrice();
             break;
          default:
             throw new IllegalArgumentException("Incorrect Price Code");
            }
        }
       
  public double getCharge(int daysRented){
    return _price.getCharge(daysRented);
  
  }

public int getFrequentRenterPoints(int daysRented){
    return _price.getFrequentRenterPoints(daysRented);
 
}

}