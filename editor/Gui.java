import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Gui extends JFrame{
	
	public JTextArea text;
	
	public Gui(String title){
		super(title);
		text = new JTextArea(); 
		add(text);	
        setJMenuBar(setupMenu());
        setSize(500, 500); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);			
	}
	
	private JMenuBar setupMenu(){
		JMenuBar mb = new JMenuBar();
		JMenu mfile = new JMenu("File"); 
        JMenuItem miNew = new JMenuItem("Nuovo"); 
		JMenuItem miOpen = new JMenuItem("Apri"); 
		JMenuItem miSave = new JMenuItem("Salva");
		mfile.add(miNew); 
		mfile.add(miOpen); 
		mfile.add(miSave); 
        miNew.addActionListener(new ClickEvent(this));
        miOpen.addActionListener(new ClickEvent(this));
        miSave.addActionListener(new ClickEvent(this));		
		
		JMenu medit = new JMenu("Modifica"); 	
        JMenuItem miCut = new JMenuItem("Taglia"); 
		JMenuItem miCopy = new JMenuItem("Copia"); 
		JMenuItem miPaste = new JMenuItem("Incolla"); 
        medit.add(miCut); 
		medit.add(miCopy); 
		medit.add(miPaste); 	
		miCut.addActionListener(new ClickEvent(this));
        miCopy.addActionListener(new ClickEvent(this));
        miPaste.addActionListener(new ClickEvent(this));

        JMenu msize = new JMenu("Size");	
        JMenuItem mi5 = new JMenuItem("5"); 
		JMenuItem mi10 = new JMenuItem("10"); 
		JMenuItem mi25 = new JMenuItem("25");	
        JMenuItem mi35 = new JMenuItem("35");	
        JMenuItem mi48 = new JMenuItem("48"); 
		JMenuItem mi55 = new JMenuItem("55"); 
		JMenuItem mi72 = new JMenuItem("72");		
        msize.add(mi5); 
		msize.add(mi10); 
		msize.add(mi25); 		
        msize.add(mi35);
        msize.add(mi48);
        msize.add(mi55);
        msize.add(mi72);  
        mi5.addActionListener(new ClickEvent(this));
        mi10.addActionListener(new ClickEvent(this));
        mi25.addActionListener(new ClickEvent(this)); 
        mi35.addActionListener(new ClickEvent(this));
        mi48.addActionListener(new ClickEvent(this));
        mi55.addActionListener(new ClickEvent(this)); 	
       	mi72.addActionListener(new ClickEvent(this)); 	
		   
        mb.add(mfile); 
		mb.add(medit); 
		mb.add(msize); 
        return mb;		
	}
	
	public String getText(){
		String str="";
		for(String line : text.getText().split("\\n"))
		  str+=line+"\n";
        return str;	  
	}

}