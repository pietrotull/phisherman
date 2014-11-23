package ch.swisscom.phisherman;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.after;
import static ch.swisscom.phisherman.JsonTransformer.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
	final static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		UrlCheckService phishingService = new UrlCheckService();

		get("/hello", (req, res) -> "Hello World");

		get("/api/url", (req, res) -> {
			log.info("url: " + req.queryParams("url"));
			return phishingService.checkUrl("http://www.google.com");
		}, json());

		after((req, res) -> {
			res.type("application/json");
		});
	}
}
