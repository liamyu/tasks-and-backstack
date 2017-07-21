package com.liam.tasks_and_backstack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class AmberActivity extends AppCompatActivity implements OnClickListener {

  private static final String TAG = "Activity";
  private CheckBox newTaskCheckbox;
  private CheckBox clearTopCheckbox;
  private String className;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_amber);
    className = getClass().getSimpleName();
    setTitle(className);
    Log.d(TAG, "onCreate: " + className);
    newTaskCheckbox = (CheckBox) findViewById(R.id.new_task);
    clearTopCheckbox = (CheckBox) findViewById(R.id.clear_top);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.button0: {
        Intent intent = new Intent(AmberActivity.this, AmberActivity.class);
        addFlags(intent);
        startActivity(intent);
      }
      break;
      case R.id.button: {
        Intent intent = new Intent(AmberActivity.this, BatesActivity.class);
        addFlags(intent);
        startActivity(intent);
      }
      break;
      case R.id.button2: {
        Intent intent = new Intent(AmberActivity.this, CiciActivity.class);
        addFlags(intent);
        startActivity(intent);
      }
      break;
      case R.id.button3: {
        Intent intent = new Intent(AmberActivity.this, DannyActivity.class);
        addFlags(intent);
        startActivity(intent);
      }
      break;
      case R.id.button4: {
        Intent intent = new Intent(AmberActivity.this, EthanActivity.class);
        addFlags(intent);
        startActivity(intent);
      }
      break;
      case R.id.button5: {
        Intent intent = new Intent(AmberActivity.this, FeliciaActivity.class);
        addFlags(intent);
        startActivity(intent);
      }
      break;
    }
  }

  private void addFlags(Intent intent) {
    boolean isNewTask = newTaskCheckbox.isChecked();
    boolean isClearTop = clearTopCheckbox.isChecked();
    if (isNewTask) {
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    }
    if (isClearTop) {
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.d(TAG, "onDestroy: " + className);
  }

}