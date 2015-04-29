package com.example.morris;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NewGame extends ActionBarActivity implements OnClickListener{
	
	ImageView previ, sound, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24;
	Button b1;
	TextView t1;
	RelativeLayout rl;
	Resources res;
	Drawable drawable;
	int pos[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int piece[]={0,9,9};
	int score[]={0,9,9};
	int phase=1, player=1, prev;
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_new_game);
		
		sound = (ImageView)findViewById(R.id.sound);
		if(MainActivity.pref)
			sound.setImageResource(R.drawable.unmute);
		else
			sound.setImageResource(R.drawable.mute);
		sound.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(MainActivity.pref)
				{
					MainActivity.pref=false;
					sound.setImageResource(R.drawable.mute);
					MainActivity.sound.pause();
				}
				else
				{
					MainActivity.pref=true;
					sound.setImageResource(R.drawable.unmute);
					MainActivity.sound.start();
				}
			}
		});
		
		i1 = (ImageView)findViewById(R.id.imageView1);
		i2 = (ImageView)findViewById(R.id.imageView2);
		i3 = (ImageView)findViewById(R.id.imageView3);
		i4 = (ImageView)findViewById(R.id.imageView4);
		i5 = (ImageView)findViewById(R.id.imageView5);
		i6 = (ImageView)findViewById(R.id.imageView6);
		i7 = (ImageView)findViewById(R.id.imageView7);
		i8 = (ImageView)findViewById(R.id.imageView8);
		i9 = (ImageView)findViewById(R.id.imageView9);
		i10 = (ImageView)findViewById(R.id.imageView10);
		i11 = (ImageView)findViewById(R.id.imageView11);
		i12 = (ImageView)findViewById(R.id.imageView12);
		i13 = (ImageView)findViewById(R.id.imageView13);
		i14 = (ImageView)findViewById(R.id.imageView14);
		i15 = (ImageView)findViewById(R.id.imageView15);
		i16 = (ImageView)findViewById(R.id.imageView16);
		i17 = (ImageView)findViewById(R.id.imageView17);
		i18 = (ImageView)findViewById(R.id.imageView18);
		i19 = (ImageView)findViewById(R.id.imageView19);
		i20 = (ImageView)findViewById(R.id.imageView20);
		i21 = (ImageView)findViewById(R.id.imageView21);
		i22 = (ImageView)findViewById(R.id.imageView22);
		i23 = (ImageView)findViewById(R.id.imageView23);
		i24 = (ImageView)findViewById(R.id.imageView24);
		
		rl = (RelativeLayout)findViewById(R.id.container);
		res = getResources();
		drawable = res.getDrawable(R.drawable.redblackback);
		rl.setBackgroundDrawable(drawable);
		
		b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		
		t1 = (TextView)findViewById(R.id.textView1);
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_game, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_new_game,
					container, false);
			return rootView;
		}
	}

	@Override
    protected void onUserLeaveHint()
    {
    	MainActivity.sound.pause();
    	super.onUserLeaveHint();
    }
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		if(MainActivity.pref)
			MainActivity.sound.start();
		super.onResume();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		i1.setImageResource(R.drawable.empty);
		i2.setImageResource(R.drawable.empty);
		i3.setImageResource(R.drawable.empty);
		i4.setImageResource(R.drawable.empty);
		i5.setImageResource(R.drawable.empty);
		i6.setImageResource(R.drawable.empty);
		i7.setImageResource(R.drawable.empty);
		i8.setImageResource(R.drawable.empty);
		i9.setImageResource(R.drawable.empty);
		i10.setImageResource(R.drawable.empty);
		i11.setImageResource(R.drawable.empty);
		i12.setImageResource(R.drawable.empty);
		i13.setImageResource(R.drawable.empty);
		i14.setImageResource(R.drawable.empty);
		i15.setImageResource(R.drawable.empty);
		i16.setImageResource(R.drawable.empty);
		i17.setImageResource(R.drawable.empty);
		i18.setImageResource(R.drawable.empty);
		i19.setImageResource(R.drawable.empty);
		i20.setImageResource(R.drawable.empty);
		i21.setImageResource(R.drawable.empty);
		i22.setImageResource(R.drawable.empty);
		i23.setImageResource(R.drawable.empty);
		i24.setImageResource(R.drawable.empty);
		
		b1.setVisibility(View.INVISIBLE);
		t1.setVisibility(View.VISIBLE);
		t1.setTextColor(Color.BLACK);
		t1.setText("Player RED");
		drawable = res.getDrawable(R.drawable.redback);
		rl.setBackgroundDrawable(drawable);
		b1.setOnClickListener(null);
		
		i1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[0]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]-=1;
									pos[0]=1;
									i1.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[0]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									piece[2]-=1;
									pos[0]=2;
									i1.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[0]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
										
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[0]==0)
								break;
							else if(pos[1]!=0&&pos[9]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[0]==1||pos[0]==3)
									{
										i1.setImageResource(R.drawable.selectedred);
										prev=0;
										previ=i1;
										phase=3;
									}
								}
								else
								{
									if(pos[0]==2||pos[0]==4)
									{
										i1.setImageResource(R.drawable.selectedblack);
										prev=0;
										previ=i1;
										phase=3;
									}
								}
							}
							break;
							
					case 3: if(pos[0]==0&&(prev==1||prev==9))
							{
								if(player==1)
								{
									isalreadymill(1,prev);
									pos[0]=1;
									pos[prev]=0;
									previ.setImageResource(R.drawable.empty);
									i1.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=5;
									}
									else
									{
										phase=2;
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
										for(int i=0;i<24;i++)
											if(pos[i]==3)
												pos[i]=1;
									}
								}
								else
								{
									isalreadymill(2,prev);
									pos[0]=2;
									pos[prev]=0;
									previ.setImageResource(R.drawable.empty);
									i1.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=5;
									}
									else
									{
										phase=2;
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									}
								}
							}
							break;

							
					case 4: if(pos[0]==0)
								break;
							else if(player==1&&pos[0]==1)
								break;
							else if(player==1&&pos[0]==2)
							{
								phase=1;
								player=2;
								i1.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[0]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[0]==2)
								break;
							else if(player==2&&pos[0]==1)
							{
								phase=1;
								player=1;
								i1.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[0]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
								}
							}
						
							break;
							
					case 5:	if(pos[0]==0)
								break;
							else if(player==1&&pos[0]==1)
								break;
							else if(player==1&&pos[0]==2)
							{
								score[2]-=1;
								if(score[2]<3)
								{
									i1.setImageResource(R.drawable.empty);
									endgame(1);
								}
								else
								{
									phase=2;
									player=2;
									i1.setImageResource(R.drawable.empty);
									drawable = res.getDrawable(R.drawable.back);
									rl.setBackgroundDrawable(drawable);
									t1.setTextColor(Color.RED);
									t1.setText("Player BLACK");
									pos[0]=0;
								}
							}
							else if(player==2&&pos[0]==2)
								break;
							else if(player==2&&pos[0]==1)
							{
								score[1]-=1;
								if(score[1]<3)
								{
									i1.setImageResource(R.drawable.empty);
									endgame(2);
								}
								else
								{
									phase=2;
									player=1;
									i1.setImageResource(R.drawable.empty);
									drawable = res.getDrawable(R.drawable.redback);
									rl.setBackgroundDrawable(drawable);
									t1.setTextColor(Color.BLACK);
									t1.setText("Player RED");
									pos[0]=0;
								}
							}
					
							break;
				}
			}
		});
		i2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[1]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[1]=1;
									i2.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[1]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									piece[2]--;
									pos[1]=2;
									i2.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[1]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[1]==0)
								break;
							else if(pos[0]!=0&&pos[2]!=0&&pos[4]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[1]==1||pos[1]==3)
									{
										i2.setImageResource(R.drawable.selectedred);
										prev=1;
										previ=i2;
										phase=3;
									}
								}
								else
								{
									if(pos[1]==2||pos[1]==4)
									{
										i2.setImageResource(R.drawable.selectedblack);
										prev=1;
										previ=i2;
										phase=3;
									}
								}
							}
							break;
							
					case 3: if(pos[1]==0&&(prev==0||prev==2||prev==4))
							{
								if(player==1)
								{
									isalreadymill(1,prev);
									pos[1]=1;
									pos[prev]=0;
									previ.setImageResource(R.drawable.empty);
									i2.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=5;
										pos[1]=3;
									}
									else
									{
										phase=2;
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									isalreadymill(2,prev);
									pos[1]=2;
									pos[prev]=0;
									previ.setImageResource(R.drawable.empty);
									i2.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=5;
										pos[1]=4;
									}
									else
									{
										phase=2;
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									}
								}
							}
							break;
							
					case 4: if(pos[1]==0)
								break;
							else if(player==1&&pos[1]==1)
								break;
							else if(player==1&&pos[1]==2)
							{
								phase=1;
								player=2;
								i2.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[1]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[1]==2)
								break;
							else if(player==2&&pos[1]==1)
							{
								phase=1;
								player=1;
								i2.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[1]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
								}
							}

							break;
					
					case 5:	if(pos[1]==0)
						break;
					else if(player==1&&pos[1]==1)
						break;
					else if(player==1&&pos[1]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i2.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i2.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[1]=0;
						}
					}
					else if(player==2&&pos[1]==2)
						break;
					else if(player==2&&pos[1]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i2.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i2.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[1]=0;
						}
					}
			
					break;
				}
			}
		});
		i3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[2]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[2]=1;
									i3.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[2]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									piece[2]--;
									pos[2]=2;
									i3.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[2]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
										
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[2]==0)
								break;
							else if(pos[1]!=0&&pos[14]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[2]==1||pos[2]==3)
									{
										i3.setImageResource(R.drawable.selectedred);
										prev=2;
										previ=i3;
										phase=3;
									}
								}
								else
								{
									if(pos[2]==2||pos[2]==4)
									{
										i3.setImageResource(R.drawable.selectedblack);
										prev=2;
										previ=i3;
										phase=3;
									}
								}
								
							}
							break;
					
					case 3: if(pos[2]==0&&(prev==1||prev==14))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[2]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i3.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[2]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i3.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[2]==0)
								break;
							else if(player==1&&pos[2]==1)
								break;
							else if(player==1&&pos[2]==2)
							{
								phase=1;
								player=2;
								i3.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[2]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[2]==2)
								break;
							else if(player==2&&pos[2]==1)
							{
								phase=1;
								player=1;
								i3.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[2]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
								}
							}
		
							break;
							
					case 5:	if(pos[2]==0)
						break;
					else if(player==1&&pos[2]==1)
						break;
					else if(player==1&&pos[2]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i3.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i3.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[2]=0;
						}
					}
					else if(player==2&&pos[2]==2)
						break;
					else if(player==2&&pos[2]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i3.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i3.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[2]=0;
						}
					}
			
					break;
				}
			}
		});
		i4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[3]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[3]=1;
									i4.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[3]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i4.setImageResource(R.drawable.black);
									piece[2]--;
									pos[3]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[3]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[3]==0)
								break;
							else if(pos[4]!=0&&pos[10]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[3]==1||pos[3]==3)
									{
										i4.setImageResource(R.drawable.selectedred);
										prev=3;
										previ=i4;
										phase=3;
									}
								}
								else
								{
									if(pos[3]==2||pos[3]==4)
									{
										i4.setImageResource(R.drawable.selectedblack);
										prev=3;
										previ=i4;
										phase=3;
									}
								}
								
							}
							break;
							
					case 3: if(pos[3]==0&&(prev==4||prev==10))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[3]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i4.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[3]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i4.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[3]==0)
								break;
							else if(player==1&&pos[3]==1)
								break;
							else if(player==1&&pos[3]==2)
							{
								phase=1;
								player=2;
								i4.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[3]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[3]==2)
								break;
							else if(player==2&&pos[3]==1)
							{
								phase=1;
								player=1;
								i4.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[3]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
				
							break;
							
					case 5:	if(pos[3]==0)
						break;
					else if(player==1&&pos[3]==1)
						break;
					else if(player==1&&pos[3]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i4.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i4.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[3]=0;
						}
					}
					else if(player==2&&pos[3]==2)
						break;
					else if(player==2&&pos[3]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i4.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i4.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[3]=0;
						}
					}
			
					break;
				}
			}
		});
		i5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[4]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[4]=1;
									i5.setImageResource(R.drawable.red);
									
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[4]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									piece[2]--;
									pos[4]=2;
									i5.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[4]=4;
									}
									else
									{
										drawable = res.getDrawable(R.drawable.redback);
										player=1;
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[4]==0)
								break;
							else if(pos[3]!=0&&pos[5]!=0&&pos[7]!=0&&pos[1]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[4]==1||pos[4]==3)
									{
										i5.setImageResource(R.drawable.selectedred);
										prev=4;
										previ=i5;
										phase=3;
									}
								}
								else
								{
									if(pos[4]==2||pos[4]==4)
									{
										i5.setImageResource(R.drawable.selectedblack);
										prev=4;
										previ=i5;
										phase=3;
									}
								}
								
							}
							break;

					case 3: if(pos[4]==0&&(prev==1||prev==3||prev==5||prev==7))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[4]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i5.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[4]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i5.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[4]==0)
								break;
							else if(player==1&&pos[4]==1)
								break;
							else if(player==1&&pos[4]==2)
							{
								phase=1;
								player=2;
								i5.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[4]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[4]==2)
								break;
							else if(player==2&&pos[4]==1)
							{
								phase=1;
								player=1;
								i5.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[4]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[4]==0)
						break;
					else if(player==1&&pos[4]==1)
						break;
					else if(player==1&&pos[4]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i5.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i5.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[4]=0;
						}
					}
					else if(player==2&&pos[4]==2)
						break;
					else if(player==2&&pos[4]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i5.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i5.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[4]=0;
						}
					}
			
					break;
				}
			}
		});
		i6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[5]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[5]=1;
									i6.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[5]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");	
									}
								}
								else
								{
									piece[2]--;
									pos[5]=2;
									i6.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[5]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");	
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[5]==0)
								break;
							else if(pos[4]!=0&&pos[13]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[5]==1||pos[5]==3)
									{
										i6.setImageResource(R.drawable.selectedred);
										prev=5;
										previ=i6;
										phase=3;										
									}
								}
								else
								{
									if(pos[5]==2||pos[5]==4)
									{
										i6.setImageResource(R.drawable.selectedblack);
										prev=5;
										previ=i6;
										phase=3;
									}
								}
								
							}
							break;
							
					case 3: if(pos[5]==0&&(prev==4||prev==13))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[5]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i6.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[5]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i6.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[5]==0)
								break;
							else if(player==1&&pos[5]==1)
								break;
							else if(player==1&&pos[5]==2)
							{
								phase=1;
								player=2;
								i6.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[5]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[5]==2)
								break;
							else if(player==2&&pos[5]==1)
							{
								phase=1;
								player=1;
								i6.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[5]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[5]==0)
						break;
					else if(player==1&&pos[5]==1)
						break;
					else if(player==1&&pos[5]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i6.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i6.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[5]=0;
						}
					}
					else if(player==2&&pos[5]==2)
						break;
					else if(player==2&&pos[5]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i6.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i6.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[5]=0;
						}
					}
			
					break;
				}
			}
		});
		i7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[6]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[6]=1;
									i7.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[6]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");	
									}
								}
								else
								{
									i7.setImageResource(R.drawable.black);
									piece[2]--;
									pos[6]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[6]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[6]==0)
								break;
							else if(pos[7]!=0&&pos[11]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[6]==1||pos[6]==3)
									{
										i7.setImageResource(R.drawable.selectedred);
										prev=6;
										previ=i7;
										phase=3;
									}
								}
								else
								{
									if(pos[6]==2||pos[6]==4)
									{
										i7.setImageResource(R.drawable.selectedblack);
										prev=6;
										previ=i7;
										phase=3;
									}
								}
								
							}
							break;
							
					case 3: if(pos[6]==0&&(prev==7||prev==11))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[6]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i7.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[6]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i7.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[6]==0)
								break;
							else if(player==1&&pos[6]==1)
								break;
							else if(player==1&&pos[6]==2)
							{
								phase=1;
								player=2;
								i7.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[6]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[6]==2)
								break;
							else if(player==2&&pos[6]==1)
							{
								phase=1;
								player=1;
								i7.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[6]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[6]==0)
						break;
					else if(player==1&&pos[6]==1)
						break;
					else if(player==1&&pos[6]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i7.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i7.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[6]=0;
						}
					}
					else if(player==2&&pos[6]==2)
						break;
					else if(player==2&&pos[6]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i7.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i7.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[6]=0;
						}
					}
			
					break;
				}
			}
		});
		i8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[7]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[7]=1;
									i8.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[7]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i8.setImageResource(R.drawable.black);
									piece[2]--;
									pos[7]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[7]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[7]==0)
								break;
							else if(pos[6]!=0&&pos[8]!=0&&pos[4]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[7]==1||pos[7]==3)
									{
										i8.setImageResource(R.drawable.selectedred);
										prev=7;
										previ=i8;
										phase=3;
									}
								}
								else
								{
									if(pos[7]==2||pos[7]==4)
									{
										i8.setImageResource(R.drawable.selectedblack);
										prev=7;
										previ=i8;
										phase=3;
									}
								}
								
							}
							break;
					
					case 3: if(pos[7]==0&&(prev==4||prev==6||prev==8))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[7]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i8.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[7]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i8.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[7]==0)
								break;
							else if(player==1&&pos[7]==1)
								break;
							else if(player==1&&pos[7]==2)
							{
								phase=1;
								player=2;
								i8.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[7]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[7]==2)
								break;
							else if(player==2&&pos[7]==1)
							{
								phase=1;
								player=1;
								i8.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[7]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[7]==0)
						break;
					else if(player==1&&pos[7]==1)
						break;
					else if(player==1&&pos[7]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i8.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i8.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[7]=0;
						}
					}
					else if(player==2&&pos[7]==2)
						break;
					else if(player==2&&pos[7]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i8.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i8.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[7]=0;
						}
					}
			
					break;
				}
			}
		});
		i9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[8]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[8]=1;
									i9.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[8]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i9.setImageResource(R.drawable.black);
									piece[2]--;
									pos[8]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[8]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[8]==0)
								break;
							else if(pos[7]!=0&&pos[12]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[8]==1||pos[8]==3)
									{
										i9.setImageResource(R.drawable.selectedred);
										prev=8;
										previ=i9;
										phase=3;
									}
								}
								else
								{
									if(pos[8]==2||pos[8]==4)
									{
										i9.setImageResource(R.drawable.selectedblack);
										prev=8;
										previ=i9;
										phase=3;
									}
								}
								
							}
							break;
							
					case 3: if(pos[8]==0&&(prev==7||prev==12))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[8]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i9.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[8]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i9.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[8]==0)
								break;
							else if(player==1&&pos[8]==1)
								break;
							else if(player==1&&pos[8]==2)
							{
								phase=1;
								player=2;
								i9.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[8]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[8]==2)
								break;
							else if(player==2&&pos[8]==1)
							{
								phase=1;
								player=1;
								i9.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[8]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[8]==0)
						break;
					else if(player==1&&pos[8]==1)
						break;
					else if(player==1&&pos[8]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i9.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i9.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[8]=0;
						}
					}
					else if(player==2&&pos[8]==2)
						break;
					else if(player==2&&pos[8]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i9.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i9.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[8]=0;
						}
					}
			
					break;
				}
			}
		});
		i10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[9]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[9]=1;
									i10.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[9]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									piece[2]--;
									pos[9]=2;
									i10.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[9]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[9]==0)
								break;
							else if(pos[0]!=0&&pos[10]!=0&&pos[21]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[9]==1||pos[9]==3)
									{
										i10.setImageResource(R.drawable.selectedred);
										prev=9;
										previ=i10;
										phase=3;
									}
								}
								else
								{
									if(pos[9]==2||pos[9]==4)
									{
										i10.setImageResource(R.drawable.selectedblack);
										prev=9;
										previ=i10;
										phase=3;
									}
								}
								
							}
							break;
						
					case 3: if(pos[9]==0&&(prev==0||prev==10||prev==21))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[9]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i10.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[9]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i10.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[9]==0)
								break;
							else if(player==1&&pos[9]==1)
								break;
							else if(player==1&&pos[9]==2)
							{
								phase=1;
								player=2;
								i10.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[9]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[9]==2)
								break;
							else if(player==2&&pos[9]==1)
							{
								phase=1;
								player=1;
								i10.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[9]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[9]==0)
						break;
					else if(player==1&&pos[9]==1)
						break;
					else if(player==1&&pos[9]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i10.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i10.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[9]=0;
						}
					}
					else if(player==2&&pos[9]==2)
						break;
					else if(player==2&&pos[9]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i10.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i10.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[9]=0;
						}
					}
			
					break;
				}
			}
		});
		i11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[10]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[10]=1;
									i11.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[10]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i11.setImageResource(R.drawable.black);
									piece[2]--;
									pos[10]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[10]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");	
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[10]==0)
								break;
							else if(pos[9]!=0&&pos[3]!=0&&pos[11]!=0&&pos[18]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[10]==1||pos[10]==3)
									{
										i11.setImageResource(R.drawable.selectedred);
										prev=10;
										previ=i11;
										phase=3;
									}
								}
								else
								{
									if(pos[10]==2||pos[10]==4)
									{
										i11.setImageResource(R.drawable.selectedblack);
										prev=10;
										previ=i11;
										phase=3;
									}
								}
								
							}
							break;
							
					case 3: if(pos[10]==0&&(prev==3||prev==9||prev==11||prev==18))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[10]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i11.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[10]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i11.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
					
					case 4: if(pos[10]==0)
								break;
							else if(player==1&&pos[10]==1)
								break;
							else if(player==1&&pos[10]==2)
							{
								phase=1;
								player=2;
								i11.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[10]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[10]==2)
								break;
							else if(player==2&&pos[10]==1)
							{
								phase=1;
								player=1;
								i11.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[10]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
								}
							}
						
							break;
							
					case 5:	if(pos[10]==0)
						break;
					else if(player==1&&pos[10]==1)
						break;
					else if(player==1&&pos[10]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i11.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i11.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[10]=0;
						}
					}
					else if(player==2&&pos[10]==2)
						break;
					else if(player==2&&pos[10]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i11.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i11.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[10]=0;
						}
					}
			
					break;
				}
			}
		});
		i12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[11]!=0)
								break;
							else
							{
								if(player==1)
								{
									i12.setImageResource(R.drawable.red);
									piece[1]--;
									pos[11]=1;
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[11]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i12.setImageResource(R.drawable.black);
									piece[2]--;
									pos[11]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[11]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
										
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[11]==0)
								break;
							else if(pos[6]!=0&&pos[10]!=0&&pos[15]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[11]==1||pos[11]==3)
									{
										i12.setImageResource(R.drawable.selectedred);
										prev=11;
										previ=i12;
										phase=3;
									}
								}
								else
								{
									if(pos[11]==2||pos[11]==4)
									{
										i12.setImageResource(R.drawable.selectedblack);
										prev=11;
										previ=i12;
										phase=3;
									}
								}
								
							}
							break;
							
					case 3: if(pos[11]==0&&(prev==6||prev==10||prev==15))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[11]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i12.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[11]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i12.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[11]==0)
								break;
							else if(player==1&&pos[11]==1)
								break;
							else if(player==1&&pos[11]==2)
							{
								phase=1;
								player=2;
								i12.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[11]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[11]==2)
								break;
							else if(player==2&&pos[11]==1)
							{
								phase=1;
								player=1;
								i12.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[11]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
							
								}
							}
						
							break;
							
					case 5:	if(pos[11]==0)
						break;
					else if(player==1&&pos[11]==1)
						break;
					else if(player==1&&pos[11]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i12.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i12.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[11]=0;
						}
					}
					else if(player==2&&pos[11]==2)
						break;
					else if(player==2&&pos[11]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i12.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i12.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[11]=0;
						}
					}
			
					break;
				}
			}
		});
		i13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[12]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[12]=1;
									i13.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[12]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i13.setImageResource(R.drawable.black);
									piece[2]--;
									pos[12]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[12]=4;
									}
									else
									{
										player=1;
									
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[12]==0)
								break;
							else if(pos[8]!=0&&pos[17]!=0&&pos[13]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[12]==1||pos[12]==3)
									{
										i13.setImageResource(R.drawable.selectedred);
										prev=12;
										previ=i13;
										phase=3;
									}
								}
								else
								{
									if(pos[12]==2||pos[12]==4)
									{
										i13.setImageResource(R.drawable.selectedblack);
										prev=12;
										previ=i13;
										phase=3;
									}
								}
								
							}	
							break;
							
					case 3: if(pos[12]==0&&(prev==8||prev==17||prev==13))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[12]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i13.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[12]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i13.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[12]==0)
								break;
							else if(player==1&&pos[12]==1)
								break;
							else if(player==1&&pos[12]==2)
							{
								phase=1;
								player=2;
								i13.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[12]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[12]==2)
								break;
							else if(player==2&&pos[12]==1)
							{
								phase=1;
								player=1;
								i13.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[12]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
								}
							}
						
							break;
							
					case 5:	if(pos[12]==0)
						break;
					else if(player==1&&pos[12]==1)
						break;
					else if(player==1&&pos[12]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i13.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i13.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[12]=0;
						}
					}
					else if(player==2&&pos[12]==2)
						break;
					else if(player==2&&pos[12]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i13.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i13.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[12]=0;
						}
					}
			
					break;
				}
			}
		});
		i14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[13]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[13]=1;
									i14.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[13]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i14.setImageResource(R.drawable.black);
									piece[2]--;
									pos[13]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[13]=4;
									}
									else
									{
										player=1;
									
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[13]==0)
								break;
							else if(pos[5]!=0&&pos[12]!=0&&pos[14]!=0&&pos[20]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[13]==1||pos[13]==3)
									{
										i14.setImageResource(R.drawable.selectedred);
										prev=13;
										previ=i14;
										phase=3;
									}
								}
								else
								{
									if(pos[13]==2||pos[13]==4)
									{
										i14.setImageResource(R.drawable.selectedblack);
										prev=13;
										previ=i14;
										phase=3;
									}
								}
								
							}	
							break;
							
					case 3: if(pos[13]==0&&(prev==5||prev==12||prev==14||prev==20))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[13]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i14.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[13]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i14.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
							
					case 4: if(pos[13]==0)
								break;
							else if(player==1&&pos[13]==1)
								break;
							else if(player==1&&pos[13]==2)
							{
								phase=1;
								player=2;
								i14.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[13]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[13]==2)
								break;
							else if(player==2&&pos[13]==1)
							{
								phase=1;
								player=1;
								i14.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[13]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
							
								}
							}
						
							break;
							
					case 5:	if(pos[13]==0)
						break;
					else if(player==1&&pos[13]==1)
						break;
					else if(player==1&&pos[13]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i14.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i14.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[13]=0;
						}
					}
					else if(player==2&&pos[13]==2)
						break;
					else if(player==2&&pos[13]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i14.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i14.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[13]=0;
						}
					}
			
					break;
				}
			}
		});
		i15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[14]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[14]=1;
									i15.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[14]=3;
									}
									else
									{
										player=2;		
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i15.setImageResource(R.drawable.black);
									piece[2]--;
									pos[14]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[14]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[14]==0)
								break;
							else if(pos[2]!=0&&pos[13]!=0&&pos[23]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[14]==1||pos[14]==3)
									{
										i15.setImageResource(R.drawable.selectedred);
										prev=14;
										previ=i15;
										phase=3;
									}
								}
								else
								{
									if(pos[14]==2||pos[14]==4)
									{
										i15.setImageResource(R.drawable.selectedblack);
										prev=14;
										previ=i15;
										phase=3;
									}
								}
								
							}	
							break;
							
					case 3: if(pos[14]==0&&(prev==2||prev==13||prev==23))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[14]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i15.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[14]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i15.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;
							
					case 4: if(pos[14]==0)
								break;
							else if(player==1&&pos[14]==1)
								break;
							else if(player==1&&pos[14]==2)
							{
								phase=1;
								player=2;
								i15.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[14]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[14]==2)
								break;
							else if(player==2&&pos[14]==1)
							{
								phase=1;
								player=1;
								i15.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[14]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
							
								}
							}
						
							break;
							
					case 5:	if(pos[14]==0)
						break;
					else if(player==1&&pos[14]==1)
						break;
					else if(player==1&&pos[14]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i15.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i15.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[14]=0;
						}
					}
					else if(player==2&&pos[14]==2)
						break;
					else if(player==2&&pos[14]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i15.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i15.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[14]=0;
						}
					}
			
					break;
				}
			}
		});
		i16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[15]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[15]=1;
									i16.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[15]=3;
									}
									else
									{
										player=2;
									
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									piece[2]--;
									pos[15]=2;
									i16.setImageResource(R.drawable.black);
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[15]=4;
									}
									else
									{
										player=1;					
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
										
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[15]==0)
								break;
							else if(pos[11]!=0&&pos[16]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[15]==1||pos[15]==3)
									{
										i16.setImageResource(R.drawable.selectedred);
										prev=15;
										previ=i16;
										phase=3;
									}
								}
								else
								{
									if(pos[15]==2||pos[15]==4)
									{
										i16.setImageResource(R.drawable.selectedblack);
										prev=15;
										previ=i16;
										phase=3;
									}
								}
								
							}	
							
							break;
					
					case 3: if(pos[15]==0&&(prev==11||prev==16))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[15]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i16.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[15]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i16.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[15]==0)
								break;
							else if(player==1&&pos[15]==1)
								break;
							else if(player==1&&pos[15]==2)
							{
								phase=1;
								player=2;
								i16.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[15]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[15]==2)
								break;
							else if(player==2&&pos[15]==1)
							{
								phase=1;
								player=1;
								i16.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[15]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
							
								}
							}
						
							break;
							
					case 5:	if(pos[15]==0)
						break;
					else if(player==1&&pos[15]==1)
						break;
					else if(player==1&&pos[15]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i16.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i16.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[15]=0;
						}
					}
					else if(player==2&&pos[15]==2)
						break;
					else if(player==2&&pos[15]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i16.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i16.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[15]=0;
						}
					}
			
					break;
				}
			}
		});
		i17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[16]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[16]=1;
									i17.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[16]=3;
									}
									else
									{
										player=2;
									
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									
									}
								}
								else
								{
									i17.setImageResource(R.drawable.black);
									piece[2]--;
									pos[16]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[16]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[16]==0)
								break;
							else if(pos[15]!=0&&pos[17]!=0&&pos[19]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[16]==1||pos[16]==3)
									{
										i17.setImageResource(R.drawable.selectedred);
										prev=16;
										previ=i17;
										phase=3;
									}
								}
								else
								{
									if(pos[16]==2||pos[16]==4)
									{
										i17.setImageResource(R.drawable.selectedblack);
										prev=16;
										previ=i17;
										phase=3;
									}
								}
								
							}	
							break;
					
					case 3: if(pos[16]==0&&(prev==15||prev==17||prev==19))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[16]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i17.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[16]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i17.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[16]==0)
								break;
							else if(player==1&&pos[16]==1)
								break;
							else if(player==1&&pos[16]==2)
							{
								phase=1;
								player=2;
								i17.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[16]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[16]==2)
								break;
							else if(player==2&&pos[16]==1)
							{
								phase=1;
								player=1;
								i17.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[16]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[16]==0)
						break;
					else if(player==1&&pos[16]==1)
						break;
					else if(player==1&&pos[16]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i17.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i17.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[16]=0;
						}
					}
					else if(player==2&&pos[16]==2)
						break;
					else if(player==2&&pos[16]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i17.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i17.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[16]=0;
						}
					}
			
					break;
				}
			}
		});
		i18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[17]!=0)
								break;
							else
							{
								if(player==1)
								{
									i18.setImageResource(R.drawable.red);
									piece[1]--;
									pos[17]=1;
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[17]=3;
									}
									else
									{
										player=2;	
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");	
									}
								}
								else
								{
									i18.setImageResource(R.drawable.black);
									piece[2]--;
									pos[17]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[17]=4;
									}
									else
									{
										player=1;
									
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
										
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[17]==0)
								break;
							else if(pos[16]!=0&&pos[12]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[17]==1||pos[17]==3)
									{
										i18.setImageResource(R.drawable.selectedred);
										prev=17;
										previ=i18;
										phase=3;
									}
								}
								else
								{
									if(pos[17]==2||pos[17]==4)
									{
										i18.setImageResource(R.drawable.selectedblack);
										prev=17;
										previ=i18;
										phase=3;
									}
								}
								
							}	
							break;
							
					case 3: if(pos[17]==0&&(prev==16||prev==12))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[17]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i18.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[17]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i18.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[17]==0)
								break;
							else if(player==1&&pos[17]==1)
								break;
							else if(player==1&&pos[17]==2)
							{
								phase=1;
								player=2;
								i18.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[17]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[17]==2)
								break;
							else if(player==2&&pos[17]==1)
							{
								phase=1;
								player=1;
								i18.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[17]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
					
								}
							}
						
							break;
							
					case 5:	if(pos[17]==0)
						break;
					else if(player==1&&pos[17]==1)
						break;
					else if(player==1&&pos[17]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i18.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i18.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[17]=0;
						}
					}
					else if(player==2&&pos[17]==2)
						break;
					else if(player==2&&pos[17]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i18.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i18.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[17]=0;
						}
					}
			
					break;
				}
			}
		});
		i19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[18]!=0)
								break;
							else
							{
								if(player==1)
								{
									i19.setImageResource(R.drawable.red);
									piece[1]--;
									pos[18]=1;
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[18]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i19.setImageResource(R.drawable.black);
									piece[2]--;
									pos[18]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[18]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[18]==0)
								break;
							else if(pos[10]!=0&&pos[19]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[18]==1||pos[18]==3)
									{
										i19.setImageResource(R.drawable.selectedred);
										prev=18;
										previ=i19;
										phase=3;
									}
								}
								else
								{
									if(pos[18]==2||pos[18]==4)
									{
										i19.setImageResource(R.drawable.selectedblack);
										prev=18;
										previ=i19;
										phase=3;
									}
								}
								
							}	
							break;
							
					case 3: if(pos[18]==0&&(prev==10||prev==19))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[18]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i19.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[18]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i19.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[18]==0)
								break;
							else if(player==1&&pos[18]==1)
								break;
							else if(player==1&&pos[18]==2)
							{
								phase=1;
								player=2;
								i19.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[18]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[18]==2)
								break;
							else if(player==2&&pos[18]==1)
							{
								phase=1;
								player=1;
								i19.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[18]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
				
								}
							}
						
							break;
							
					case 5:	if(pos[18]==0)
						break;
					else if(player==1&&pos[18]==1)
						break;
					else if(player==1&&pos[18]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i19.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i19.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[18]=0;
						}
					}
					else if(player==2&&pos[18]==2)
						break;
					else if(player==2&&pos[18]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i19.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i19.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[18]=0;
						}
					}
			
					break;
				}
			}
		});
		i20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[19]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[19]=1;
									i20.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[19]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i20.setImageResource(R.drawable.black);
									piece[2]--;
									pos[19]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[19]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[19]==0)
								break;
							else if(pos[16]!=0&&pos[18]!=0&&pos[20]!=0&&pos[22]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[19]==1||pos[19]==3)
									{
										i20.setImageResource(R.drawable.selectedred);
										prev=19;
										previ=i20;
										phase=3;
									}
								}
								else
								{
									if(pos[19]==2||pos[19]==4)
									{
										i20.setImageResource(R.drawable.selectedblack);
										prev=19;
										previ=i20;
										phase=3;
									}
								}
								
							}	
							break;
					
					case 3: if(pos[19]==0&&(prev==16||prev==18||prev==20||prev==22))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[19]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i20.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[19]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i20.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[19]==0)
								break;
							else if(player==1&&pos[19]==1)
								break;
							else if(player==1&&pos[19]==2)
							{
								phase=1;
								player=2;
								i20.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[19]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[19]==2)
								break;
							else if(player==2&&pos[19]==1)
							{
								phase=1;
								player=1;
								i20.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[19]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
								
								}
							}
						
							break;
							
					case 5:	if(pos[19]==0)
						break;
					else if(player==1&&pos[19]==1)
						break;
					else if(player==1&&pos[19]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i20.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i20.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[19]=0;
						}
					}
					else if(player==2&&pos[19]==2)
						break;
					else if(player==2&&pos[19]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i20.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i20.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[19]=0;
						}
					}
			
					break;
				}
			}
		});
		i21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[20]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[20]=1;
									i21.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[20]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i21.setImageResource(R.drawable.black);
									piece[2]--;
									pos[20]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[20]=4;
									}
									else
									{
										player=1;	
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
										
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[20]==0)
								break;
							else if(pos[13]!=0&&pos[19]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[20]==1||pos[20]==3)
									{
										i21.setImageResource(R.drawable.selectedred);
										prev=20;
										previ=i21;
										phase=3;
									}
								}
								else
								{
									if(pos[20]==2||pos[20]==4)
									{
										i21.setImageResource(R.drawable.selectedblack);
										prev=20;
										previ=i21;
										phase=3;
									}
								}
								
							}	
							break;
						
					case 3: if(pos[20]==0&&(prev==13||prev==19))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[20]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i21.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[20]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i21.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[20]==0)
								break;
							else if(player==1&&pos[20]==1)
								break;
							else if(player==1&&pos[20]==2)
							{
								phase=1;
								player=2;
								i21.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[20]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[20]==2)
								break;
							else if(player==2&&pos[20]==1)
							{
								phase=1;
								player=1;
								i21.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[20]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[20]==0)
						break;
					else if(player==1&&pos[20]==1)
						break;
					else if(player==1&&pos[20]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i21.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i21.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[20]=0;
						}
					}
					else if(player==2&&pos[20]==2)
						break;
					else if(player==2&&pos[20]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i21.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i21.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[20]=0;
						}
					}
			
					break;
				}
			}
		});
		i22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[21]!=0)
								break;
							else
							{
								if(player==1)
								{
									i22.setImageResource(R.drawable.red);
									piece[1]--;
									pos[21]=1;
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[21]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i22.setImageResource(R.drawable.black);
									piece[2]--;
									pos[21]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[21]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
									
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[21]==0)
								break;
							else if(pos[9]!=0&&pos[22]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[21]==1||pos[21]==3)
									{
										i22.setImageResource(R.drawable.selectedred);
										prev=21;
										previ=i22;
										phase=3;
									}
								}
								else
								{
									if(pos[21]==2||pos[21]==4)
									{
										i22.setImageResource(R.drawable.selectedblack);
										prev=21;
										previ=i22;
										phase=3;
									}
								}
								
							}	
							break;
					
					case 3: if(pos[21]==0&&(prev==22||prev==9))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[21]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i22.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[21]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i22.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[21]==0)
								break;
							else if(player==1&&pos[21]==1)
								break;
							else if(player==1&&pos[21]==2)
							{
								phase=1;
								player=2;
								i22.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[21]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[21]==2)
								break;
							else if(player==2&&pos[21]==1)
							{
								phase=1;
								player=1;
								i22.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[21]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[21]==0)
						break;
					else if(player==1&&pos[21]==1)
						break;
					else if(player==1&&pos[21]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i22.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i22.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[21]=0;
						}
					}
					else if(player==2&&pos[21]==2)
						break;
					else if(player==2&&pos[21]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i22.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i22.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[21]=0;
						}
					}
			
					break;
				}
			}
		});
		i23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[22]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[22]=1;
									i23.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[22]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i23.setImageResource(R.drawable.black);
									piece[2]--;
									pos[22]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[22]=4;
									}
									else
									{
										player=1;	
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[22]==0)
								break;
							else if(pos[19]!=0&&pos[21]!=0&&pos[23]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[22]==1||pos[22]==3)
									{
										i23.setImageResource(R.drawable.selectedred);
										prev=22;
										previ=i23;
										phase=3;
									}
								}
								else
								{
									if(pos[22]==2||pos[22]==4)
									{
										i23.setImageResource(R.drawable.selectedblack);
										prev=22;
										previ=i23;
										phase=3;
									}
								}
								
							}	
							break;
							
					case 3: if(pos[22]==0&&(prev==19||prev==21||prev==23))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[22]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i23.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[22]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i23.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[22]==0)
								break;
							else if(player==1&&pos[22]==1)
								break;
							else if(player==1&&pos[22]==2)
							{
								phase=1;
								player=2;
								i23.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[22]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[22]==2)
								break;
							else if(player==2&&pos[22]==1)
							{
								phase=1;
								player=1;
								i23.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[22]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[22]==0)
						break;
					else if(player==1&&pos[22]==1)
						break;
					else if(player==1&&pos[22]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i23.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i23.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[22]=0;
						}
					}
					else if(player==2&&pos[22]==2)
						break;
					else if(player==2&&pos[22]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i23.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i23.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[22]=0;
						}
					}
			
					break;
				}
			}
		});
		i24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(phase)
				{
					case 1: if(pos[23]!=0)
								break;
							else
							{
								if(player==1)
								{
									piece[1]--;
									pos[23]=1;
									i24.setImageResource(R.drawable.red);
									if(ismill(1))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[23]=3;
									}
									else
									{
										player=2;
										drawable = res.getDrawable(R.drawable.back);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.RED);
										t1.setText("Player BLACK");
									}
								}
								else
								{
									i24.setImageResource(R.drawable.black);
									piece[2]--;
									pos[23]=2;
									if(ismill(2))
									{
										Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
										phase=4;
										pos[23]=4;
									}
									else
									{
										player=1;
										drawable = res.getDrawable(R.drawable.redback);
										rl.setBackgroundDrawable(drawable);
										t1.setTextColor(Color.BLACK);
										t1.setText("Player RED");
										if(piece[2]==0)
										{
											phase=2;
											Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
											
										}
									}
								}
							}
						
						
							break;
							
					case 2: if(pos[23]==0)
								break;
							else if(pos[14]!=0&&pos[22]!=0)
								break;
							else
							{
								if(player==1)
								{
									if(pos[23]==1||pos[23]==3)
									{
										i24.setImageResource(R.drawable.selectedred);
										prev=23;
										previ=i24;
										phase=3;
									}
								}
								else
								{
									if(pos[23]==2||pos[23]==4)
									{
										i24.setImageResource(R.drawable.selectedblack);
										prev=23;
										previ=i24;
										phase=3;
									}
								}
								
							}	
							break;
							
					case 3: if(pos[23]==0&&(prev==14||prev==22))
					{
						if(player==1)
						{
							isalreadymill(1,prev);
							pos[23]=1;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i24.setImageResource(R.drawable.red);
							if(ismill(1))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=2;
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
							}
						}
						else
						{
							isalreadymill(2,prev);
							pos[23]=2;
							pos[prev]=0;
							previ.setImageResource(R.drawable.empty);
							i24.setImageResource(R.drawable.black);
							if(ismill(2))
							{
								Toast.makeText(NewGame.this, "MILL FORMED!!\nSelect Opponent's Piece To Remove", Toast.LENGTH_LONG).show();
								phase=5;
							}
							else
							{
								phase=2;
								player=1;
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
							}
						}
					}
					break;		
							
					case 4: if(pos[23]==0)
								break;
							else if(player==1&&pos[23]==1)
								break;
							else if(player==1&&pos[23]==2)
							{
								phase=1;
								player=2;
								i24.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.back);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.RED);
								t1.setText("Player BLACK");
								pos[23]=0;
								score[2]-=1;
							}
							else if(player==2&&pos[23]==2)
								break;
							else if(player==2&&pos[23]==1)
							{
								phase=1;
								player=1;
								i24.setImageResource(R.drawable.empty);
								drawable = res.getDrawable(R.drawable.redback);
								rl.setBackgroundDrawable(drawable);
								t1.setTextColor(Color.BLACK);
								t1.setText("Player RED");
								pos[23]=0;
								score[1]-=1;
								if(piece[2]==0)
								{
									phase=2;
									Toast.makeText(NewGame.this, "PHASE 2", Toast.LENGTH_LONG).show();
									
								}
							}
						
							break;
							
					case 5:	if(pos[23]==0)
						break;
					else if(player==1&&pos[23]==1)
						break;
					else if(player==1&&pos[23]==2)
					{
						score[2]-=1;
						if(score[2]<3)
						{
							i24.setImageResource(R.drawable.empty);
							endgame(1);
						}
						else
						{
							phase=2;
							player=2;
							i24.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.back);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.RED);
							t1.setText("Player BLACK");
							pos[23]=0;
						}
					}
					else if(player==2&&pos[23]==2)
						break;
					else if(player==2&&pos[23]==1)
					{
						score[1]-=1;
						if(score[1]<3)
						{
							i24.setImageResource(R.drawable.empty);
							endgame(2);
						}
						else
						{
							phase=2;
							player=1;
							i24.setImageResource(R.drawable.empty);
							drawable = res.getDrawable(R.drawable.redback);
							rl.setBackgroundDrawable(drawable);
							t1.setTextColor(Color.BLACK);
							t1.setText("Player RED");
							pos[23]=0;
						}
					}
			
					break;
				}
			}
		});
	}
	boolean ismill(int player){
		for(int i=0;i<24;i+=3){
			if (pos[i] == pos[i+1] && pos[i+1] == pos[i+2] && pos[i+2] == player)
			{
				pos[i]=pos[i+1]=pos[i+2]=player+2;
				return true;
			}
		}
		if(pos[0]==pos[9]&&pos[9]==pos[21]&&pos[21]==player)
		{
			pos[0]=pos[9]=pos[21]=player+2;
			return true;
		}
		if(pos[3]==pos[10]&&pos[10]==pos[18]&&pos[18]==player)
		{
			pos[3]=pos[10]=pos[18]=player+2;
			return true;
		}
		if(pos[6]==pos[11]&&pos[11]==pos[15]&&pos[15]==player)
		{
			pos[6]=pos[11]=pos[15]=player+2;
			return true;
		}
		if(pos[1]==pos[4]&&pos[4]==pos[7]&&pos[7]==player)
		{
			pos[1]=pos[4]=pos[7]=player+2;
			return true;
		}
		if(pos[16]==pos[19]&&pos[19]==pos[22]&&pos[22]==player)
		{
			pos[16]=pos[19]=pos[22]=player+2;
			return true;
		}
		if(pos[8]==pos[12]&&pos[12]==pos[17]&&pos[17]==player)
		{
			pos[8]=pos[12]=pos[17]=player+2;
			return true;
		}
		if(pos[5]==pos[13]&&pos[13]==pos[20]&&pos[20]==player)
		{
			pos[5]=pos[13]=pos[20]=player+2;
			return true;
		}
		if(pos[2]==pos[14]&&pos[14]==pos[23]&&pos[23]==player)
		{
			pos[2]=pos[14]=pos[23]=player+2;
			return true;
		}
		return false;
	}
	void isalreadymill(int player,int position){
		player+=2;
		if(position==0||position==1||position==2){
			if(pos[0]==player&&pos[1]==player&&pos[2]==player){
				pos[0]=pos[1]=pos[2]=player-2;
			}
		}
		if(position==3||position==4||position==5){
			if(pos[3]==player&&pos[4]==player&&pos[5]==player){
				pos[3]=pos[4]=pos[5]=player-2;
			}
		}
		if(position==6||position==7||position==8){
			if(pos[6]==player&&pos[7]==player&&pos[8]==player){
				pos[6]=pos[7]=pos[8]=player-2;
			}
		}
		if(position==9||position==10||position==11){
			if(pos[9]==player&&pos[10]==player&&pos[11]==player){
				pos[9]=pos[10]=pos[11]=player-2;
			}
		}
		if(position==12||position==13||position==14){
			if(pos[12]==player&&pos[13]==player&&pos[14]==player){
				pos[12]=pos[13]=pos[14]=player-2;
			}
		}
		if(position==15||position==16||position==17){
			if(pos[15]==player&&pos[16]==player&&pos[17]==player){
				pos[15]=pos[16]=pos[17]=player-2;
			}
		}
		if(position==18||position==19||position==20){
			if(pos[18]==player&&pos[19]==player&&pos[20]==player){
				pos[18]=pos[19]=pos[20]=player-2;
			}
		}
		if(position==21||position==22||position==23){
			if(pos[21]==player&&pos[22]==player&&pos[23]==player){
				pos[21]=pos[22]=pos[23]=player-2;
			}
		}
		if(position==0||position==9||position==21){
			if(pos[0]==player&&pos[9]==player&&pos[21]==player){
				pos[0]=pos[9]=pos[21]=player-2;
			}
		}
		if(position==3||position==10||position==18){
			if(pos[3]==player&&pos[10]==player&&pos[18]==player){
				pos[3]=pos[18]=pos[10]=player-2;
			}
		}
		if(position==6||position==11||position==15){
			if(pos[6]==player&&pos[11]==player&&pos[15]==player){
				pos[6]=pos[11]=pos[15]=player-2;
			}
		}
		if(position==1||position==4||position==7){
			if(pos[1]==player&&pos[4]==player&&pos[7]==player){
				pos[1]=pos[4]=pos[7]=player-2;
			}
		}
		if(position==16||position==19||position==22){
			if(pos[16]==player&&pos[19]==player&&pos[22]==player){
				pos[16]=pos[19]=pos[22]=player-2;
			}
		}
		if(position==8||position==12||position==17){
			if(pos[8]==player&&pos[12]==player&&pos[17]==player){
				pos[8]=pos[12]=pos[17]=player-2;
			}
		}
		if(position==5||position==13||position==20){
			if(pos[5]==player&&pos[13]==player&&pos[20]==player){
				pos[5]=pos[13]=pos[20]=player-2;
			}
		}
		if(position==2||position==14||position==23){
			if(pos[2]==player&&pos[14]==player&&pos[23]==player){
				pos[2]=pos[14]=pos[23]=player-2;
			}
		}
	}
	void endgame(int player)
	{
		if(player==1)
		{
			Toast.makeText(NewGame.this, "Player RED Wins!!!!", Toast.LENGTH_LONG).show();
			t1.setText("Player RED Wins!!!!");
		}
		else
		{
			Toast.makeText(NewGame.this, "Player BLACK Wins!!!!", Toast.LENGTH_LONG).show();
			t1.setText("Player BLACK Wins!!!!");
		}
		Intent fin = new Intent(NewGame.this,GLexample2.class);
		startActivity(fin);
		b1.setVisibility(View.VISIBLE);
		b1.setText("Tap For Main Menu");
		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent main = new Intent(NewGame.this,MainActivity.class);
				startActivity(main);
				finish();
			}
		});
	}
}
