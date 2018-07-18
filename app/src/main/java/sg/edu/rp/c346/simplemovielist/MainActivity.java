package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LvMovie;
    ArrayList<MovieItem> alMovieList;
    private CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LvMovie = findViewById(R.id.ListViewMovie);

        alMovieList = new ArrayList<>();
        MovieItem item1 = new MovieItem("Avengers: Infinity War", "Release Date: April 2018", "PG13");
        MovieItem item2 = new MovieItem("Incredibles 2", "Release Date: June 2018",  "G");
        MovieItem item3 = new MovieItem("A Quiet Place", "Release Date: June 2018",  "NC16");
        MovieItem item4 = new MovieItem("Deadpool 2",  "Release Date: June 2018", "M18");

        alMovieList.add(item1);
        alMovieList.add(item2);
        alMovieList.add(item3);
        alMovieList.add(item4);


        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);
        LvMovie.setAdapter(caMovie);
    }
}
