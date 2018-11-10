/*明日やります(commit test)*/
package escape_game;

import java.awt.Image;
import java.awt.image.ImageObserver;
import java.net.URL;

public class WC extends Field{

	//マップ
	private Image image_wc_benki = null;
	private Image image_wc_door = null;
	private Image image_wc_hint_triangle = null;
	private Image image_wc_base = null;
	private Image image_wc_window = null;
	private Image image_wc_mat = null;
	private Image imagae_wc_senmendai = null;

	private Mainpro mainpro;
	private boolean is_dk_door_open = true;

	public WC(Mainpro mainpro) {
		this.mainpro = mainpro;
	}

	@Override
	boolean is_character_in(int cx, int cy) {
		// TODO 自動生成されたメソッド・スタブ

		String here = here(cx,cy);
		if (here.equals("inside")) return true;
		else if (here.equals("door") && is_dk_door_open == true) {
			return true;
		}
		return false;
	}

	@Override
	String here(int cx, int cy) {
		// TODO 自動生成されたメソッド・スタブ
		return "inside";
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
		return "トイレだなぁ...";
	}

	@Override
	void showMap(ImageObserver field) {
		// TODO 自動生成されたメソッド・スタブ
		mainpro.buffer.drawImage(image_wc_base, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		mainpro.buffer.drawImage(image_wc_mat, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		mainpro.buffer.drawImage(imagae_wc_senmendai, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		mainpro.buffer.drawImage(image_wc_benki, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		mainpro.buffer.drawImage(image_wc_hint_triangle, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		mainpro.buffer.drawImage(image_wc_window, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		if (!is_dk_door_open) {
			mainpro.buffer.drawImage(image_wc_door, 0, 0, mainpro.screen_size_x, mainpro.screen_size_y-100, field);
		}
	}

	@Override
	void setImages(URL codeBase) {
		// TODO 自動生成されたメソッド・スタブ
		image_wc_benki         = mainpro.getImage(codeBase,"../material_data/escape_game/wc/benki.png");
		image_wc_door          = mainpro.getImage(codeBase,"../material_data/escape_game/wc/door.png");
		image_wc_hint_triangle = mainpro.getImage(codeBase, "../material_data/escape_game/wc/hint_triangle.png");
		image_wc_base          = mainpro.getImage(codeBase, "../material_data/escape_game/wc/wc_base.png");
		image_wc_window        = mainpro.getImage(codeBase, "../material_data/escape_game/wc/window.png");
		image_wc_mat           = mainpro.getImage(codeBase, "../material_data/escape_game/wc/mat.png");
		imagae_wc_senmendai    = mainpro.getImage(codeBase, "../material_data/escape_game/wc/senmendai.png");
	}

	@Override
	public String toString() {
		return "WC";
	}

	@Override
	void setFlagTrue(String flagString) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
