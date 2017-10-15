package nyc.c4q.myhelloworldandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        for (int i = 0; i < 10; i++) {
//            Log.d(TAG,"Running this code onCreation()");
//        }
        Log.d(TAG,"Running this code onCreation()");



    }
    @Override
    protected void onStart(){
        super.onStart();

        Log.d(TAG,"Running this code onStart()");


    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Running this code onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Running this code onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Running this code onStart()");
   }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Running this code onDestroy()");
    }
}
