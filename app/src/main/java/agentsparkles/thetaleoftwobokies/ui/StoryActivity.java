package agentsparkles.thetaleoftwobokies.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import agentsparkles.thetaleoftwobokies.R;
import agentsparkles.thetaleoftwobokies.model.Page;

public class StoryActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(getString(R.string.key_name));
        if(userName == null || userName.isEmpty()){
            userName = "Friend";
        }
        Log.d(TAG, userName);
    }
}
