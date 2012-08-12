-# app/views/movies/show.html.haml

%h2 Details about #{@movie.title}

%ul
  %li
    Rating:
    = @movie.rating
  %li
    Released on:
    = @movie.release_date.strftime("%B %d, %Y")

%h3 Description:

%p= @movie.description