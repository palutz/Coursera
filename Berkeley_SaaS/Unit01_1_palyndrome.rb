def palindrome?(string)
    temp = string.downcase.gsub /[\W]/, ''
    temp == temp.reverse
end

def count_words(string)
     h = Hash.new(0)
     string.downcase.scan(/\w+/) { |word| h[word] += 1 }
     return h
end
