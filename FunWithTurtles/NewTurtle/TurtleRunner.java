

public class TurtleRunner
{
	public static void main(String args[])
	{  
		//create a world for your turtles
		World turtleWorld = new World(600,800);	
		
		//create your first turtle
		Turtle bob = new Turtle(turtleWorld);
		
		//move the turtle forward
		bob.shapeMake(5, 50); 
	} 
}
