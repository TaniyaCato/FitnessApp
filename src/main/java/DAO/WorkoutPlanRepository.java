package DAO;


import Model.workoutPlan;
import Util.ConnectionUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkoutPlanRepository {
    Connection conn;

    public WorkoutPlanRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }

    public ArrayList<workoutPlan> checkWorkoutPlanRepository() throws SQLException {
        ArrayList<workoutPlan> workoutPlan = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * From Workout");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                workoutPlan loadedWorkoutPlan = new workoutPlan(rs.getString("name"), rs.getString("workout_day"));
                workoutPlan.add(loadedWorkoutPlan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return workoutPlan;
    }

    }

