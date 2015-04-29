package com.example.morris;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class GLexample2 extends Activity{
	GLSurfaceView ourSurface ; 
	public static MediaPlayer sound ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		 
	        //Remove notification bar
	        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		sound = MediaPlayer.create(GLexample2.this,R.raw.win); 
        sound.start(); 
		ourSurface = new GLSurfaceView(this) ; 
		ourSurface.setRenderer(new GLRenderer2());
		  ourSurface.getHolder().setFormat(PixelFormat.TRANSLUCENT);
		setContentView(ourSurface);
		//ourSurface.setBackgroundResource(R.drawable.back);
		Thread time = new Thread(){
        	public void run(){
        		try{
        			sleep(10500); 
        		}
        		catch(InterruptedException e){
        			
        			e.printStackTrace();  
        		}
        		finally{
//        			Intent openStart = new Intent("com.example.morris.SPLASH"); 
//        			startActivity(openStart);
        			finish() ; 
        			sound.release();	
        		}
        	}
        };
        time.start(); 
		}
	
	@Override
    protected void onUserLeaveHint()
    {
    	sound.pause();
    	super.onUserLeaveHint();
    }
	
}
