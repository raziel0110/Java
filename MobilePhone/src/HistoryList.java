public class HistoryList {

    private String number;

    public HistoryList(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "HistoryList{" +
                "number='" + number + '\'' +
                '}';
    }
}
