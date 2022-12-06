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
    switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
              thisAmount += 2;
           if (each.getDaysRented() > 2)
              thisAmount += (each.getDaysRented() - 2) * 1.5;
           break;
        case Movie.NEW_RELEASE:
           thisAmount += each.getDaysRented() * 3;
           break;
        case Movie.CHILDRENS:
           thisAmount += 1.5;
           if (each.getDaysRented() > 3)
              thisAmount += (each.getDaysRented() - 3) * 1.5;
            break;
}
  }

public int getFrequentRenterPoints(int daysRented){
    int result = 0;
    Enumeration rentals = _rentals.elements();
    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        result += each.getFrequentRenterPoints();
}
}

}