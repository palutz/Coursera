    class Dessert
      attr_accessor :name, :calories
      HEALTHY_CAL = 200
      def initialize(name, calories)
        @name = name
        @calories = calories
      end
     
      def healthy?
        @calories < HEALTHY_CAL
      end
     
      def delicious?
        true
      end
    end
     
    class JellyBean < Dessert
      NOT_DELICOIUS = Array["black licorice"]
      attr_accessor :flavor
      def initialize(name, calories, flavor)
        super(name,calories)
        @flavor = flavor.downcase
      end
     
      def delicious?
        if NOT_DELICOIUS.find{|item| item.eql? @flavor } then return false end
     
        return super
      end
    end
