package Service;

import DAO.CalorieIntakeRepository;
import Model.CalorieIntake;

import java.sql.SQLException;
import java.util.ArrayList;

public class CalorieIntakeService {

    CalorieIntakeRepository cr;
    public CalorieIntakeService() throws SQLException {
        cr = new CalorieIntakeRepository();
    }

    public CalorieIntakeService(CalorieIntakeRepository cr) {
        this.cr = cr;
    }

    public String getWorkoutFromWorkout_day(String workout_day) {
        return workout_day;
    }


    public ArrayList<CalorieIntake> checkCaloriesIntakeRepository() throws SQLException {
        return cr.checkCaloriesIntakeRepository();
    }
    public ArrayList<CalorieIntake> checkCaloriesByFoodGenre(String genre) throws SQLException {
        return cr.checkCaloriesByFoodGenre(genre);
    }
}
