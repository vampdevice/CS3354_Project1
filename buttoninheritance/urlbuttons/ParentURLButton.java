package buttoninheritance.urlbuttons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import buttoninheritance.ButtonUI;

// Parent class: URL Buttons
public class ParentURLButton extends ButtonUI implements ActionListener{
    protected String url;

    public ParentURLButton(String text, String url) {
        super(text);
        this.url = url;
        addActionListener(this);
        this.setBackground(Color.decode("#7c7f87"));
        this.setFocusable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        openBrowser(url);
    }

    protected void reNameButton(String name){
        this.setText(name);
    }
}


