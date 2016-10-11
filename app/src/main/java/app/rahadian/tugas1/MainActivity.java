package app.rahadian.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinear = (Button) findViewById(R.id.buttonlinear);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLinear();
            }
        });

        Button btnRelative = (Button) findViewById(R.id.buttonRelative);
        btnRelative .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchRelative();
            }
        });

        Button btnTable = (Button) findViewById(R.id.buttonTable);
        btnTable .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchTable();
            }
        });
    }

    void launch(Class someClass)
    {
        Intent intent = new Intent(this, someClass);
        startActivity(intent);
    }

    void launchLinear()
    {
        launch(LinearActivity.class);
    }

    void launchRelative()
    {
        launch(RelativeActivity.class);
    }

    void launchTable()
    {
        launch(TableActivity.class);
    }
}
