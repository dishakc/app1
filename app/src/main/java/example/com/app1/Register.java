package example.com.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener{
    EditText Display;
    Button Continue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Display = (EditText) findViewById(R.id.Display);
        Continue = (Button) findViewById(R.id.Continue);
        Continue.setOnClickListener(Register.this);
        Display.setText(getIntent().getExtras().getString("Your Name"));
    }
    @Override
    public void onClick(View v) {
        Intent in=new Intent(Register.this,Success.class);
        startActivity(in);
    }
}
