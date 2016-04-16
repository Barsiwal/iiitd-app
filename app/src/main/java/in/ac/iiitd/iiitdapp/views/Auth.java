package in.ac.iiitd.iiitdapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.ac.iiitd.iiitdapp.R;

public class Auth extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        button=(Button) findViewById(R.id.Skip_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Auth.this, HomeScreen.class);
                startActivity(i);
                finish();
            }
        });

    }
}
