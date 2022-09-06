import DAO.CalorieIntakeRepository;
import DAO.GoalsRepository;
import DAO.WorkoutPlanRepository;
import Model.CalorieIntake;
import Model.Goals;
import Model.workoutPlan;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class AppMenu {

    public static void main(String[] args) throws SQLException {


        String userLogin;
        Scanner in = new Scanner(System.in);
        boolean loginAppMenu = true;
        System.out.println("Welcome to GetFit, Sign in:");
        while (loginAppMenu) {
            System.out.println("Enter Username");
            userLogin = in.nextLine();
            if (userLogin == ("TaniyaTrinidad22")) ;
            //loginAppMenu = false;
            System.out.println("Enter Password:");
            userLogin = in.nextLine();
            if (userLogin == ("PASSWORD123")) ;
            loginAppMenu = false;
        }
        //System.out.println("Welcome Back Taniya!");

        ArrayList<String> workouts = new ArrayList<>();
        ArrayList<String> calories = new ArrayList<>();
        boolean visitingGetFitMenu = true;

        String userInput;
        String goalInput = "";
        while (visitingGetFitMenu) {
            System.out.println("WELCOME BACK TANIYA, what would you like to monitor? (Workout Plan, Fitness Goals, Calorie intake)");
            userInput = in.nextLine().toLowerCase();
            if (userInput.equals("workout plan")) {
                //visitingGetFitMenu = false;
                WorkoutPlanRepository Workout = new WorkoutPlanRepository();
                ArrayList<workoutPlan> Plan = Workout.checkWorkoutPlanRepository();
                System.out.println(Plan.toString());
                //String workoutPlan = in.nextLine();

            }
            //while (visitingGetFitMenu)
            else if (userInput.equals("fitness goals")){
                System.out.println("Congratulations on conquering your 3 mile run goal, keep crushing it Taniya");
                System.out.println("YOU HAVE NO MORE CURRENT GOALS, WOULD YOU LIKE TO ADD 3 NEW GOALS? (YES, NOT TODAY?)");
                userInput = in.nextLine();
                if (userInput.equals("YES")) {
                    System.out.println("Input first goal:");
                    goalInput = in.nextLine();
                    if (goalInput.equals("I would like to gain 10lbs by the end of September")) ;
                    System.out.println("Input second goal:");
                    goalInput = in.nextLine();
                    if (goalInput.equals("I wanna maintain a strict diet plan, 3 meals a day, no sugar, no carbs for the entire month"))
                        ;
                    System.out.println("Input third goal");
                    goalInput = in.nextLine();
                    if (goalInput.equals("Get to 5 miles by October")) ;
                    System.out.println("Go to Plan");
                    userInput = in.nextLine();
                    if (userInput.equals("GO")) {
                        GoalsRepository Goals = new GoalsRepository();
                        ArrayList<Goals> Log = Goals.checkGoalsRepository();
                        System.out.println(Log.toString());
                    }
                }
            }
            //visitingGetFitMenu = false;
            {
                if (userInput.equals("calorie intake")) {
                    System.out.println("Calories burned: 365/600");
                    CalorieIntakeRepository Fit = new CalorieIntakeRepository();
                    ArrayList<CalorieIntake> Intake = Fit.checkCaloriesIntakeRepository();
                    System.out.println(Intake.toString());
                }
            }
        }
    }
}
