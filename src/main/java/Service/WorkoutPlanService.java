package Service;

import DAO.WorkoutPlanRepository;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;


public class WorkoutPlanService {
    WorkoutPlanRepository wr;
    CalorieIntakeService cs;

    Connection conn = ConnectionUtil.getConnection();

    public WorkoutPlanService() throws SQLException {
        cs = new CalorieIntakeService();
        wr = new WorkoutPlanRepository();
    }

    public void WorkoutPlanRepository(CalorieIntakeService cs, WorkoutPlanRepository wr) throws SQLException {

    }

}
