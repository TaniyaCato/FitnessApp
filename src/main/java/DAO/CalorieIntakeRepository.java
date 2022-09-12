package DAO;

import Model.CalorieIntake;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CalorieIntakeRepository {
    Connection conn;
    public CalorieIntakeRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }
        public ArrayList<CalorieIntake> checkCaloriesIntakeRepository() throws SQLException {
        ArrayList<CalorieIntake> CalorieIntake = new ArrayList<>();
        try{
            PreparedStatement statement = conn.prepareStatement("Select * From Fit");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                CalorieIntake loadedCalorieIntake = new CalorieIntake(rs.getString("genre"),rs.getString("food"), rs.getString("caloriesID"));
                CalorieIntake.add(loadedCalorieIntake);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return CalorieIntake;
        }

    public ArrayList<CalorieIntake> checkCaloriesByFoodGenre(String genre) {
        ArrayList<CalorieIntake> CalorieIntake = new ArrayList<>();
        try{
            PreparedStatement statement = conn.prepareStatement("Select * From Fit where genre = ?");
            statement.setString(1,genre);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                CalorieIntake loadedCalorieIntake = new CalorieIntake(rs.getString("genre"),rs.getString("food"), rs.getString("caloriesID"));
                CalorieIntake.add(loadedCalorieIntake);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return CalorieIntake;
    }
    }


