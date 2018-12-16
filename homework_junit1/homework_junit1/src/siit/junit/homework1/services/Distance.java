package siit.junit.homework1.services;

import siit.junit.homework1.Exeptions.ValidationException;

public class Distance {

    private int dinstance;
    private String type;

    public Distance(int dinstance,String type){
        this.dinstance = dinstance;
        this.type = type;
    }

    public int getDinstance() {
        return dinstance;
    }

    public void setDinstance(int dinstance) {
        this.dinstance = dinstance;
    }

    public String getType() throws ValidationException {
        if( type.equalsIgnoreCase("km") || type.equalsIgnoreCase("m") || type.equalsIgnoreCase("cm")|| type.equalsIgnoreCase("mm")) {
            return type;
        } else {
            throw new ValidationException("Type does not match!");
        }

    }

    public void setType(String type){
           this.type = type;
    }


    public void convertMeter() throws ValidationException{
        switch (this.type){
            case "km" :
                this.dinstance = this.dinstance * 1000000;
                setDinstance(this.dinstance);
                setType("mm");
                break;
            case "m" :
                this.dinstance = this.dinstance * 1000;
                setDinstance(this.dinstance);
                setType("mm");
                break;
            case "cm":
                this.dinstance = this.dinstance * 10;
                setDinstance(this.dinstance);
                setType("mm");
                break;
            case "mm":
                this.dinstance = this.dinstance;
                setDinstance(this.dinstance);
                setType("mm");
                break;
                default: throw new ValidationException("Something went wrong");
        }
    }


}
