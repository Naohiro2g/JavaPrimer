package kuromoji_demo;

import com.atilika.kuromoji.ipadic.neologd.Token;
import com.atilika.kuromoji.ipadic.neologd.Tokenizer;
import java.util.List;

public class KuromojiDemo {
	public static void main(String[] args) {
		String sentences[] = {
				"お寿司が食べたい。",
				"お好み焼きが食べ放題の店がある。",
				"象は鼻が長い。",
				"くりぃむしちゅーは、上田晋也と有田哲平の2人からなる日本のお笑いコンビ",
				"艦隊これくしょんは、角川ゲームスが開発し、DMM.comが配信しているブラウザゲーム",
				"隣の客はよく柿食う客だ",
				"すもももももももものうち",
				"かまいたちは、吉本興業東京本社に所属する山内健司と濱家隆一からなる日本のお笑いコンビ。キングオブコント2017王者、M-1グランプリ2019準優勝。マネージャーは樺澤まどかである。"
		};

		for (String sentence : sentences) {
			Tokenizer tokenizer = new Tokenizer();
			//			List<Token> tokens = tokenizer.tokenize("お好み焼きが食べ放題の店がある。");
			List<Token> tokens = tokenizer.tokenize(sentence);
			for (Token token : tokens) {
				System.out.println(token.getSurface() + "   \t" + token.getAllFeatures());
				//			System.out.println("position : " + token.getPosition());
				//			System.out.println("reading : " + token.getReading());
				//			System.out.println("辞書にある言葉? : " + token.isKnown());
				//			System.out.println("ユーザ定義? : " + token.isUser());
				System.out.println("================================");
			}
		}
	}
}
