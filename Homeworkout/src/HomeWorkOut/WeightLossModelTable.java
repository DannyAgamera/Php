package HomeWorkOut;

/**
 *
 * @author Danny Agamera
 */
public class WeightLossModelTable {
    private String workout;
    private String reps;
    private String  sets;

    public WeightLossModelTable() {
        this.workout = "";
        this.reps = "";
        this.sets = "";
    }
    
    public WeightLossModelTable(String workout, String reps, String sets) {
        this.workout = workout;
        this.reps = reps;
        this.sets = sets;
    }

    public String getWorkout() {
        return workout;
    }

    public void setWorkout(String workout) {
        this.workout = workout;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }
    
}
