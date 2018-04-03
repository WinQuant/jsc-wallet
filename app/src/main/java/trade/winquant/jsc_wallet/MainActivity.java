package trade.winquant.jsc_wallet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import trade.winquant.jsc_wallet.fragment.*;
import trade.winquant.jsc_wallet.util.BottomNavigationViewInspector;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener,
                   BottomNavigationView.OnNavigationItemReselectedListener {

    private ViewPager viewPager;
    private MenuItem menuItem;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setOnNavigationItemReselectedListener(this);

        BottomNavigationViewInspector.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.item_home:
                            viewPager.setCurrentItem(0);
                            break;
                        case R.id.item_market:
                            viewPager.setCurrentItem(1);
                            break;
                        case R.id.item_trade:
                            viewPager.setCurrentItem(2);
                            break;
                        case R.id.item_asset:
                            viewPager.setCurrentItem(3);
                            break;
                        case R.id.item_account:
                            viewPager.setCurrentItem(4);
                            break;
                    }
                    return false;
                }
            });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                menuItem = bottomNavigationView.getMenu().getItem(position);
                menuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        JSCFragmentPagerAdapter adapter = new JSCFragmentPagerAdapter(getSupportFragmentManager());

        // TODO recover the right layout.
        adapter.addFragment(HomeFragment.getInstance(HomeFragment.class, null));
        adapter.addFragment(HomeFragment.getInstance(HomeFragment.class, null));
        adapter.addFragment(HomeFragment.getInstance(HomeFragment.class, null));
        adapter.addFragment(HomeFragment.getInstance(HomeFragment.class, null));
        adapter.addFragment(HomeFragment.getInstance(HomeFragment.class, null));
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        System.out.println( item.getItemId() );
        return true;
    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem item) {
        return;
    }

}
