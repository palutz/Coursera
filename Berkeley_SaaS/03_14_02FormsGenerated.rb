<h1>Create New Movie</h1>
<form action="/movies" method="post">
  <label for="movie_title">Title</label>
  <input id="movie_title" name="movie[title]" size="30" type="text" />
  <label for="movie_rating">Rating</label>
  <select id="movie_rating" name="movie[rating]">
    <option value="G">G</option>
    <option value="PG">PG</option>
    <option value="PG-13">PG-13</option>
  </select>
  <label for="movie_release_date">Released On</label>
  <select id="movie_release_date_1i" name="movie[release_date(1i)]">
    <option value="2011">2011</option>
    <option selected="selected" value="2012">2012</option>
    <option value="2013">2013</option>
  </select>
  <select id="movie_release_date_2i" name="movie[release_date(2i)]">
    <option value="1">January</option>
    <option selected="selected" value="2">February</option>
    <option value="3">March</option>
  </select>
  <select id="movie_release_date_3i" name="movie[release_date(3i)]">
    <option value="1">1</option>
    <option selected="selected" value="2">2</option>
    <option value="3">3</option>
  </select>
  <input name="commit" type="submit" value="Save Changes" />
</form>