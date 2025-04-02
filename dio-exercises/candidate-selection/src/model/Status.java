package model;

public class Status {

    public String[] res = {"IMEDIATO","EM 15 DIAS","EM 1 MES","INDISPONÍVEL"};
    public int enter;

    public Status() {}

    public Status(int enter) {
        this.enter = enter;
    }

    public int getEnter() {
        return enter;
    }
    public void setEnter(int enter) {
        this.enter = enter;
    }

    public String getState() {
        return res[enter].toString();
    }
    
}
