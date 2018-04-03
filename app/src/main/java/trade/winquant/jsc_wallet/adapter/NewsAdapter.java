package trade.winquant.jsc_wallet.adapter;

import java.util.List;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import trade.winquant.jsc_wallet.R;
import trade.winquant.jsc_wallet.model.News;


public class NewsAdapter extends ArrayAdapter<News> {
    private int resource;

    public NewsAdapter(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
        this.resource = resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);
        View view;
        NewsItemViews news2view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resource, null);
            ImageView imgView = view.findViewById(R.id.news_img);
            TextView  authorView  = view.findViewById(R.id.news_author);
            TextView  titleView   = view.findViewById(R.id.news_title);
            TextView  summaryView = view.findViewById(R.id.news_summary);
            TextView  dateView    = view.findViewById(R.id.news_date);
            TextView  idView      = view.findViewById(R.id.news_id);
            news2view = new NewsItemViews(imgView, authorView, titleView, summaryView, dateView,
                    idView);
            view.setTag(news2view);
        } else {
            view = convertView;
            news2view = (NewsItemViews) view.getTag();
        }
        news2view.imgView.setImageURI(Uri.parse(news.getImgSrc()));
        news2view.titleView.setText(news.getTitle());
        news2view.summaryView.setText(news.getSummary());
        news2view.authorView.setText(news.getAuthor());
        news2view.dateView.setText(news.getCreatedTime());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getContext(), movie.getTitle() + "begin study", Toast.LENGTH_SHORT).show();
                System.out.println("News " + ((TextView)v.findViewById(R.id.news_id)).getText());
            }
        });
        return view;
    }
}

class NewsItemViews {
    ImageView imgView;
    TextView  authorView;
    TextView  titleView;
    TextView  summaryView;
    TextView  dateView;
    TextView  idView;

    public NewsItemViews(ImageView imgView, TextView authorView, TextView titleView,
                         TextView summaryView, TextView dateView, TextView idView) {
        this.imgView = imgView;
        this.authorView  = authorView;
        this.titleView   = titleView;
        this.summaryView = summaryView;
        this.dateView = dateView;
        this.idView   = idView;
    }
}