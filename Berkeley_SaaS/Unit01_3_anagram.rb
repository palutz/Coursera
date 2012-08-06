    def combine_anagrams(words)
      myHash = Hash.new
      words.each { |ww|
        akey = ww.downcase.scan(/./).sort.to_s
       
        if myHash.key?(akey) then
          myHash[akey] << ww
        else
          myHash[akey] = [ww]
        end
      }
     
      return myHash.values
    end
