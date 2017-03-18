package net.redfrench.workoutadviser;

import java.util.ArrayList;
import java.util.List;

public class WorkoutPlans {

    List<String> getWorkout (String workoutType) {

        List<String> workout = new ArrayList<>();

        if (workoutType.equals("Chest")) {
            workout.add("Bench Press");
            workout.add("Cable Fly");
        }
        else if (workoutType.equals("Triceps")) {
            workout.add("Triceps Extensions");
            workout.add("Triceps Pushdowns");
        }
        else if (workoutType.equals("Shoulders")) {
            workout.add("Shoulder Press");
        }
        else if (workoutType.equals("Biceps")) {
            workout.add("Biceps Curls");
        }

        return workout;
    }
}
