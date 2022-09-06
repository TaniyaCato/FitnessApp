package Service;

import DAO.CalorieIntakeRepository;
import DAO.WorkoutPlanRepository;

import java.sql.SQLException;

public class CalorieIntakeService {

    CalorieIntakeRepository cr;
    public CalorieIntakeService() throws SQLException {
        cr = new CalorieIntakeRepository();
    }

    public CalorieIntakeService(CalorieIntakeRepository cr) {
        this.cr = cr;
    }
}
