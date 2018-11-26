package example.com.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Success extends AppCompatActivity {
    private static final String Tag=Success.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Log.i(Tag,"In method onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"In method onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"In method onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"In method onPause");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"In method onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"In method onDestroy");
    }
}
