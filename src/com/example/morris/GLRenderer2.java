package com.example.morris;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLU;
import android.opengl.GLSurfaceView.Renderer;
import android.os.SystemClock;

public class GLRenderer2 implements Renderer {
	private GLCube cube,cube2,cube3,cube4 ; 
	public static float x =0 ;
	public GLRenderer2(){ 
		cube = new GLCube((float)0.1); 
		cube2 = new GLCube((float)1.0); 
		cube3 = new GLCube((float)0.1); 
		cube4 = new GLCube((float)0.85); 
	}
	@Override
	

	public void onSurfaceCreated(GL10 gl, EGLConfig eglConfig) {
		// TODO Auto-generated method stub
		gl.glDisable(GL10.GL_DITHER);
		gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_FASTEST);
		gl.glClearColor(0f, 0f,0f, 0.3f); 
		gl.glClearDepthf(.5f);		
	}
	@Override
	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		gl.glDisable(GL10.GL_DITHER);
		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadIdentity();
		GLU.gluLookAt(gl, 0, 0, -14, 0, 4, 0, 0, 1, 0);  
		float angle;
		long time ; 
	 
		int  flag = 0; 
	x :for(int i=0;i<180;i++) 
		{ 
		 if (flag == 0)
		
		{	
			flag = 1; 
			 time = SystemClock.uptimeMillis() % 4000L ; 
			 angle = 1f * ((int)time); 
			gl.glRotatef(angle, 0, 0, 10);
			gl.glPushMatrix();
			gl.glTranslatef(0,2,0);
			gl.glColor4f(1f,0f,0f,0.5f);
			cube.draw(gl);
			gl.glPopMatrix();
			 
		}
		if(flag == 1) 
		{
			flag = 2 ; 
		long time1 = SystemClock.uptimeMillis() %4000L ; 
		float angle1 = .9f * ((int)time1); 
		gl.glRotatef(angle1, 10,10,10);
		gl.glPushMatrix();
		gl.glColor4f(1f,0f,1f,0.5f);
		cube2.draw(gl);
		gl.glPopMatrix();		 	
		}
		
		 if (flag == 2)
				
			{	
				flag = 3; 
			long time2 = SystemClock.uptimeMillis() % 4000L ; 
			float angle2 = .9f * ((int)time2); 
				gl.glRotatef(angle2, 0, 0, 10);
				gl.glPushMatrix();
				gl.glTranslatef((float)0.1,0,0);
				gl.glColor4f(1f,1f,1f,0.5f);
				cube3.draw(gl);
				gl.glPopMatrix();
				 
			}
			if(flag == 3) 
			{
				flag = 0 ; 
			long time3 = SystemClock.uptimeMillis() %4000L ; 
			float angle3 = .9f * ((int)time3); 
			gl.glRotatef(angle3, 10,10,10);
			gl.glPushMatrix();
			gl.glColor4f(0f,0f,0f,1f);
			cube4.draw(gl);
			gl.glPopMatrix();
			break x; 	
			}
	}
	}
	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub
		gl.glViewport(0,0, width, height);
		float ratio = (float)width/height ; 
		gl.glMatrixMode(GL10.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glFrustumf(-ratio, ratio, -1, .5f, 1, 25);
	}

	

}
