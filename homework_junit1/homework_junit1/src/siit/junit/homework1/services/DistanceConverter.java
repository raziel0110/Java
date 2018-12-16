package siit.junit.homework1.services;

import siit.junit.homework1.Exeptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class DistanceConverter {
    private List<Distance> list = new ArrayList<>();
    private int total;

    public Distance obj1 = new Distance(3,"cm");
    public Distance obj2 = new Distance(10,"mm");

    public DistanceConverter() {
    }

//    public List<Distance> getList() {
//        return list;
//    }
//
//    public void setList(List<Distance> list) {
//        this.list = list;
//    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getListSize(){ return list.size();}



    public void operationWithDistances(int dist1,int dist2) throws ValidationException {

       obj1.convertMeter();
       obj2.convertMeter();



        total = obj1.getDinstance() + obj2.getDinstance();
        System.out.println(getTotal());



    }


}
