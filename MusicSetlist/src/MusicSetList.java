import java.util.ArrayList;


public class MusicSetList {

	public static void main(String[] args) {

		ArrayList<String> music = new ArrayList<String>();
		music.add("青い太陽");
		music.add("ANTI-HERO");
		music.add("RPG");
		music.add("Eve");
		music.add("イルミネーション");
		music.add("illusion");
		music.add("インスタントラジオ");
		music.add("SOS");
		music.add("エデン");
		music.add("Error");
		music.add("カレイドスコープ");
		music.add("コードレスベイビー");
		music.add("最高到達点");
		music.add("サラバ");
		music.add("Fight Music");
		music.add("yume");
		music.add("アースチャイルド");
		music.add("Romantic");
		music.add("タイムマシン");
		music.add("バードマン");
		music.add("play");
		
		
		int[] num = new int[music.size()];
		System.out.print("聞きたい曲数を入力：");		
		int value = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("");
		System.out.print("本日の気分 (最高=1, いいね=2, ふつう=3)：");
		String fell = new java.util.Scanner(System.in).nextLine();
		
		if (fell.equals("1")) {
			num[0]=music.indexOf("最高到達点");
		} else if (fell.equals("2")) {
			num[0]=music.indexOf("バードマン");
		} else if (fell.equals("3")) {
			num[0]=music.indexOf("play");
		} else {
			num[0]=music.indexOf("Romantic");
		}
		
//		System.out.println("");
//		System.out.print("本日の天気(晴れ=1, 雨=2)：");
//		String weather = new java.util.Scanner(System.in).nextLine();
//		if(weather.equals("1")) {
//			num[2]=music.indexOf("バタフライエフェクト");
//		}else if(weather.equals("2")) {
//			num[2]=music.indexOf("RAIN");
//		}

		
		
		if (value > music.size()) {
			value = music.size();
		}

		for (int i = 2; i < music.size();) {
			int setList = new java.util.Random().nextInt(music.size());
			boolean f = true;
			for (int j = 0; j < i; j++) {
				if (setList == num[j])
					f = false;
			}
			if (f == true) {
				num[i] = setList;
				i++;
			}
		}

		for (int i = 0; i < value; i++) {
			System.out.println((i + 1) + "：" + music.get(num[i]));
		}
	}
}
