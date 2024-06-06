package A4_Flights;
import static A4_Flights.Common.AVERAGE_PERSON_WEIGHT;
/**
 * Flight - a nonstop flight departing from the home airport
 * Flight is the parent class for Training, Cargo, and Passenger Flights
 */
public abstract class Flight implements PolicyRules{

    // TODO-A1 - Complete this class, using javadocs as a reference
    
    //declaration of fields
    private String dayOfWeek;
    private int departureTime;
    private Location destination;
    private String flightNumber;
    private int numCrew;
    
     @Override
    public boolean checkCrew() {
        return numCrew >= Common.MINIMUM_CREW;
    }

    @Override
    public boolean checkPassengers() {
        return true;
    }

    @Override
    public boolean checkTime() {
        return true;
    }

    public boolean checkWeight() {
        return true;
    }
    
    //main class constructor
    public Flight(String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
       this.flightNumber = flightNumber;
       this.dayOfWeek = dayOfWeek;
       this.departureTime = departureTime;
       this.destination = destination;
       this.numCrew = numCrew;
    }
    
    public int calculateWeight() {
        int weight = getNumCrew() * AVERAGE_PERSON_WEIGHT;
        return weight;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public Location getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    abstract String getFlightType();

    public int getNumCrew() {
        return numCrew;
    }

    public String toDisplayReport() {
        //returns class data as formatted in Expected Results
        String out = getFlightType() + "=" + getFlightNumber() + ", Day=" + getDayOfWeek() + ", Time=" + getDepartureTime() + "\n\t" + "Destination: " + getDestination().toDisplayFormat() + "\n\t" + "Number of Crew: " + getNumCrew()
                + "\n\t" + "Total Weight: " + calculateWeight();
        return out;
    }

    public String toArchiveFormat() {
        //returns class data as formatted in text file
        String out = getFlightType() + ", " + getFlightNumber() + ", " + getDayOfWeek() + ", " + getDepartureTime()
                + ", " + getDestination().getLocationCode() + ", " + getNumCrew();
        return out;
    }

} // end class Flight
