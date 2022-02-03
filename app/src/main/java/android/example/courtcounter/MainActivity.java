package android.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int scoreTeamA=0;
    public int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when +3 button is clicked.
     */
    public void plusThreeMethodA(View view){
     // scoreTeamA=3;
      scoreTeamA+=3;
      displayForTeamA(scoreTeamA);
    }


    /**
     * This method is called when +2 button is clicked.
     */
    public void plusTwoMethodA(View view){
        //scoreTeamA=2;
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }


    /**
     * This method is called when free throw button is clicked.
     */
    public void freeThrowMethodA(View view){
        //scoreTeamA=1;
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }


    /**
     * This method is called when +3 button is clicked.
     */
    public void plusThreeMethodB(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }


    /**
     * This method is called when +2 button is clicked.
     */
    public void plusTwoMethodB(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }


    /**
     * This method is called when free throw button is clicked.
     */
    public void freeThrowMethodB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}