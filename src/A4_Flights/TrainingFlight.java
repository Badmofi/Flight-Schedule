package A4_Flights;

/**
 * A Training Flight has no passengers, and no cargo
 */
public class TrainingFlight extends Flight {

    // TODO-A4 - Complete this class, using javadocs as a reference
    public TrainingFlight(String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
    }

    @Override
    public boolean checkTime() {
        return (super.getDepartureTime() >= Common.EARLIEST_DEPARTURE && super.getDepartureTime() <= Common.LATEST_DEPARTURE);

    }
    
    @Override
    public boolean checkWeight() {
        return (calculateWeight() <= Common.MAXIMUM_WEIGHT);
    }

    @Override
    public String getFlightType() {
        return "Training";
    }

    @Override
    public String toDisplayReport() {
        return super.toDisplayReport();
    }

} // end class TrainingFlight
