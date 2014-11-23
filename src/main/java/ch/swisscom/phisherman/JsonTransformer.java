package ch.swisscom.phisherman;

import spark.ResponseTransformer;

import com.google.gson.Gson;

public class JsonTransformer {
	public static String toJson(Object object) {
		return new Gson().toJson(object);
	}

	public static ResponseTransformer json() {
		return JsonTransformer::toJson;
	}
}
