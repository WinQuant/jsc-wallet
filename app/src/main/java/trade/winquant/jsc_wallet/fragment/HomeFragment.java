package trade.winquant.jsc_wallet.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.sql.Date;
import java.util.List;

import trade.winquant.jsc_wallet.R;
import trade.winquant.jsc_wallet.adapter.NewsAdapter;
import trade.winquant.jsc_wallet.fragment.BaseFragment;
import trade.winquant.jsc_wallet.model.News;

public class HomeFragment extends BaseFragment {

    private static final String TAG = "Home";
    private View homeView;
    private ListView newsListView;
    private NewsAdapter newsAdapter;
    private List<News> newsList;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeView = inflater.inflate(R.layout.fragment_home, container, false);
        newsListView = homeView.findViewById(R.id.list_news);
        newsAdapter  = new NewsAdapter(getActivity(), R.layout.component_news_item, newsList);
        return homeView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initEvent();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void initView() {

    }

    private void initData() {
        // TODO load from server
        News news1 = new News(1, "JSC", "Hello", "This is the first",
                "hello hi", Date.valueOf("2018-03-31"), Date.valueOf("2018-03-30"));
        News news2 = new News(1, "JSC", "World", "This is the first",
                "hello hi", Date.valueOf("2018-03-31"), Date.valueOf("2018-03-30"));

        newsList.add(news1);
        newsList.add(news2);
    }

    private void initEvent() {

    }
}
