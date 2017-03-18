package net.redfrench.workoutadviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class FindWorkoutActivity extends AppCompatActivity {

    private WorkoutPlans workoutPlans = new WorkoutPlans();  // create object of WorkoutPlans class (which holds the logic)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }

    public void onClickFindWorkout(View view) {

        // element references
        TextView workouts = (TextView) findViewById(R.id.workoutDetails);
        Spinner workoutType = (Spinner) findViewById(R.id.workoutTypeSpinner);

        String workout = String.valueOf(workoutType.getSelectedItem());  // get Spinner selection

        List<String> workoutList = workoutPlans.getWorkout(workout);  // gets workout for chosen body part

        StringBuilder workoutFormatted = new StringBuilder();

        for (String work : workoutList) {
            workoutFormatted.append(work).append('\n');
        }

        workouts.setText(workoutFormatted);

    }

}
