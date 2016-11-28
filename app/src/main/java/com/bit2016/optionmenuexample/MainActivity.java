package com.bit2016.optionmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Context Menu를 위한 초기화
        registerForContextMenu( findViewById( android.R.id.content ) );
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 이런 방법이 있으나 주로 xml을 사용하므로 이거 잘 안쓴다!!
//        menu.add(Menu.NONE, 0, 0, "Menu1");
//        menu.add(Menu.NONE, 1, 1, "Menu2");
//        return super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
//        return super.onContextItemSelected(item);
        return onOptionsItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        String title = item.getTitle().toString();
        switch(id) {
            case R.id.menu_refresh: {
                Toast.makeText(this, title + " Selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_search: {
                Toast.makeText(this, title + " Selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_copy: {
                Toast.makeText(this, title + " Selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_cut: {
                Toast.makeText(this, title + " Selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_paste: {
                Toast.makeText(this, title + " Selected", Toast.LENGTH_LONG).show();
                break;
            }
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
