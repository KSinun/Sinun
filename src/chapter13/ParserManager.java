package chapter13;

public class ParserManager {
	public static parseable getParser(String type) {
		if(type.equals("Korean")) {
			return new KoreanParser();
		} else {
			return new EnglishParser();
		}
	}
}
