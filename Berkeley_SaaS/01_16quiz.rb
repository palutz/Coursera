class Book
  attr_accessor :author
  attr_reader :title
  attr_writer  :comments
  def initialize(author, title)
    @author = author
    @title = title
    @comments = []
  end
end

book = Book.new("Chuck Palahniuk", "Fight Club")
puts book
book.comments = "#{book.title} was written by #{book.author}."
puts book.author
puts book.title

book.comments.each { |comment| puts comment }