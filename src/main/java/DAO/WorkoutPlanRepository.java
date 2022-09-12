package DAO;


import Model.workoutPlan;
import Util.ConnectionUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;
import java.util.ArrayList;

public class WorkoutPlanRepository {
    Connection conn;

    public WorkoutPlanRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }

    public ArrayList<workoutPlan> checkWorkoutPlanRepository() throws SQLException {
        ArrayList<workoutPlan> workoutPlans = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * From Workout");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                workoutPlan loadedWorkoutPlan = new workoutPlan(rs.getString("name"), rs.getString("workout_day"));
                workoutPlans.add(loadedWorkoutPlan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return workoutPlans;
    }


    public ArrayList<workoutPlan> getWorkout() throws SQLException {
        ArrayList<workoutPlan> workoutPlans = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public ArrayList<workoutPlan> getWorkout_day() {
        return null;
    }


    public ArrayList<workoutPlan> checkAllWorkoutByWorkout_day(String workout_day) {
        ArrayList<workoutPlan> workoutPlans = new ArrayList<>();
        try{
            PreparedStatement statement = conn.prepareStatement("Select * From Workout where workout_day = ?");
            statement.setString(1, workout_day);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                workoutPlan loadedWorkoutPlan = new workoutPlan(rs.getString("name"), rs.getString("workout_day"));
                workoutPlans.add(loadedWorkoutPlan);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return workoutPlans;
        }
    }
