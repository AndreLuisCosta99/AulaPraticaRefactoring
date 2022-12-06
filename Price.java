public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
    }
     }

    public double getCharge(int daysRented) {
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


 }