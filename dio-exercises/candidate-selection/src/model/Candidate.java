package model;

public class Candidate {
    String name;
    Double salary;
    Status available;

    public Candidate(String name, Double salary, Status available) {
        this.name = name;
        this.salary = salary;
        this.available = available;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Status getAvailable() {
        return available;
    }
    public void setAvailable(Status available) {
        this.available = available;
    }
    public String getCandStatus() {
        return this.available.getState();
    }
    
    public String checkCandidate() {
        double wishedSalary = this.getSalary();
        if(2000.0 > wishedSalary) {
            return "Call to the candidate!";
        } else if(2000.0 == wishedSalary) {
            return "Wait other candidates...";
        } else {
            return "Waiting the result of the other candidates to call with counter-offer.";
        }
    }
    
    @Override
    public String toString() {
        return "NAME: "+name+" - SALARY: "+salary+"- AVAILABILITY: "+available.getState()+"\n";
    }
}