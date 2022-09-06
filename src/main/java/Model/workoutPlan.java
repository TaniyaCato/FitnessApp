package Model;


public class workoutPlan {
    public String name;
    public String workout_day;






    @Override
    public String toString() {
        return "WorkoutPlan{" +
                "workout='" + name + '\'' +
                ", workout_day='" + workout_day + '\'' +
                '}';
    }

    public String getWorkout() {
        return name;
    }

    public void setWorkout(String workout) {
        this.name = workout;
    }

    public String getWorkout_day() {
        return workout_day;
    }

    public void setWorkout_day(String workout_day) {
        this.workout_day = workout_day;
    }

    public workoutPlan(String name, String work_day) {
        this.name = name;
        this.workout_day = work_day;


    }
}
