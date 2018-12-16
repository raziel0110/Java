package siit.junit.homework1.services;

import org.junit.jupiter.api.Test;
import siit.junit.homework1.Exeptions.ValidationException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceTest {

    private final Distance distance = new Distance(3,"cm");


    @Test
    void getDinstance() throws ValidationException {
        assertEquals(distance.getDinstance(),3);
    }

    @Test
    void getType() throws ValidationException{
        assertEquals(distance.getType(),"km");
    }

   @Test
    void convertMeter() throws ValidationException{

       distance.convertMeter();
        assertEquals(3000000,distance.getDinstance());

   }

}