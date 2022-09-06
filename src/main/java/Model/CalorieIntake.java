package Model;

public class CalorieIntake {
    public int calorieID;
    public String genre;
    public String food;

    public CalorieIntake(String genre, String food, String calorieID) {
        this.calorieID = Integer.parseInt(calorieID);
        this.genre = genre;
        this.food = food;
    }

    @Override
    public String toString() {
        return "CalorieIntake{" +
                "calorieID=" + calorieID +
                ", genre='" + genre + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    public int getCalorieID() {
        return calorieID;
    }

    public void setCalorieID(int calorieID) {
        this.calorieID = calorieID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

}