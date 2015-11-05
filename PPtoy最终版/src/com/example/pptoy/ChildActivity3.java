package com.example.pptoy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


@SuppressWarnings("deprecation")
public class ChildActivity3 extends Activity {
	private ImageButton i1,i2,i3,i4,i5;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_child3);
		this.i1 =(ImageButton)super.findViewById(R.id.cdib1);
		i1.setOnClickListener(new ImageA());
		this.i2 =(ImageButton)super.findViewById(R.id.cdib2);
		i2.setOnClickListener(new ImageB());
		this.i3 =(ImageButton)super.findViewById(R.id.cdib3);
		i3.setOnClickListener(new ImageC());
		this.i4 =(ImageButton)super.findViewById(R.id.cdib4);
		i4.setOnClickListener(new ImageD());
		this.i5 =(ImageButton)super.findViewById(R.id.cdib5);
		i5.setOnClickListener(new ImageE());
}
public class ImageA implements OnClickListener{
    @Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
		Intent i=new Intent();
		i.setClass(ChildActivity3.this,SGallery1Activity.class);
		startActivity(i);
		}
}
public class ImageB implements OnClickListener{
    @Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
		Intent i=new Intent();
		i.setClass(ChildActivity3.this,SGallery2Activity.class);
		startActivity(i);
		}
}
public class ImageC implements OnClickListener{
    @Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
		Intent i=new Intent();
		i.setClass(ChildActivity3.this,SGallery3Activity.class);
		startActivity(i);
		}
}
public class ImageD implements OnClickListener{
    @Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
		Intent i=new Intent();
		i.setClass(ChildActivity3.this,SGallery4Activity.class);
		startActivity(i);
		}
}
public class ImageE implements OnClickListener{
    @Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
		Intent i=new Intent();
		i.setClass(ChildActivity3.this,SGallery5Activity.class);
		startActivity(i);
		}
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
