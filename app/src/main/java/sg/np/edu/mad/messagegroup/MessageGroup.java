package sg.np.edu.mad.messagegroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;

//this java file controls activity_message_group.xml
public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        ImageView background = findViewById(R.id.greenBackground);
        ImageView foreground = findViewById(R.id.androidFace);

        //build the error message
        AlertDialog.Builder b1 = new AlertDialog.Builder(sg.np.edu.mad.messagegroup.MessageGroup.this);

        //once we finished building the alert message...we will need to make it appear.
        b1.setMessage("MADness")
            .setTitle("Profile") //message that you want to display
            .setPositiveButton("VIEW",
                new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //what happens when the 'VIEW' button is clicked?
                    //view something
                    //launch the other app..
                    //get the name of the other package...
                    //then get the name of the class....
                    Intent cn = new Intent ();
                    cn.setAction(Intent.ACTION_VIEW);
                    cn.setClassName("sg.np.edu.mad.messagegroup", "sg.np.edu.mad.messagegroup.MainActivity");
                    startActivity(cn); //the page launches...
                }
            })
            .setNegativeButton("CANCEL",
                new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //what happens when the 'CANCEL' button is clicked?
                    //dismiss the message
                    dialogInterface.dismiss();
                }
            });
        //If either the background or the foreground is clicked upon
        background.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //display the pop-up....
                b1.show();
            }
        });
        foreground.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //display the pop-up
                b1.show();
            }
        });
    }
}