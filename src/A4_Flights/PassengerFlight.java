package A4_Flights;
import static A4_Flights.Common.AVERAGE_PERSON_WEIGHT;
/**
 * A passenger flight has no cargo
 */
public class PassengerFlight extends Flight{

    // TODO-A3 - Complete this class, using javadocs as a reference
    private int numPassengers;

    @Override
    public boolean checkPassengers() {
        if (numPassengers >= Common.MINIMUM_PASSENGERS) {
            return true;
        }else
            return false;
    }
    
    @Override
    public boolean checkWeight() {
        return (calculateWeight() <= Common.MAXIMUM_WEIGHT);
    }

    public PassengerFlight(String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew, int numPassengers) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
        this.numPassengers = numPassengers;
    }

    @Override
    public int calculateWeight() {
        int weight = super.calculateWeight() + (numPassengers * AVERAGE_PERSON_WEIGHT);
        return weight;
    }

    @Override
    public String getFlightType() {
        return "Passenger";
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    @Override
    public String toDisplayReport() {
        return super.toDisplayReport();
    }

    @Override
    public String toArchiveFormat() {
        return super.toArchiveFormat() + ", " + numPassengers;
    }
    
} // end class PassengerFlight
