/* The Options Menu (the one that pops up on pressing the menu button on the emulator) 
 * can be customized to change the background of the menu */ 
package com.example.morris;



import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnItemClickListener {
	public static MediaPlayer sound ;
    String rule = "Game rules:\n\nThe board consists of a grid with twenty-four intersections or points. Each player has nine pieces, or men, usually coloured black and white. Players try to form 'mills' — three of their own men lined horizontally or vertically — allowing a player to remove an opponent's man from the game.\nA player wins by reducing the opponent to two pieces (where he could no longer form mills and thus be unable to win). If there are no legal moves available for either player, it is a Stalemate.\n\nThe game proceeds in three phases:\n\n1.placing men on vacant points\n2.moving men to adjacent points\n3.(optional phase) moving men to any vacant point when a player has been reduced to three men\n\n\nPhase One: Placing Pieces\n\nNine Men's Morris starts on an empty board. The players determine who plays first, then take turns placing their men one per play on empty points.\nIf a player is able to place three of his pieces in a straight line, vertically or horizontally, he has formed a mill and may remove one of his opponent's pieces from the board and the game.\nAny piece can be chosen for the removal, but a piece not in an opponent's mill must be selected, if possible.\n\n\nPhase Two: Moving Pieces\n\nPlayers continue to alternate moves, this time moving a man to an adjacent point. A piece may not jump another piece.\nPlayers continue to try to form mills and remove their opponent's pieces in the same manner as in phase one.\nA player may break a mill by moving one of his pieces out of an existing mill, then moving the piece back to form the same mill a second time (or any number of times), each time removing one of his opponent's men.\nThe act of removing an opponent's man is sometimes called pounding the opponent. When one player has been reduced to three men, phase three begins.\n\n\nPhase Three: Flying\n\nWhen a player is reduced to three pieces, there is no longer a limitation of moving to only adjacent points: The player's men may fly, hop,or jump from any point to any vacant point.\nSome rules sources say this is the way the game is played,some treat it as a variation,and some don't mention it at all.\nA 19th-century games manual calls this the truly rustic mode of playing the game. Flying was introduced to compensate when the weaker side is one man away from losing the game.";
    public static boolean s=true, pref=true;
    AlertDialog.Builder builder;
        private DrawerLayout drawerLayout; 
        private ListView listView; 
        private ActionBarDrawerToggle drawerListener; 
        private MyAdapter myAdapter ; 
        //public String [] options ; 
        
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("9 Men's Morris");   
        setContentView(R.layout.activity_main);
        myAdapter = new MyAdapter(this); 
       // options = getResources().getStringArray(R.array.options);
       // listView.setAdapter(myAdapter);
        sound = MediaPlayer.create(MainActivity.this,R.raw.backsound); 
        sound.start();
        ImageView i = (ImageView)findViewById(R.id.imageView1);
        i.setBackgroundResource(R.drawable.redblackback);

//        AnimationDrawable pro = (AnimationDrawable)i.getBackground();
//        pro.start();

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        //drawerLayout.openDrawer(Gravity.LEFT);
		drawerListener = new ActionBarDrawerToggle(this, drawerLayout,R.drawable.image, R.string.drawer_open, R.string.drawer_close){
		
			/*	@Override
			public void onDrawerOpened(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerOpened(drawerView);
				Toast.makeText(MainActivity.this," Drawer opened" , Toast.LENGTH_SHORT).show(); 
			}
			@Override
			public void onDrawerClosed(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerClosed(drawerView);
				Toast.makeText(MainActivity.this," Drawer close" , Toast.LENGTH_SHORT).show(); 

			}*/
		}; 
        
        listView = (ListView) findViewById(R.id.drawerList);
        //listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options));
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(this);
        drawerLayout.setDrawerListener(drawerListener); 
        getSupportActionBar().setHomeButtonEnabled(true); 
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        new Handler().postDelayed(openDrawerRunnable(), 1800);
    }
    
    private Runnable openDrawerRunnable() {
        return new Runnable() {

            @Override
            public void run() {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        };
    }
    
    @Override
    protected void onUserLeaveHint()
    {
    	sound.pause();
    	super.onUserLeaveHint();
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    // TODO Auto-generated method stub
    if(drawerListener.onOptionsItemSelected(item))
    		{
    	return true ; 
    		}
    	return super.onOptionsItemSelected(item);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
    // TODO Auto-generated method stub
    super.onConfigurationChanged(newConfig);
    drawerListener.onConfigurationChanged(newConfig);
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
    // TODO Auto-generated method stub
    super.onPostCreate(savedInstanceState);
    drawerListener.syncState();
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
	selectItem(arg2); 
	}
	@Override
	public void onBackPressed() {

	    android.os.Process.killProcess(android.os.Process.myPid());
	    // This above line close correctly
	}

	private void selectItem(int arg2) {
		// TODO Auto-generated method stub
		listView.setItemChecked(arg2, true);
		if(arg2 ==4)
			{
			sound.release();
			 finish(); 
			 
			}
		else if(arg2 == 2)
		{
			builder = new AlertDialog.Builder(MainActivity.this);
			builder.setTitle("Rules");
		    builder.setMessage(rule);
		    builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		               dialog.dismiss();
		           }
		       });
		    builder.show() ; 
		}
		else if(arg2 == 3)
		{
			Uri uri = Uri.parse("http://www.youtube.com/watch?v=INWIZH1FVx8");
			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(intent);
			sound.pause();
		}
		else if(arg2 == 1)
		{
			View checkBoxView = View.inflate(this, R.layout.checkbox, null);
			CheckBox checkBox = (CheckBox) checkBoxView.findViewById(R.id.checkbox);
			checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			    	if(!isChecked)
			    	{
			    		sound.pause();
			    		s=false;
			    		pref=false;
			    	}
			    	else if(isChecked&&s){}
			    	else if(isChecked&&!s)
			    	{
			    		sound.start();
			    		pref=true;
			    	}
			    }
			});
			if(pref)
				checkBox.setChecked(true);
			checkBox.setText("Sound");
			builder = new AlertDialog.Builder(MainActivity.this);
			builder.setTitle("Settings");
			builder.setView(checkBoxView);
			builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		               dialog.dismiss();
		           }
		       });
			builder.show();
		}
		else if(arg2 == 0)
		{
			Intent newGame = new Intent(MainActivity.this,NewGame.class); 
			startActivity(newGame);
		}
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		if(pref)
			sound.start();
		super.onResume();
	}
}
	class MyAdapter extends BaseAdapter {
		private Context context; 
		 private String []options;
		public int images[] = { 
				R.drawable.newgame,R.drawable.settings,R.drawable.rules,R.drawable.video,R.drawable.exit
		};
		public MyAdapter(Context context)
		{	this.context = context ; 
			options =  context.getResources().getStringArray(R.array.options); 
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return options.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			System.out.println(arg0);
			return options[arg0];
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			View row = null ; 
			if(arg1 == null)
			{	System.out.println("inside getview");
				LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
			row = inflater.inflate(R.layout.custom_row, arg2,false); 
			}
			else 
			{
				row = arg1 ; 
			}
			TextView titleTextView = (TextView) row.findViewById(R.id.textView1); 
			ImageView titleImageView = (ImageView)row.findViewById(R.id.imageView1); 
			titleTextView.setText(options[arg0]);
			titleImageView.setImageResource(images[arg0]);
			
			return row;
		}
		
	}

