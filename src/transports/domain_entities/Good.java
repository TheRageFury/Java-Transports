package transports.domain_entities;


import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;

/**
 * This ADT represents a good supported for transports
 * @see GoodType
 * @see UnitMeasure
 */
public class Good {
    private String contentName;
    private GoodType goodType;
    private UnitMeasure unitMeasure;

    /**
     * @param contentName Represents name of the good
     * @param goodType Represents type of the good
     * @param unitMeasure Represents the measure unit for the quantity of the good
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -Good type and unit of measure are incompatible
    */
    public Good(String contentName, GoodType goodType, UnitMeasure unitMeasure){
        /*this.contentName = contentName;
        this.goodType = goodType;
        boolean isUnitValid = false;


        */

    }

    public Good(GoodType goodType) {
        this.goodType = goodType;
    }

    public UnitMeasure getUnitMeasure() {
        return unitMeasure;
    }

    public String getContentName() {
        return contentName;
    }

    public GoodType getGoodType() {
        return goodType;
    }

    /**
     *
     * @param goodType
     * @param unitMeasure
     * @return
     */
    private boolean areTypeAndUnitValid(GoodType goodType, UnitMeasure unitMeasure){
        boolean isUnitValid = true;
        /*switch (unitMeasure){
            case GR:
            case KG:
                if(goodType==GoodType.SOLID||goodType==GoodType.WEED){
                    isUnitValid= true;
                }else{
                    isUnitValid= false;
                }
                break;
            case L:
            case MC:
                if(goodType==GoodType.LIQUID||goodType==GoodType.GASEOUS){
                    isUnitValid= true;
                }else{
                    isUnitValid= false;
                }
                break;
        }
        if(isUnitValid){
            this.unitMeasure = unitMeasure;

        }else{
            //la throws verrà gestita in seguito da un try_catch e nel caso verrà richiamato un unità di misura di default
            throw new InvalidMeasureException(this.goodType,this.unitMeasure);
        }*/
        return false;
    }

    //TODO: Scrivere il contratto di areTypeAndUnitValid
}