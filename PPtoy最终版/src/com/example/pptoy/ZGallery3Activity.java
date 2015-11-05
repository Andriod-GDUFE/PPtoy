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
public class ZGallery3Activity extends Activity {
	private ImageView iim1,iim2,iim3;
	private Button im2;
	private int screenWidth;
	private int screenHeight;
	private boolean AQ=false,BQ=false,CQ=false;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_z3);
		iim1=(ImageView)this.findViewById(R.id.im1);
		iim2=(ImageView)this.findViewById(R.id.im2);
		iim3=(ImageView)this.findViewById(R.id.im3);
		im2=(Button)this.findViewById(R.id.ba2);
		DisplayMetrics dm=getResources().getDisplayMetrics();
		screenWidth=dm.widthPixels;
		screenHeight=dm.heightPixels-50;
		iim1.setOnTouchListener(movingEventListenerA);//左下
		iim2.setOnTouchListener(movingEventListenerB);//左上
		iim3.setOnTouchListener(movingEventListenerC);
		im2.setOnClickListener(new ABC());

}
	public class ABC implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent();
			i.setClass(ZGallery3Activity.this,ChoseActivity.class);
			startActivity(i);
		}
}
    private OnTouchListener movingEventListenerA = new OnTouchListener() { 
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
                
                if(lastX<=126&&lastY>=644){
                	iim1.setVisibility(View.INVISIBLE);
                	mediaplay=MediaPlayer.create(ZGallery3Activity.this, R.raw.happy);
                	mediaplay.start();
                	AQ=true;
                	if(AQ==true&&BQ==true&&CQ==true){
            			Intent i=new Intent();
            			i.setClass(ZGallery3Activity.this,ZGallery4Activity.class);
            			startActivity(i);
            		
            		}}
                break; 
            case MotionEvent.ACTION_UP: 
                break; 
            } 
            return true; 
        } 
    }; 

    private OnTouchListener movingEventListenerB = new OnTouchListener() { 
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
                
                if(lastX<=250  &&lastY<=260){
                	iim2.setVisibility(View.INVISIBLE);
                	mediaplay=MediaPlayer.create(ZGallery3Activity.this, R.raw.happy);
                	mediaplay.start();
                	BQ=true;
                	if(AQ==true&&BQ==true&&CQ==true){
            			Intent i=new Intent();
            			i.setClass(ZGallery3Activity.this,ZGallery4Activity.class);
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
                
                if(lastX<=180 &&lastY<=625&&lastY>=480){{
                	iim3.setVisibility(View.INVISIBLE);
                	mediaplay=MediaPlayer.create(ZGallery3Activity.this, R.raw.happy);
                	mediaplay.start();
                	CQ=true;
                	if(AQ==true&&BQ==true&&CQ==true){
            			Intent i=new Intent();
            			i.setClass(ZGallery3Activity.this,ZGallery4Activity.class);
            			startActivity(i);
            		
            		}
                	}
                break; }
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
