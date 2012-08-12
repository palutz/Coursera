    # return every n'th element in an enumerable
    module Enumerable
      def every_nth(count)
        index = 0
        self.each do |elt|
          yield elt if index % count == 0
          index += 1
        end
      end
    end
     
    list = (1..10).to_a # make an array from a range
    list.every_nth(3) { |s| print "#{s}, " }
    # => 1, 4, 7, 10,
    list.every_nth(2) { |s| print "#{s}, " }
    # => 1, 3, 5, 7, 9,
