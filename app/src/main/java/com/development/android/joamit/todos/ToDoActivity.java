package com.development.android.joamit.todos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        Intent intent = getIntent();
        String content = intent.getStringExtra("Content");
        EditText editToDO = (EditText) findViewById(R.id.editTodo);
        editToDO.setText(content);
    }
}
