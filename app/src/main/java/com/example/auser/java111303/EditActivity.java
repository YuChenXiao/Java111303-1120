package com.example.auser.java111303;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.auser.java111303.data.Student;

public class EditActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    int id;
    Student stu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ed1 = (EditText)findViewById(R.id.editText4);
        ed2 = (EditText)findViewById(R.id.editText5);
        ed3 = (EditText)findViewById(R.id.editText6);
        id = getIntent().getIntExtra("id",-1);
        stu = MainActivity.t.getOneStudent(id);
        ed1.setText(stu.name);
        ed2.setText(stu.tel);
        ed3.setText(stu.addr);

    }

    public void clickback(View v){
        finish();
    }
    public  void clickupdata(View v){
        stu.name =ed1.getText().toString();
        stu.tel = ed2.getText().toString();
        stu.addr =ed3.getText().toString();
        MainActivity.t.updata(stu);
        finish();

    }
}
