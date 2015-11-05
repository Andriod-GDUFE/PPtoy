package com.example.pptoy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



@SuppressWarnings("deprecation")
public class DGallery5Activity extends Activity {
	private ImageView ium1,ium2,ium3;
	private Button im2;
	private int screenWidth;
	private int screenHeight;
	private boolean AQ=false,BQ=false,CQ=false;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_d5);
		ium1=(ImageView)this.findViewById(R.id.uu1);
		ium2=(ImageView)this.findViewById(R.id.uu2);
		ium3=(ImageView)this.findViewById(R.id.uu3);
		im2=(Button)this.findViewById(R.id.ba3);
		DisplayMetrics dm=getResources().getDisplayMetrics();
		screenWidth=dm.widthPixels;
		screenHeight=dm.heightPixels-50;
		ium1.setOnTouchListener(movingEventListenerZ);
		ium2.setOnTouchListener(movingEventListenerX);
		ium3.setOnTouchListener(movingEventListenerC);
		im2.setOnClickListener(new AC());;
}
	public class AC implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent();
			i.setClass(DGallery5Activity.this,ChoseActivity.class);
			startActivity(i);
		}
}
    private OnTouchListener movingEventListenerZ = new OnTouchListener() { 
        int lastX, lastY; 
        MediaPlayer mediaplay=null;
 
        public boolean onTouch(View v, MotionEvent event) { 
            switch (event.getAction()) { 
            case MotionEvent.ACTION_DOWN: 
                lastX = (int) event.getRawX(); 
                lastY = (int) event.getRawY(); 
                break; 
            case MotionEvent.ACTION_MOVE: 
                int dx = (int) event.getRawX() - lastX; 
                int dy = (int) event.getRawY() - lastY; 
 
                int left = v.getLeft() + dx; 
                int top = v.getTop() + dy; 
                int right = v.getRight() + dx; 
                int bottom = v.getBottom() + dy; 
                // 设置不能出界 
                if (left < 0) { 
                    left = 0; 
                    right = left + v.getWidth(); 
                } 
 
                if (right > screenWidth) { 
                    right = screenWidth; 
                    left = right - v.getWidth(); 
                } 
 
                if (top < 0) { 
                    top = 0; 
                    bottom = top + v.getHeight(); 
                } 
 
                if (bottom > screenHeight) { 
                    bottom = screenHeight; 
                    top = bottom - v.getHeight(); 
                } 
 
                v.layout(left, top, right, bottom); 
 
                lastX = (int) event.getRawX(); 
                lastY = (int) event.getRawY(); 
                
                if(lastX>=220&&lastY<=656&&lastY>=456){
                	ium1.setVisibility(View.INVISIBLE);
                	mediaplay=MediaPlayer.create(DGallery5Activity.this, R.raw.happy);
                	mediaplay.start();
                	AQ=true;
                	if(AQ==true&&BQ==true&&CQ==true){
                		Intent i=new Intent();
         				i.setClass(DGallery5Activity.this,ChoseActivity.class);
         				startActivity(i);
                    }
                	}
                break; 
            case MotionEvent.ACTION_UP: 
                break; 
            } 
            return true; 
        } 
    }; 

    private OnTouchListener movingEventListenerX = new OnTouchListener() { 
        int lastX, lastY; 
        MediaPlayer mediaplay=null;
 
        public boolean onTouch(View v, MotionEvent event) { 
            switch (event.getAction()) { 
            case MotionEvent.ACTION_DOWN: 
                lastX = (int) event.getRawX(); 
                lastY = (int) event.getRawY(); 
                break; 
            case MotionEvent.ACTION_MOVE: 
                int dx = (int) event.getRawX() - lastX; 
                int dy = (int) event.getRawY() - lastY; 
 
                int left = v.getLeft() + dx; 
                int top = v.getTop() + dy; 
                int right = v.getRight() + dx; 
                int bottom = v.getBottom() + dy; 
                // 设置不能出界 
                if (left < 0) { 
                    left = 0; 
                    right = left + v.getWidth(); 
                } 
 
                if (right > screenWidth) { 
                    right = screenWidth; 
                    left = right - v.getWidth(); 
                } 
 
                if (top < 0) { 
                    top = 0; 
                    bottom = top + v.getHeight(); 
                } 
 
                if (bottom > screenHeight) { 
                    bottom = screenHeight; 
                    top = bottom - v.getHeight(); 
                } 
 
                v.layout(left, top, right, bottom); 
 
                lastX = (int) event.getRawX(); 
                lastY = (int) event.getRawY(); 
                
                if(lastX<=137&&lastY>=767){
                	ium2.setVisibility(View.INVISIBLE);
                	mediaplay=MediaPlayer.create(DGallery5Activity.this, R.raw.happy);
                	mediaplay.start();
                	BQ=true;
                	if(AQ==true&&BQ==true&&CQ==true){
                		Intent i=new Intent();
         				i.setClass(DGallery5Activity.this,ChoseActivity.class);
         				startActivity(i);
                    }
                	}
                break; 
            case MotionEvent.ACTION_UP: 
                break; 
            } 
            return true; 
        } 
    }; 
    private OnTouchListener movingEventListenerC = new OnTouchListener() { 
        int lastX, lastY; 
        MediaPlayer mediaplay=null;
 
        public boolean onTouch(View v, MotionEvent event) { 
            switch (event.getAction()) { 
            case MotionEvent.ACTION_DOWN: 
                lastX = (int) event.getRawX(); 
                lastY = (int) event.getRawY(); 
                break; 
            case MotionEvent.ACTION_MOVE: 
                int dx = (int) event.getRawX() - lastX; 
                int dy = (int) event.getRawY() - lastY; 
 
                int left = v.getLeft() + dx; 
                int top = v.getTop() + dy; 
                int right = v.getRight() + dx; 
                int bottom = v.getBottom() + dy; 
                // 设置不能出界 
                if (left < 0) { 
                    left = 0; 
                    right = left + v.getWidth(); 
                } 
 
                if (right > screenWidth) { 
                    right = screenWidth; 
                    left = right - v.getWidth(); 
                } 
 
                if (top < 0) { 
                    top = 0; 
                    bottom = top + v.getHeight(); 
                } 
 
                if (bottom > screenHeight) { 
                    bottom = screenHeight; 
                    top = bottom - v.getHeight(); 
                } 
 
                v.layout(left, top, right, bottom); 
 
                lastX = (int) event.getRawX(); 
                lastY = (int) event.getRawY(); 
                
                if(lastX<=367&&lastY<=367){
                	ium3.setVisibility(View.INVISIBLE);
                	mediaplay=MediaPlayer.create(DGallery5Activity.this, R.raw.happy);
                	mediaplay.start();
                	CQ=true;
                	if(AQ==true&&BQ==true&&CQ==true){
                		Intent i=new Intent();
         				i.setClass(DGallery5Activity.this,ChoseActivity.class);
         				startActivity(i);
                    }
                	}
                break; 
            case MotionEvent.ACTION_UP: 
                break; 
            } 
            return true; 
        } 
    }; 
 
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
