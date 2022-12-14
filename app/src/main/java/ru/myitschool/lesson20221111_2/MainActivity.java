package ru.myitschool.lesson20221111_2;

import static android.util.Log.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static final String LOG_TAG="MY_TAG";
TextView textView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Toast.makeText(this, "Creating View....", Toast.LENGTH_LONG).show();

       // Log.i(LOG_TAG, "Creating View.....");
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        textView.setText(printMatrix(matrix(10, 10)));


        Log.i(LOG_TAG, "View Created.....");
        Log.d(LOG_TAG, printMatrix(matrix(5, 5)));
    }


    public static int[][] matrix(int n, int m)
    {
        int[][] array = new int [n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);

            }
        }
        return array;
    }

    public static String printMatrix(int[][] array)
    {
        String result = "\n";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);
                result += String.format("%d ",array[i][j]);
            }
          //  result +="\n";
        }
        return result;
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG,  "OnPause starting.....");
        super.onPause();
        Log.d(LOG_TAG,  "OnPause stop.....");
    }

    @Override
    protected void onRestart() {
        Log.d(LOG_TAG,  "OnRestart starting.....");
        super.onRestart();
        Log.d(LOG_TAG,  "OnRestart stop.....");
    }

    @Override
    protected void onResume() {
        Log.d(LOG_TAG, getString(R.string.nresume));
        super.onResume();
        Toast.makeText(this, getString(R.string.nresume), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        Log.d(LOG_TAG,  "OnStop starting.....");
        super.onStop();
        Log.d(LOG_TAG,  "OnStop stop.....");
    }

    @Override
    protected void onStart() {
        Log.d(LOG_TAG,  "OnStart starting.....");
        super.onStart();
        Log.d(LOG_TAG,  "OnStart stop.....");
    }

    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG,  "OnDestroy starting.....");
        super.onDestroy();
        Log.d(LOG_TAG,  "OnDestroy stop.....");
    }

    public void CreateNewMatrix(View view) {
        textView.setText(printMatrix(matrix(10, 10)));
    }

    User user1 = new User("User1", 123456789);
    public static String printUser(User user){
        return user.getName() + " " + user.getPhone();
    }
}