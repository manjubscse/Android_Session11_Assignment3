package com.example.manjubs.acadgild.image.database;

import android.graphics.Bitmap;

//Class Employee
public class Employee {
	private Bitmap bmp;
	private String name;
	private int age;
    // constructor
	public Employee(Bitmap b, String n, int k) {
		bmp = b;
		name = n;
		age = k;
	}

	public Bitmap getBitmap() {
		return bmp;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
