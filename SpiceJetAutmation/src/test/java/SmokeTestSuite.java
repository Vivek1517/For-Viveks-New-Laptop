import org.junit.Assert;
import org.junit.Test;

public class SmokeTestSuite extends BaseTest{
    static String currency = "USD";
    static int numberOfAdults = 6;
    static int numberOfChildren = 2;
    static String departureCity = "Goa ";
    static String destinationCity = "Mumbai ";
    static String month = "July";
    static String  departureDate = "6";
    static String returnDate = "12";

    @Test
    public void test1()
    {
    al.choosePassenger(numberOfAdults, numberOfChildren);
    Assert.assertTrue(al.verifyAdultPassengers());
    Assert.assertTrue(al.verifyChildPassengers());
    al.chooseMonthAndDateForReturnJourney(month,departureDate,returnDate);
    al.selectDestination(departureCity,destinationCity);
    al.chooseMethodOfPayment(currency);
    Assert.assertTrue(al.verifyPayment());

    }

//    public void chooseCurrency()
//    {
//    al.chooseMethodOfPayment(currency);
//    }
//    @Test
//    public void choosePassenger()
//    {
//    al.choosePassenger(numberOfAdults, numberOfChildren);
//    }
//    @Test
//    public void chooseDepartureAndDestinationCity()
//    {
//    al.selectDestination(departureCity,destinationCity);
//    }
//    @Test
//    public void chooseDateOfArrivalAndDeparture()
//    {
//    al.chooseMonthAndDateForReturnJourney(month,departureDate,returnDate);
//    }
}
