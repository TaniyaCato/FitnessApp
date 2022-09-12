package Service;

import DAO.WorkoutPlanRepository;
import Model.workoutPlan;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class WorkoutPlanService {
    WorkoutPlanRepository wr;
    CalorieIntakeService cs;

    Connection conn = ConnectionUtil.getConnection();

    public WorkoutPlanService() throws SQLException {
        cs = new CalorieIntakeService();
        wr = new WorkoutPlanRepository();
    }

    public void WorkoutPlanRepository(CalorieIntakeService cs, WorkoutPlanRepository wr) throws SQLException {
        this.cs = cs;
        this.wr = wr;
    }

    public ArrayList<workoutPlan> checkWorkoutPlanRepository() throws SQLException {
        return wr.checkWorkoutPlanRepository();
    }

    public ArrayList<workoutPlan> checkAllWorkoutByWorkout_day(String workout_day){
        return wr.checkAllWorkoutByWorkout_day(workout_day);
    }


}
