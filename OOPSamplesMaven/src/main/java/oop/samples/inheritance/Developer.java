package oop.samples.inheritance;

public class Developer extends Empployee{
    String jobDescription;
    float bonus;

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    void devPositionInfo(){
        System.out.println("Job Description : " + jobDescription +
        "\nSalary : " + salary +
        "\nBonus : " + bonus +
        "\nTotal " + (salary + bonus));
    }
    
}