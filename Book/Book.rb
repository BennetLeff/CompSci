class Book
	attr_accessor :bookName
	attr_accessor :bookISBN

	def BookMake
		@bookName = "The Chronicles of Jameslandia"
		@bookISBN = rand.to_s[1..10] 
		@bookISBN = @bookISBN[1..-1]
		self.BookShow
	end

	def BookShow
		puts "The name is: " +  @bookName
		puts "The ISBN is: " +  @bookISBN
	end
end	

book = Book.new
book.BookMake
