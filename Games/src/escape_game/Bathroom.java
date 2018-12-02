package escape_game;

import java.awt.Image;
import java.awt.image.ImageObserver;
import java.net.URL;

public class Bathroom extends Field{

	private Image bathroom = null;
	private Image timer = null;

	private boolean latt = false; //timerを見ている

	private Mainpro mainpro = null;

	//もの
	public static final String DOOR_TO_Datuijo = "door_to_datuijo";
	public static final String Bathtub = "bathtub";
	public static final String BATH_CHAIR = "bath_chair";
	public static final String TIMER = "timer";
	//場所
	public static final String WALL = "wall";
	public static final String INSIDE = "inside";
	
	public Bathroom(Mainpro mainpro) {
		this.mainpro = mainpro;
	}
	
	@Override
	boolean is_character_in(int cx, int cy) {
		String here = here(cx, cy);
		if(here.equals("inside")) {
			return true;
		} else if(here.equals("Bathroom->Datuijo")) {
			return true;
		}
		return false;
	}

	@Override
	String here(int cx, int cy) {
		// TODO 自動生成されたメソッド・スタブ
		return INSIDE;
	}

	@Override
	void examine_result(String ex_result) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	void examine_effect(String examine_point, String item) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	String return_text() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	boolean final_text() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	String hint() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	void showMap(ImageObserver field) {
		mainpro.buffer.drawImage(bathroom, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		
	}

	@Override
	void setImages(URL codeBase) {
		bathroom = mainpro.getImage(codeBase, "../material_data/escape_game/bathroom/bathroom.png");
		
	}

	@Override
	public String toString() {
		return "Bathroom";
	}

	@Override
	void setFlagTrue(String flagString) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
