package Service;

import DAO.GoalsRepository;
import Model.Goals;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class GoalsService {
    GoalsRepository gr;
    CalorieIntakeService cs;
    WorkoutPlanService ws;

    Connection conn = ConnectionUtil.getConnection();

    public GoalsService() throws SQLException {
        cs = new CalorieIntakeService();
        ws = new WorkoutPlanService();
        gr = new GoalsRepository();
    }

    public void GoalsRepository(CalorieIntakeService cs, WorkoutPlanService ws) throws SQLException {
        this.cs = cs;
        this.ws = ws;
        this.gr = gr;
    }
    public ArrayList<Goals> checkGoalsRepository() throws SQLException {
        return gr.checkGoalsRepository();
    }

    public void addGoals(String goals,String completed, Date date) {
    }
}


