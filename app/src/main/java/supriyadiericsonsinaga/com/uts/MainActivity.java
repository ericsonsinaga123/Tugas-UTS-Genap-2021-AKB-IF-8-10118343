package supriyadiericsonsinaga.com.uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    // 06/06/2021 10118343 Supriyadi Ericson Sinaga IF8

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemReselectedListener navigation = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected( MenuItem item) {
            Fragment f =null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new FragmentHome();
                    break;
                case R.id.menu_image:
                    f = new FragmentImage();
                    break;
                case R.id.menu_note:
                    f = new FragmentNote();
                    break;
                case R.id.menu_info:
                    f = new FragmentInfo();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,f).commit();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemReselectedListener(navigation);
    }
}