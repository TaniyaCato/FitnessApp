package Model;

import java.sql.Date;

public class Goals {
    public String goals;
    public String Completed;
    public Date date;


    @Override
    public String toString() {
        return "Goals{" +
                "goals='" + goals + '\'' +
                ", Completed='" + Completed + '\'' +
                ", date=" + date +
                '}';
    }

    public Goals(){

    }

    public Goals(String goals, String completed, Date date) {
        this.goals = goals;
        Completed = completed;
        this.date = date;
    }

    public String getGoals() {
        return goals;
    }


    public String getCompleted() {
        return Completed;
    }

    public Date getDate() {
        return date;
    }

}