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

        RelativeLayout rl1 = findViewById(R.id.MainContainer);
        TextView tl1 = findViewById(R.id.firstImage);

        //apply the appropriate event listener.
        b1.setOnClickListener(function -> {
            rl1.setVisibility(function.GONE);
            tl1.setVisibility(function.VISIBLE);
        });

        b2.setOnClickListener(function -> {
            tl1.setVisibility(function.GONE);
            rl1.setVisibility(function.VISIBLE);
        });
    }
}
