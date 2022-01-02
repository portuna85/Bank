package ch07.sec03;

public class People {
    public String name;
    protected String ssn;
    String phoneNo;
    private String job;

    public People() {
    }

    public People(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}