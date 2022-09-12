import DAO.CalorieIntakeRepository;
import DAO.GoalsRepository;
import DAO.WorkoutPlanRepository;
import Model.CalorieIntake;
import Model.Goals;
import Model.workoutPlan;
import Service.CalorieIntakeService;
import Service.GoalsService;
import Service.WorkoutPlanService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class AppApi {

    public static void main(String[] args) throws SQLException {
        WorkoutPlanService ws = new WorkoutPlanService();
        WorkoutPlanRepository wr = new WorkoutPlanRepository();
        CalorieIntakeService cs = new CalorieIntakeService();
        GoalsService gs = new GoalsService();

        Javalin app = Javalin.create().start(9000);
        app.get("/Workout" , ctx -> {ctx.json(ws.checkWorkoutPlanRepository());});
        app.get("/Workout/workout_day/{day}", ctx ->
        {
            ctx.json(ws.checkAllWorkoutByWorkout_day(ctx.pathParam("day")));});
        app.get("/Fit" , ctx ->{ctx.json(cs.checkCaloriesIntakeRepository());});
        app.get("/Fit/genre/{genre}", ctx ->{
            ctx.json(cs.checkCaloriesByFoodGenre(ctx.pathParam("genre")));});

        app.get("/Goals", ctx ->{ctx.json(gs.checkGoalsRepository());});
        app.post("Goals", ctx ->{
            ObjectMapper mapper = new ObjectMapper();
            Goals requestGoals = mapper.readValue(ctx.body(), Goals.class);
            gs.addGoals(requestGoals.getGoals(), requestGoals.getCompleted(), requestGoals.getDate());

        });

    }

}