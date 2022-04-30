package sg.np.edu.mad.messagegroup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

//this java file controls the main_activity.xml
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //Try changing property from 'true' to 'false'
        User user1 = new User("Li Zhe Yun", "I am a Year 2 student studying the MAD module", 1000, false);
        Button b = findViewById(R.id.button_no1); //get the targetButton

        Random r = new Random();
        int num = Math.abs(r.nextInt()); //random integer generated here
        TextView tv = findViewById(R.id.text_view_no1);
        tv.setText("MAD " + num);

        if (!user1.followed){ //if the user did not follow....
            b.setText("FOLLOW");
        }
        else{
            b.setText("UNFOLLOW");
        }

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!user1.followed){ //property equates to false when
                    b.setText("UNFOLLOW");
                    //make the overlay screen appear...
                    user1.followed = true;
                    //Toast.makeText( );
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
                else{
                    b.setText("FOLLOW");
                    user1.followed = false;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //CHALLENGE
        //create another event listener for the message button....

        Button messageButton = findViewById(R.id.button_no2);
        messageButton.setOnClickListener(function -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //Where do you want to go?
            intent.setClassName("sg.np.edu.mad.messagegroup", "sg.np.edu.mad.messagegroup.ChallengeMessageGroup");
            startActivity(intent);
        });
    }
}
