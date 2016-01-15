import java.awt.Graphics;

import java.util.Stack;

public class test extends java.applet.Applet {

   private LogoPrimitives l;

private Stack<Integer> repcount = new Stack<Integer>();

   public void paint(Graphics g) {
      l = new LogoPrimitives(this);

      l.st();
      for(repcount.push(0); repcount.peek() <= (5); repcount.push(repcount.pop() + 1)){
	l.fd(5);
	l.lt(repcount.peek());
	l.wait(20);
	for(repcount.push(0); repcount.peek() <= (5); repcount.push(repcount.pop() + 1)){
	l.fd(5);
	l.lt(repcount.peek());
	l.wait(20);
	for(repcount.push(0); repcount.peek() <= (5); repcount.push(repcount.pop() + 1)){
	for(repcount.push(0); repcount.peek() <= (5); repcount.push(repcount.pop() + 1)){
	l.fd(5);
	l.lt(repcount.peek());
	l.wait(20);
}
repcount.pop();
}
repcount.pop();
}
repcount.pop();
}
repcount.pop();
   }
}
