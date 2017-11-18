package com.example.manjubs.acadgild.image.database;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InsertandRetriveBlobData extends Activity {
	private DBhelper DbHelper;
	//On Create method
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DbHelper = new DBhelper(this);
		Employee employee_One = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.photo),"RAMESHA", 25);
		DbHelper.open();
		DbHelper.insertEmpDetails(employee_One);
		DbHelper.close();
		employee_One = null;
		DbHelper.open();
		employee_One = DbHelper.retriveEmpDetails();
		DbHelper.close();
		//Set the emp name
		TextView empname = (TextView) findViewById(R.id.name);
		empname.setText(employee_One.getName());
		// SEt the Image of image view
		ImageView empphoto = (ImageView) findViewById(R.id.photo);
		empphoto.setImageBitmap(employee_One.getBitmap());
		//SET the age
		TextView empage = (TextView) findViewById(R.id.age);
		empage.setText("" + employee_One.getAge());

	}
}
