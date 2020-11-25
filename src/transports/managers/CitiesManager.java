package transports.managers;


import transports.domain_entities.City;
import transports.domain_entities.Good;
import transports.enumerators.CitiesPosition;
import transports.exceptions.InvalidManagerInput

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * This ADT is used to represent a manager for cities available
 * manage some cities in according to a geographical position of them. center/north/south
 * @see transports.domain_entities.City
 */


public class CitiesManager {
   private Collection<City> container;
   private CitiesPosition position


    /**
     * Creates a new instance of a manager of cities that are in the same geographical position
     */
    public CitiesManager(CitiesPosition position){

    }

    /**
     * @param city The city to search in this manager
     * @return True if is in this manager, false otherwise
     */
    private boolean existsCity(City city){
    }

    /**
     * Takes care of adding cities in this manager
     * @param city Represents a city object, already existing, to be added
     * @throws InvalidManagerInput   city passed is null or is already in
     */

    public void insert(City city){

    }


    /**
     * Takes care of removing the city given
     * @param city City object that will be removed from this manager
     * @throws InvalidManagerInput   city passed is null or doesn't exist
     */

    public void remove(City city){

    }

 /**
  *it is based on the private  iterator method
  * @param n is the number of cities you want
  * @return arrayList that contain n cities you want
  *
  */
  public ArrayList<City> getCitiesSupported(int n){

 }

 /**
  * @return a standard iterator over the good of this collection
  */
 private Iterator<City> iterator(){
  Iterator res= new Iterator(this.container);
  return res;

 }

}
