    class RandomSequence
      def initialize(limit,num)
        @limit,@num = limit,num
      end
      def each
        @num.times { yield (rand * @limit).floor }
      end
    end
     
    n = RandomSequence.new(10,4)
