class CalculatorRunner < Calculator
	def initialize
		cal = Calculator.new
		cal.input
		cal.calculate
		cal.output
	end
end
