package sg.np.edu.mad.messagegroup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;

import javax.xml.parsers.ParserConfigurationException;

public class ChallengeMessageGroup extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge_message_group);

        //get the button from the view..
        Button b1 = findViewById(R.id.group1Button);
        Button b2 = findViewById(R.id.group2Button);

        //apply the appropriate event listener.
        b1.setOnClickListener(function -> {
            controller(new f1()); 
        });

        b2.setOnClickListener(function -> {
            controller(new f2()); 
        });
    }
    
    protected void controller(Fragment balloon){
        //now we will need to connect these 'balloons' to a 'pump controller' which will controls the inflation
        //and deflation of the 'balloons' separately...
        FragmentManager pumpMachine = getSupportFragmentManager();
        FragmentTransaction inflationProcess = pumpMachine.beginTransaction();
        inflationProcess.replace(R.id.toggling, balloon);
        inflationProcess.commit();
    }
}
