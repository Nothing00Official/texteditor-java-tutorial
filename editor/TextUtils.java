import java.awt.Font;

public class TextUtils{
  
  private Gui gui;
  
  public TextUtils(Gui gui){
	  this.gui=gui;
  }
  
  public void setSize(int n){
	Font font = this.gui.text.getFont();
	float size = (n*3);
	this.gui.text.setFont(font.deriveFont(size));
  }
  
}