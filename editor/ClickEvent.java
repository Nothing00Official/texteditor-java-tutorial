import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ClickEvent implements ActionListener{
	
	private Gui gui;
    
	public ClickEvent(Gui gui){
		this.gui = gui;
	}
	
	public void actionPerformed(ActionEvent e){
		FileManager fm = new FileManager(this.gui.getText());
		String cmd = e.getActionCommand();
		switch(cmd){
			case "Taglia":
			 this.gui.text.cut();
			break;
			case "Copia":
			 this.gui.text.copy();
			break;
			case "Incolla":
			 this.gui.text.paste();
			break;
			case "Salva":
			 JOptionPane.showMessageDialog(null, fm.save());
			break;
			case "Apri":
			  if(!fm.loadFileText())
			   JOptionPane.showMessageDialog(null, fm.getCurrentText());
		      else
			   this.gui.text.setText(fm.getCurrentText());
			break;
			case "Nuovo":
			 this.gui.text.setText("");
			break;
			default:
			 TextUtils ut = new TextUtils(this.gui);
			 ut.setSize(Integer.parseInt(cmd));
			break;
		}
	}

}