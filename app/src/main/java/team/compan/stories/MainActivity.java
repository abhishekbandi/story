package team.compan.stories;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.navigation_home:
                    // the same home activity is opened when clicked on home button
                    Intent myintent = new Intent(MainActivity.this,
                            MainActivity.class);
                    startActivity(myintent);
                    mTextMessage.setText(R.string.title_home);
                    return true;


                case R.id.navigation_dashboard:
                    // the compan activity is opened when clicked on compan button
                    Intent compan = new Intent(MainActivity.this,
                            compan.class);
                    startActivity(compan);
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;


                case R.id.navigation_notifications:
                    // the feedback activity is opened when clicked on feedback button
                    Intent team = new Intent(MainActivity.this,
                            feedback.class);
                    startActivity(team);
                    mTextMessage.setText(R.string.title_notifications);
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//===================================== The one click listener for first story name to open new activity =============================================


        // Find the View that shows the story_one category
        TextView story_one = (TextView) findViewById(R.id.story_one);

        // Set a click listener on that View
        story_one.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_one category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_oneActivity}
                Intent story_oneIntent = new Intent(MainActivity.this, story_one.class);

                // Start the new activity
                startActivity(story_oneIntent);
            }
        });


//===================================== The one click listener for second story name to open new  activity ===========================================


        // Find the View that shows the story_two category
        TextView story_two = (TextView) findViewById(R.id.story_two);

        // Set a click listener on that View
        story_two.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_two category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_twoActivity}
                Intent story_twoIntent = new Intent(MainActivity.this, story_two.class);

                // Start the new activity
                startActivity(story_twoIntent);
            }
        });


//===================================== The one click listener for third story name to open new activity =============================================

        // Find the View that shows the story_three category
        TextView story_three = (TextView) findViewById(R.id.story_three);

        // Set a click listener on that View
        story_three.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_three category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_threeActivity}
                Intent story_threeIntent = new Intent(MainActivity.this, story_three.class);

                // Start the new activity
                startActivity(story_threeIntent);
            }
        });


//===================================== The one click listener for four story name to open new activity =============================================


        // Find the View that shows the story_four category
        TextView story_four = (TextView) findViewById(R.id.story_four);

        // Set a click listener on that View
        story_four.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_four category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_fourActivity}
                Intent story_fourIntent = new Intent(MainActivity.this, story_four.class);

                // Start the new activity
                startActivity(story_fourIntent);
            }
        });


//===================================== The one click listener for five story name to open new activity =============================================


        // Find the View that shows the story_five category
        TextView story_five = (TextView) findViewById(R.id.story_five);

        // Set a click listener on that View
        story_five.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_five category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_fiveActivity}
                Intent story_fiveIntent = new Intent(MainActivity.this, story_five.class);

                // Start the new activity
                startActivity(story_fiveIntent);
            }
        });


//===================================== The one click listener for six story name to open new activity =============================================


        // Find the View that shows the story_six category
        TextView story_six = (TextView) findViewById(R.id.story_six);

        // Set a click listener on that View
        story_six.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_six category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_sixActivity}
                Intent story_sixIntent = new Intent(MainActivity.this, story_six.class);

                // Start the new activity
                startActivity(story_sixIntent);
            }
        });


//===================================== The one click listener for seven story name to open new activity =============================================


        // Find the View that shows the story_seven category
        TextView story_seven = (TextView) findViewById(R.id.story_seven);

        // Set a click listener on that View
        story_seven.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_seven category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_sevenActivity}
                Intent story_sevenIntent = new Intent(MainActivity.this, story_seven.class);

                // Start the new activity
                startActivity(story_sevenIntent);
            }
        });


//===================================== The one click listener for eight story name to open new activity =============================================


        // Find the View that shows the story_eight category
        TextView story_eight = (TextView) findViewById(R.id.story_eight);

        // Set a click listener on that View
        story_eight.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_eight category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_eightActivity}
                Intent story_eightIntent = new Intent(MainActivity.this, story_eight.class);

                // Start the new activity
                startActivity(story_eightIntent);
            }
        });


//===================================== The one click listener for nine story name to open new activity =============================================


        // Find the View that shows the story_nine category
        TextView story_nine = (TextView) findViewById(R.id.story_nine);

        // Set a click listener on that View
        story_nine.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_nine category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_nineActivity}
                Intent story_nineIntent = new Intent(MainActivity.this, story_nine.class);

                // Start the new activity
                startActivity(story_nineIntent);
            }
        });


//===================================== The one click listener for ten story name to open new activity =============================================


        // Find the View that shows the story_ten category
        TextView story_ten = (TextView) findViewById(R.id.story_ten);

        // Set a click listener on that View
        story_ten.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the story_ten category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link story_tenActivity}
                Intent story_tenIntent = new Intent(MainActivity.this, story_ten.class);

                // Start the new activity
                startActivity(story_tenIntent);
            }
        });




//=====================================----------------------------------------end of code-------------------------------------=========================================



















































































    }

}
