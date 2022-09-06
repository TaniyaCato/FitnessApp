package DAO;

import Model.Goals;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoalsRepository {

    Connection conn;

    public GoalsRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }

    public ArrayList<Goals> checkGoalsRepository() throws SQLException {
        ArrayList<Goals> Goals = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * From Goals");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Goals loadedGoals = new Goals(rs.getString("goals"), rs.getString("completed"), rs.getDate("goalsDate"));
                Goals.add(loadedGoals);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Goals;
    }

}
