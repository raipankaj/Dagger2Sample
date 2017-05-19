package dagger.sample.example;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.sample.example.dagger2sample.R;
import dagger.sample.example.model.DataBaseHandler;
import dagger.sample.example.model.SharedPreferenceModel;

public class MainActivity extends AppCompatActivity {

    @Inject
    Context context;

    @Inject
    Context context1;

    @Inject
    SharedPreferenceModel sharedPreferenceModel;

    @Inject
    SharedPreferenceModel sharedPreferenceModel1;


    DataBaseHandler dataBaseHandler;

    DataBaseHandler dataBaseHandler1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseHandler = MyApplication.getComponent().getDataBaseHandler();
        dataBaseHandler1 = MyApplication.getComponent().getDataBaseHandler();
//        sharedPreferenceModel = MyApplication.getSecondComponent().getSharedPreferenceModel();
        Log.e("Shared","1-"+dataBaseHandler);
        Log.e("Shared","2-"+dataBaseHandler1);
        Log.e("Shared","2-"+MyApplication.getComponent().getDataBaseHandler());

        Toast.makeText(getApplicationContext(), "Context:"+context, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Shared Preferences:"+sharedPreferenceModel, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Database"+dataBaseHandler, Toast.LENGTH_SHORT).show();
    }
}
