a = ["apple", "banana", "apple", "cherry"].each do |string|
  puts string
end
puts
puts "sorting a"
b = a.sort
puts b
puts
puts "sorting a reverse"
b = a.sort.reverse
puts b
puts
puts "sorting a unique"
b = a.sort.uniq
puts b
puts
puts "trying map"
a.map do |fruit|
  puts fruit
end
puts
puts "improved map"
b = a.map do |fruit|
  fruit.reverse
end.sort
puts b
