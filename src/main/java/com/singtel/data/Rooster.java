package com.singtel.data;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {

	static Map<String, String> lang;

	static {
		lang = new HashMap<String, String>();
		lang.put("Danish", "kykyliky");
		lang.put("Dutch", "kukeleku");
		lang.put("Finnish", "kukko kiekuu");
		lang.put("French", "cocorico");
		lang.put("German", "kikeriki");
		lang.put("Greek", "kikiriki");
		lang.put("Hebrew", "coo- koo - ri-koo");
		lang.put("Hungarian", "kukuriku");
		lang.put("Italian", "chicchirichi");
		lang.put("Japanese", "ko - ke - kok - ko -o");
		lang.put("Portuguese", "cucurucu");
		lang.put("Russian", "kukareku");
		lang.put("Swedish", "kuckeliku");
		lang.put("Turkish", "kuk-kurri-kuuu");
		lang.put("Urdu", "kuklooku");
		lang.put("Filipino", "tik talaok");
	}

	@Override
	public boolean sing() {
		System.out.println("Cock-a-doodle-doo");
		return true;
	}

	public String sing(String language) {
		String defLang = null;
		if (null == lang || lang.isEmpty()) {
			defLang = "Cock-a-doodle-doo";
		} else {
			defLang = lang.get(language);
		}
		System.out.println(defLang);
		return defLang;
	}
	
	public static void main(String[] args) {
		Rooster roo = new Rooster();
		roo.sing("Filipino");
	}
}
