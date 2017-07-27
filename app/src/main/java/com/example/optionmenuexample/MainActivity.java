package com.example.optionmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu( findViewById( android.R.id.content ) );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
//        menu.add( Menu.NONE, 0, 0, "Menu1" );
//        menu.add( Menu.NONE, 1, 1, "Menu2" );
//        menu.add( Menu.NONE, 2, 2, "Menu3" );
//        SubMenu etc = menu.addSubMenu( Menu.NONE, 3, 3, "ETC" );
//        etc.add( Menu.NONE, 4, 0, "SubMenu1" );
//        etc.add( Menu.NONE, 5, 1, "SubMenu2" );
//        etc.add( Menu.NONE, 6, 2, "SubMenu3" );
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        System.out.println( "=====> menu item:" + itemId + " selected" );
        switch( itemId ) {
            case R.id.main_menu1 :
                System.out.println( "Menu1 Selected!" );
                break;
            case R.id.main_menu2 :
                System.out.println( "Menu2 Selected!" );
                break;
            case R.id.main_menu5 :
                System.out.println( "Menu5 Selected!" );
                break;
            default :
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate( R.menu.menu_context, menu );
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        System.out.println( "======> context menu item select:" + itemId );
        return super.onContextItemSelected(item);
    }
}
