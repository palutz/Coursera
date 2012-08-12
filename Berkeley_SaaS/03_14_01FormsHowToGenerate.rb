%h1 Create New Movie

= form_tag movies_path do
-# <form action="/movies" method="post">
  
  = label :movie, :title, 'Title'
  -# <label for="movie_title">Title</label>

  = text_field :movie, 'title'
  -# <input id="movie_title" name="movie[title]" size="30" type="text" />

  = select :movie, :rating, ['G','PG','PG-13','R','NC-17']
  -# <select id="movie_rating" name="movie[rating]">
  -#   <option value="G">G</option>
  -#   <option value="PG">PG</option>
  -#   ...etc...
  -# </select>

  = submit_tag 'Save Changes'
  -# <input name="commit" type="submit" value="Save Changes" />