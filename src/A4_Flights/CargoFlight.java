package A4_Flights;
import static A4_Flights.Common.AVERAGE_PERSON_WEIGHT;
/**
 * Cargo inherits from Flight
 * Cargo flights have crew, cargo, but no passengers
 */
public class CargoFlight extends Flight{

    // TODO-A2 - Complete this class, using javadocs as a reference
    private int cargoWeight;
    
    @Override
    public boolean checkWeight() {
        return (calculateWeight() <= Common.MAXIMUM_WEIGHT);
    }

    //constructor
    public CargoFlight(String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew, int cargoWeight) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew); //call Flight constructor
        this.cargoWeight = cargoWeight;
    }

    public int calculateWeight() {
        int weight = super.calculateWeight() + (int) getCargoWeight();
        return weight;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }
    
    @Override
    public String getFlightType() {
        String cargo = "Cargo";
        return cargo;
    }

    @Override
    public String toDisplayReport() {
        return super.toDisplayReport();
    }

    @Override
    public String toArchiveFormat() {
        return super.toArchiveFormat() + ", " + (int) getCargoWeight();
    }
    
} // end class CargoFlight
