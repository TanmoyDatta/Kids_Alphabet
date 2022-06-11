package com.example.asus.kidsalphabet;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivityalpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityalpha);
    }
    public void switch3(View view) {
        Intent intent = new Intent(MainActivityalpha.this, MainActivitymenu.class);
        startActivity(intent);
    }

}
