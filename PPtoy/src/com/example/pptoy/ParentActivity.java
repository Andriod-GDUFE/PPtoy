package com.example.pptoy;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


@SuppressWarnings("deprecation")
public class ParentActivity extends Activity {
    private Button parbut1,parbut2,parbut3,parbut4;
    private int flag=0;
    private boolean a=false,b=false,c=false;
    private TextView tt;
    private MediaPlayer mediaplayz=null;
    private	MediaPlayer	mediaplayd=null;
	private	MediaPlayer	mediaplays=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_parent);
		this.parbut1=(Button)super.findViewById(R.id.pb1);
		parbut1.setOnClickListener(new OnClistenerparone());
		this.parbut2=(Button)super.findViewById(R.id.pb2);
		parbut2.setOnClickListener(new OnClistenerpartwo());
		this.parbut3=(Button)super.findViewById(R.id.pb3);
		parbut3.setOnClickListener(new OnClistenerparthree());
		this.parbut4=(Button)super.findViewById(R.id.pb4);
		parbut4.setOnClickListener(new OnClistenerparfour());
		this.tt=(TextView)super.findViewById(R.id.tpv);
		mediaplayz=MediaPlayer.create(ParentActivity.this, R.raw.plantmp3);
		mediaplayd=MediaPlayer.create(ParentActivity.this, R.raw.animalmp3);
		mediaplays=MediaPlayer.create(ParentActivity.this, R.raw.numbermp3);
		}
	public class OnClistenerparone implements OnClickListener{
       @Override
       //直接点返回
		public void onClick(View v) {
			// TODO Auto-generated method stub
    		mediaplayz.stop();
			mediaplayd.stop();
			mediaplays.stop();
    	   if(flag==0||flag==1){
    			Intent i=new Intent();
    			i.setClass(ParentActivity.this,ChoseActivity.class);
    			startActivity(i);
    		}
    	   else if(flag==5){
    			Intent i=new Intent();
    			i.setClass(ParentActivity.this,ChoseActivity2.class);
    			startActivity(i);
    		}
    	   else if(flag==3){
    			Intent i=new Intent();
    			i.setClass(ParentActivity.this,ChoseActivity3.class);
    			startActivity(i);
    		}
		}
}
	public class OnClistenerpartwo implements OnClickListener{
        //植物
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			flag=1;
			mediaplayz=MediaPlayer.create(ParentActivity.this, R.raw.plantmp3);
			mediaplayd=MediaPlayer.create(ParentActivity.this, R.raw.animalmp3);
			mediaplays=MediaPlayer.create(ParentActivity.this, R.raw.numbermp3);
			a=true;
			if(a==true&&b==false&&c==false){
				mediaplayz.start();
				mediaplayd.stop();
				mediaplays.stop();
			}
			a=false;
			tt.setVisibility(View.VISIBLE);
			tt.setText("植物：孩子在玩植物模块的时候可以认识一些常见的植物，对植物的主要特征和一些常见花卉的认知能力可以得到提高，对以后的生活有所帮助哦！");
		}
}
	public class OnClistenerparthree implements OnClickListener{
       //动物
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			flag=5;
			mediaplayz=MediaPlayer.create(ParentActivity.this, R.raw.plantmp3);
			mediaplayd=MediaPlayer.create(ParentActivity.this, R.raw.animalmp3);
			mediaplays=MediaPlayer.create(ParentActivity.this, R.raw.numbermp3);
			b=true;
			if(a==false&&b==true&&c==false){
				mediaplayz.stop();
				mediaplayd.start();
				mediaplays.stop();
			}
			b=false;
			tt.setVisibility(View.VISIBLE);
			tt.setText("动物：孩子在玩动物模块的时候可以记住常见动物的主要特征，对动物的静态和平面认知有助于提高宝宝的分辨能力、观察能力和认知能力哦！");
		}
}
	public class OnClistenerparfour implements OnClickListener{
        //数字
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			flag=3;
			mediaplayz=MediaPlayer.create(ParentActivity.this, R.raw.plantmp3);
			mediaplayd=MediaPlayer.create(ParentActivity.this, R.raw.animalmp3);
			mediaplays=MediaPlayer.create(ParentActivity.this, R.raw.numbermp3);
			c=true;
			if(a==true&&b==false&&c==false){
				mediaplayz.stop();
				mediaplayd.stop();
				mediaplays.start();
			}
			c=false;
			tt.setVisibility(View.VISIBLE);
			tt.setText("数字：孩子在玩数字模块的时候可以熟知一些基础的数字，这对以后的学习和生活都会起到很大作用，等到宝宝入学的时候就不会太困难啦！");
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
