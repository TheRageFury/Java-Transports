package transports.managers;


import transports.domain_entities.City;
import java.util.Collection;

/**
 * This ADT is used to represent a manager for cities available
 * @see transports.domain_entities.City
 */


public class CitiesManager {
   private Collection<City> container;


    /**
     * Creates a new instance of a manager of cities
     */
    public CitiesManager(){

    }

    /**
     * @param city The city to search in this manager
     * @return True if is in this manager, false otherwise
     */
    private boolean existsCity(City city){
        return false;
    }

    /**
     * Takes care of adding cities in this manager
     * @param city Represents a city object, already existing, to be added
     */
    /*
        (EXCEPTIONAL CASES)
            -city passed is null
            -or is already in
    */
    public void insert(City city){

    }


    /**
     * Takes care of removing the city given
     * @param city City object that will be removed from this manager
     */
    /*
        (EXCEPTIONAL CASES)
            -City is null
            -City doesn't exist
    */

    public void remove(City city){

    }

}
