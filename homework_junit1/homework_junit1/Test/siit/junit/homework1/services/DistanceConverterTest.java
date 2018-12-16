package siit.junit.homework1.services;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import siit.junit.homework1.Exeptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DistanceConverterTest {
    public int expected;
    public DistanceConverter converter = new DistanceConverter();
    private List<Distance> list = new ArrayList<>();

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    public void setup(){

    }

    @Test
    void operationWithDistances() throws ValidationException {
       Distance dist1 = new Distance(3,"cm");
       Distance dist2 = new Distance(10,"mm");

       converter.operationWithDistances(dist1.getDinstance(),dist2.getDinstance());
        assertEquals(40,40);
    }
}