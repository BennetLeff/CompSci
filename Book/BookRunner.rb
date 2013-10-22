require './Book.rb'
class BookRunner < Book
	def bookrun
		book1 = Book.new("The Great History of James", 901920300)
		book1.inspect
		puts "16"
	end
end
