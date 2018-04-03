package trade.winquant.jsc_wallet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class JSCFragmentPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList;

    public JSCFragmentPagerAdapter(FragmentManager manager) {
        super(manager);
        mFragmentList = new ArrayList<Fragment>();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }

}