package example.com.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name;
    EditText password;
    Button submit;
    Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(MainActivity.this);
        cancel=(Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.submit:
                String username=name.getText().toString();
                username=username+" logged in";
                Toast.makeText(MainActivity.this,username,LENGTH_LONG).show();
                Intent in=new Intent(MainActivity.this,Register.class);
                in.putExtra("Your Name",name.getText().toString());
                startActivity(in);
                break;
            case R.id.cancel:
                Toast.makeText(MainActivity.this,"failed!!",LENGTH_LONG).show();
                break;
        }
    }
}
