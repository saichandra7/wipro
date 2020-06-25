package com.wipro.Interfaces.live;
import com.wipro.Interfaces.music.Playable;
import com.wipro.Interfaces.music.String.Veena;
import com.wipro.Interfaces.music.wind.Saxophone;

public class Test {
	public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps; 
        pv = new Veena();
        ps = new Saxophone();
        v.play(); 
        s.play(); 
        pv.play(); 
        ps.play();
}
}